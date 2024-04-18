package chapter08.inheritance;

public class C077_has_a {

	public static void main(String[] args) {
/*
		has a relation
		포함, 구성 관계
 */
		Human5 h = new Human5("파이어스틸");
		System.out.println(h.tool.name);
		h.use();
	}

}

class Human5 {
	Tool tool;

	Human5(String toolName) {
		tool = new Tool(toolName);
	}
	
	void use() {
		System.out.println(tool.name + "을/를 사용하다");
	}
}

class Tool {
	String name;
	
	Tool(String name) {
		this.name = name;
	}
}