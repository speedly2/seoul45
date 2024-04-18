package chapter06.class_part1;

class Student {
	//Student클래스를 참조하여 생성된 모든 인스턴스가 공유
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student() {
		serialNum++;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}

public class C070_static3 {

	public static void main(String[] args) {
		int a = Student.serialNum;
		System.out.println(a);
		System.out.println(Student.serialNum);
		
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum);
		
	}

}
