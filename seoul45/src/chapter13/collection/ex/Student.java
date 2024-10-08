package chapter13.collection.ex;

public class Student implements Comparable<Student>{

	//멤버 변수
	public static int serialNum = 20241000;
	private int stdNo;			//학번
	private String stdName;		//이름
	private String major;		//전공
	
	//인스턴스 초기화 블럭
	{
		serialNum++;
	}
	
	//기본 생성자
	public Student() {}

	//명시적 생성자
	public Student(String stdName, String major) {
		this.stdNo = serialNum;
		this.stdName = stdName;
		this.major = major;
	}

	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getStdNo() {
		return this.stdNo;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "[학번: " + stdNo + "] 이름: " + stdName + ", 전공: " + major;
	}

	@Override
	public int hashCode() {
		return this.stdNo;
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
		if (stdNo != other.stdNo)
			return false;
		return true;
	}
	
	// 두 객체를 비교하여 음수, 0, 양수 중 하나를 반환. 이 반환 값에 따라 두 객체의 상대적인 순서가 결정
	@Override
	public int compareTo(Student s) {
		return this.stdNo - s.stdNo;
	}
}
