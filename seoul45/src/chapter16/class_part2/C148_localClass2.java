package chapter16.class_part2;

class Human5 {
	int age;
	String name;
	
	Human5(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void intro() {
		final String nameCaption = "이름";
		final String ageCaption = "나이";
		
		class Formatter {
			void outInfo() {
				System.out.println(nameCaption + " : " + name);
				System.out.println(ageCaption + " : " + age);
			}
		}
		
		Formatter format = new Formatter();
		format.outInfo();
	}
}

public class C148_localClass2 {

	public static void main(String[] args) {
		Human5 kim = new Human5(29, "김상형");
		kim.intro();
	}

}
