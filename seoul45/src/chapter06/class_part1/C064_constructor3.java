package chapter06.class_part1;

class Product {
	static int count = 0;   // 생성된 인스턴스의 수를 저장하기 위한 변수
	int serialNo;	        // 인스턴스 고유의 번호
	
	static int snum;		// 클래스 초기화, 정적 변수	
	int num = 1;			// 명시적 초기화

/*
	클래스변수 : 클래스가 처음 로딩될 때 단 한번 초기화
	인스턴스변수 : 인스턴스가 생성될 때마다 각 인스턴스별로 초기화
	클래스변수의 초기화 순서 : 기본값 -> 명시적초기화 -> 클래스 초기화 블럭
	인스턴스변수의 초기화순서 : 기본값 -> 명시적초기화 -> 인스턴스 초기화 블럭 -> 생성자	
 */

	// 클래스 초기화 블럭
	static {
		snum = 999;
		System.out.println("static : " + snum);
	}
	// 인스턴스 초기화 블럭
	{
		++count;
		serialNo = count;
	}

	public Product() {	// 기본생성자, 생략가능
		num++;
	}     
}

public class C064_constructor3 {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();

		System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);
		System.out.println("p2의 제품번호(serial no)는 " + p2.serialNo);
		System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 "+Product.count+"개 입니다.");  
		
		System.out.println(p1.num);
	}

}
