package chapter16.class_part2;

class AA {		//AA는 B의 외부 클래스
	int i = 100;
	BB b = new BB();
	
	//BB클래스를 AA클래스 안에서만 사용하려고 하면 안에다가 집어넣는다
	//AA의 멤버에 접근이 용이해짐, AA에서만 사용될 거면 불필요한 부분이 밖으로 드러나지 않았으므로 "캡슐화"
	class BB {	//BB는 AA의 내부 클래스
		void method() {
			i += 100;
			//BB클래스에서 AA클래스의 멤버를 사용하기 위해서는
			AA a = new AA();
			System.out.println(a.i);
			System.out.println(i);		//객체 생성없이 멤버에 바로 접근
		}
	}
}

//class CC {
//	AA.BB b = new AA.BB();
//}

public class C139_innerClass1 {

	public static void main(String[] args) {
//		BB b = new BB();	// 내부클래스에 접근 불가
//		b.method();
		
		AA a = new AA();
		a.b.method();
	}

}
