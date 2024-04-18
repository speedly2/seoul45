package chapter19.thread;

// java11부터 모듈화로 등록해야함, module-info.java 에서
import java.awt.*;

public class C159_thread_multi {

	public static void main(String[] args) {
		PrintThread2 worker1 = new PrintThread2('X');
		worker1.start();
		PrintThread2 worker2 = new PrintThread2('.');
		worker2.start();
		BeepThread beep = new BeepThread(5, 1000);
		beep.start();
		
		for (int num = 0;num < 30;num++) {
			System.out.print("O");
			try { Thread.sleep(200); } catch (InterruptedException e) { ; }
		}
	}

}
class PrintThread2 extends Thread {
	char ch;
	PrintThread2(char ch) {
		super();
		this.ch = ch;
	}
	public void run() {
		for (int num = 0;num < 30;num++) {
			System.out.print(ch);
			try { Thread.sleep(100); } catch (InterruptedException e) { ; }
		}
	}
}

class BeepThread extends Thread {
	int count;
	int gap;
	Toolkit tool = Toolkit.getDefaultToolkit();
	BeepThread(int count, int gap) {
		this.count = count;
		this.gap = gap;
	}
	public void run() {
		for (int num = 0;num < count;num++) {
			tool.beep();
			try { Thread.sleep(gap); } catch (InterruptedException e) { ; }
		}
	}
}