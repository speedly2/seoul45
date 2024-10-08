package chapter14.exception;

public class C119_exception2 {

	public static void main(String[] args) {
		// 다중 예외 처리
		int a, b, c;
		a = 5;
		b = 2;
		int[] ar= {1,2,3,4,5};
		
		try {
			c= a / b;
			System.out.println("c = " + c);
			ar[5] = 100;
		}
		/*
			Exception 의 상위관계 설명
			
			Exception
			RuntimeException						IOException
			IndexOutOfBoundsException				FileNotFoundException
			ArrayIndexOutOfBoundsException						
		 */
		catch (ArithmeticException e) {
			System.out.println("0으로 나누기 예외 발생");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("첨자가 배열 범위를 넘어섰습니다.");
//			System.out.println(e.getMessage());
//			e.printStackTrace(System.out);
		}
		catch (Exception e) {
			// 예외가 발생한 지점까지의 스택 트레이스를 출력합니다. 
			// 스택 트레이스는 예외가 발생하기까지 호출된 메서드들의 목록을 포함하며, 프로그램의 현재 실행 위치와 오류가 발생한 위치를 알려줍니다.
			// 보통 디버깅할 때 예외의 발생 원인과 위치를 파악하는 데 유용합니다.
			// e.printStackTrace()는 Java에서 예외가 발생했을 때 해당 예외가 발생한 위치와 호출 스택(Call Stack)의 흐름을 출력하는 데 사용되는 메서드
			e.printStackTrace();
			// 스택 트레이스를 지정된 PrintStream(예: System.out)에 출력합니다.
			e.printStackTrace(System.out);
			// 예외에 대한 상세 메시지를 반환
			System.out.println(e.getMessage());
			/*
			 	printStackTrace()의 활용
				디버깅: printStackTrace()는 코드의 어느 부분에서 예외가 발생했는지 정확하게 확인할 수 있어 디버깅에 매우 유용합니다. 
				     특히 복잡한 메서드 호출이 중첩된 상황에서 오류의 원인을 추적하는 데 중요합니다.
				로그 기록: 많은 애플리케이션에서는 printStackTrace()의 출력을 로그 파일로 기록하여 나중에 분석할 수 있도록 합니다. 
				       이를 통해 발생한 예외의 정보를 시스템 운영 중에도 추적할 수 있습니다.
				예외의 원인 분석: Caused by 구문을 통해 예외가 발생한 원인을 더 깊이 분석할 수 있습니다. 
				            예를 들어, 네트워크 연결 실패가 특정 메서드에서 발생했는지 확인할 수 있습니다.
			 */
		}
		System.out.println("프로그램 실행 완료");
	}

}
