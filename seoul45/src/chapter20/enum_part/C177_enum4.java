package chapter20.enum_part;

import java.util.Arrays;
import java.util.List;

public class C177_enum4 {

	public static void main(String[] args) throws Exception {
		CreditCard card;
		card= CreditCard.SHINHAN;
		
		System.out.println(card.name());
		System.out.println(card.ordinal());
		card.getCard();
	}
}

enum CreditCard {
	//enum 상수 하나당 자신의 인스턴스를 하나씩 만들어 public static final 필드로 공개하기 때문
    SHINHAN("신한", Arrays.asList("Mr.Life 카드", "Deep Dream 카드", "Deep Oil 카드")),
    KB	   ("국민", Arrays.asList("톡톡D 카드", "티타늄 카드", "다담 카드")				  ),
    NH     ("농협", Arrays.asList("올바른 FLEX 카드", "테이크 5 카드", "NH 올원 파이카드")   );

    private final String enterprise;
    private final List<String> cards;

    /*
     * 기본: private (다른 접근지정자는 컴파일 에러)
     * 생성자 자체가 private 접근제어자 이기 때문에, 
     * 밖에서 접근할 수 있는 생성자를 제공하지 않으므로 사실상 final이 되게 된다. 
     * 그래서 클라이언트가 인스턴스를 직접 생성하거나 확장할 수 없으니 
     * 열거 타입 선언으로 만들어진 인스턴스들은 딱 하나씩만 존재함이 보장된다.
     */
    private CreditCard(String name, List<String> cards) {
        this.enterprise = name;
        this.cards = cards;
    }

    public void getCard() {
    	System.out.println("카드: " + enterprise);
    	this.cards.stream().forEach(System.out::println);
    }
}

// enum을 클래스로 표현해보면
// 	 이처럼 각 enum 객체마다 자신의 클래스를 인스턴스화 하여 저장하니 
// 	 enum을 매핑한다거나 추상메소드 확장한다거나 등 응용이 가능
class Card {
	private String card;
	public static final Card SHINHAN = new Card("SHINHAN");
	public static final Card KB 	 = new Card("KB");
	public static final Card NH 	 = new Card("NH");
	
	public Card(String cardName) {
		this.card = cardName;
	};
	
	public String getCard() {
		return card;
	}
}