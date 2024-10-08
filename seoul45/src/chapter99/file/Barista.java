package chapter99.file;

class Coffee { }

public class Barista {
	// 1
	Coffee c;

	// 2
	public Barista(Coffee c) {
		this.c = c;
	}
	
	// 3
	public void setCoffee(Coffee c) {
		this.c = c;
	}
}



