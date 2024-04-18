package chapter15.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	

	/**
	 * 객체 고유 번호
	 */
	private static final long serialVersionUID = -5796917796117705757L;
	
	String name;
	transient String job;	// 직렬화 대상 제외
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + "," + job;
	}
}

public class C134_serialization {

	public static void main(String[] args) throws ClassNotFoundException {
/*
	직렬화(serialization)?
	java 에서는 기본형 데이터타입과 참조형 데이터타입이 존재
	그 중 참조형 데이터타입 같은 경우는 힙메모리에 참조 주소로써 저장되는데
	해당 데이터를 디스크에 저장하거나 통신할 경우 받는 쪽 해당 주소값은 전혀 다른 값이 존재한다.
	그래서 직렬화를 통해 각 주소값이 가지는 데이터를 값 형식 데이터로 변환한다.
	즉, 직렬화를 하는 이유는 사용하고 있는 데이터를 파일 저장 혹은 데이터 통신에서 파싱할 수 있는 유의미한 데이터를 만들기 위함.
	
	데이터 직렬화 종류
	 - CSV, XML, JSON 직렬화
	 - Binary 직렬화
	 - Java 직렬화
 */
		Person personAhn = new Person("안재용", "대표이사");
		Person personKim = new Person("김철수", "상무이사");
		
		//직렬화
		try(FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(personAhn);
			oos.writeObject(personKim);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
/*
	직렬화한 데이터를 역직렬화하면 어떻게 될까? 
	결과는 java.io.InvalidClassException 이 발생한다. 이것은 각 시스템에서 사용하고 있는 모델의 버전 차이로 인해 생기는 문제이다.
	이를 해결하기 위해서는 모델의 버전 간이 호환성을 유지하는 SUID(serialVersionUID) 를 정의해야 한다.
	* serialVersionUID를 선언하지 않으면, 내부적으로 클래스의 구조 정보를 이용하여 자동으로 생성된 해시 값이 할당된다.
	  이 때문에 클래스의 멤버 변수가 추가되거나 삭제되면 serialVersionUID가 달라진다.
 */
		//역직렬화
		try(FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)){
				Person p1 = (Person) ois.readObject();
				Person p2 = (Person) ois.readObject();
				
				System.out.println(p1);
				System.out.println(p2);
			} catch(IOException e) {
				e.printStackTrace();
			}
	}

}
