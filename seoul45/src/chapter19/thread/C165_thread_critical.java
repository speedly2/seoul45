package chapter19.thread;

public class C165_thread_critical {

	public static void main(String[] args) {
		Memory mem = new Memory(16);
		DownLoad down = new DownLoad(mem);
		Play play = new Play(mem);
		
		down.start();
		play.start();
	}
	
	static class Memory {
		int[] buffer;
		int size;
		int progress;
		Memory(int asize) {
			size = asize;
			buffer = new int[asize];
			progress = 0;
		}
	}

	static class DownLoad extends Thread {
		Memory mem;
		DownLoad(Memory amem) {
			mem = amem;
		}
		public void run() {
			for (int off = 0;off < mem.size;off += 2) {
				//쉽게 말해서 한 스레드가 synchronized 메소드를 호출하는 순간, 
				//모든 synchronized 메소드에 lock이 걸리므로 다른 스레드가 어떠한 synchronized 메소드를 호출할 수 없다. 
				//(단, 일반 메소드는 호출 가능)
				synchronized(mem) {
					for (int chunk = 0;chunk < 2;chunk++) {
						mem.buffer[off+chunk] = off+chunk;
						mem.progress = off+chunk+1;
						try { Thread.sleep(200); } catch (InterruptedException e) { ; }
					}
				}
			}
		}
	}

	static class Play extends Thread {
		Memory mem;
		Play(Memory amem) {
			mem = amem;
		}
		public void run() {
			for (;;) {
				synchronized(mem) {
					for (int off = 0;off < mem.progress;off++) {
						System.out.print(mem.buffer[off] + " ");
					}
					System.out.println();
				}
				if (mem.progress == mem.size) break;
				try { Thread.sleep(500); } catch (InterruptedException e) { ; }
			}
		}
	}
}
