package chapter11.object;

class Student {
	String name;
	int stdNum;
	
	Student() {	}
	Student(String name, int stdNum) {
		this.name = name;
		this.stdNum = stdNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (this.stdNum != other.stdNum)
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		return this.stdNum;
	}
	
}
public class C088_hashcode {

	public static void main(String[] args) {

		Student st1 = new Student("홍길동", 20240001);
		Student st2 = new Student("홍길동", 20240001);
		Student st3 = st1;
		Student st4 = new Student("홍길동", 20240003);
		
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);
		
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
	}

}
