package chapter19.thread;

public class C167_thread_syncronized {

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

		synchronized void DownChunk(int off) {
			for (int chunk = 0;chunk < 2;chunk++) {
				buffer[off+chunk] = off+chunk;
				progress = off+chunk+1;
				try { Thread.sleep(200); } catch (InterruptedException e) { ; }
			}
		}
		
		synchronized void PlayDowned() {
			for (int off = 0;off < progress;off++) {
				System.out.print(buffer[off] + " ");
			}
			System.out.println();
		}
	}

	static class DownLoad extends Thread {
		Memory mem;
		DownLoad(Memory amem) {
			mem = amem;
		}
		public void run() {
			for (int off = 0;off < mem.size;off += 2) {
				mem.DownChunk(off);
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
				mem.PlayDowned();
				if (mem.progress == mem.size) break;
				try { Thread.sleep(500); } catch (InterruptedException e) { ; }
			}
		}
	}
}
