package chapter14.exception;

class NetAccess implements AutoCloseable {
	public void open() 	{ System.out.println("접속");		}
	public void send() 	{ System.out.println("전송");		}
	public void close() { System.out.println("해제");		}
}

public class C126_autoclose {

	public static void main(String[] args) {
		try (NetAccess na = new NetAccess()) {
			na.open();
			na.send();
		}
	}

}
