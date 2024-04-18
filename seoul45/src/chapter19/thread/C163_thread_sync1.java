package chapter19.thread;

public class C163_thread_sync1 {

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
			for (int off = 0;off < mem.size;off++) {
				mem.buffer[off] = off;
				mem.progress = off + 1;
				try { Thread.sleep(200); } catch (InterruptedException e) { ; }
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
				for (int off = 0;off < mem.progress;off++) {
					System.out.print(mem.buffer[off] + " ");
				}
				System.out.println();
				if (mem.progress == mem.size) break;
				try { Thread.sleep(500); } catch (InterruptedException e) { ; }
			}
		}
	}
}
