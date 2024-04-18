package chapter09.polymorphism;

class Animal {
	void move() { System.out.println("동물이 움직입니다."); }
}

class Human extends Animal{
	void move() { System.out.println("사람이 두발로 움집입니다."); }
}

class Tiger extends Animal{
	void move() { System.out.println("호랑이가 네발로 뜁니다."); }
}

class Eagle extends Animal{
	void move() { System.out.println("독수리가 하늘을 납니다."); }
}

public class C078_polymorphism {

	public static void main(String[] args) {
		
		//내부클래스 객체화
		C078_polymorphism animal = new C078_polymorphism();
		
		animal.moveAnimal(new Animal());
		animal.moveAnimal(new Human());
		animal.moveAnimal(new Tiger());
		animal.moveAnimal(new Eagle());		

	}

	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
