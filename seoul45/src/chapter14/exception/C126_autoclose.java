package chapter14.exception;

import java.util.Scanner;

/*
	AutoCloseable, Closeable은 Java 7에서 도입된 인터페이스로, 
	리소스를 사용하는 객체들이 더 이상 필요하지 않을 때 자동으로 자원을 해제할 수 있도록 하는 메커니즘을 제공합니다. 
	이 인터페이스는 특히 try-with-resources 구문에서 사용되어, 
	코드에서 명시적으로 close() 메서드를 호출하지 않아도 자동으로 리소스를 안전하게 해제할 수 있게 해줍니다.
	
	AutoCloseable vs Closeable
		AutoCloseable은 Java 7에서 도입된 인터페이스이고, 그 하위 인터페이스인 Closeable은 이전부터 존재했습니다.
		Closeable은 IOException을 던지는 close() 메서드를 정의하며, 주로 I/O 관련 클래스에서 사용됩니다.
		반면, AutoCloseable의 close() 메서드는 Exception을 던질 수 있어서 더 넓은 범위의 예외를 처리할 수 있습니다.
	
	AutoCloseable 인터페이스는 단 하나의 메서드만 정의
	이 메서드는 자원을 해제하는 로직을 구현하기 위해 사용됩니다. 예를 들어, 파일을 닫거나 데이터베이스 연결을 종료할 때 이 메서드를 구현합니다.
	
	리소스 해제 자동화:
		AutoCloseable을 구현한 객체는 try-with-resources 구문을 사용할 때, try 블록이 끝나면 자동으로 close() 메서드가 호출됩니다.
		자원을 사용하는 코드에서 예외가 발생하더라도 close()가 자동으로 호출되기 때문에 리소스 누수를 방지할 수 있습니다.
	
	AutoCloseable은 Java에서 리소스 관리의 효율성을 높이고, "코드의 명확성과 안전성을 개선하는 데 중요한 역할"을 합니다. 
	try-with-resources 구문과 함께 사용하면, 명시적으로 리소스를 해제하는 코드를 작성할 필요 없이 자원 누수를 방지할 수 있습니다.
 */
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
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("입력: ");
			int num = scan.nextInt();
			System.out.println(num);
		}
		
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("입력: ");
			int num = scan.nextInt();
			System.out.println(num);
		} catch(Exception e) {
			
		} finally {
			scan.close();
		}
	}

}
