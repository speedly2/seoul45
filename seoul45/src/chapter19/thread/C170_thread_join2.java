package chapter19.thread;

public class C170_thread_join2 {

	public static void main(String[] args) {
		Memory mem = new Memory(16);
		DownLoad down = new DownLoad(mem);
		Play play = new Play(mem);
		
		down.start();
		play.start();
		
		try {
			down.join();
			play.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("다운로드가 완료되었습니다. 전송을 시작합니다.");
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
				for (int chunk = 0;chunk < 2;chunk++) {
					mem.buffer[off+chunk] = off+chunk;
					mem.progress = off+chunk+1;
					try { Thread.sleep(200); } catch (InterruptedException e) { ; }
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
