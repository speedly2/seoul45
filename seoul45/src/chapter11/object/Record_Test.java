package chapter11.object;

public record Record_Test(String name, String pw) {

	// 사용자 정의 생성자를 만들 수 있으나 직접 초기화해줘야 함
	public Record_Test(String name) {
		this(name, "1234");
	}
	
	public Record_Test() {
		this("name", "1234");
	}
}
