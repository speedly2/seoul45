package chapter06.class_part1;

public class Character {
	//캐릭터 정보
	private String id;			//id
	private String job;			//직업
	private int level;			//레벨
	private int str;			//힘 스탯
	private int dex;			//민첩 스탯
	private int intel;			//지능 스탯
	
	{
		this.level = 1;
		this.str = 1;
		this.dex = 1;
		this.intel = 1;
	}
	
	//명시적 생성자 (주요 정보)
	public Character(String id, String job) {
		this.id = id;
		this.job = job;
	}

	//명시적 생성자2 (전체 정보)
	public Character(String id, String job, int level, int str, int dex, int intel) {
		this.id = id;
		this.job = job;
		this.level = level;
		this.str = str;
		this.dex = dex;
		this.intel = intel;
	}
	
	public void skill() {
		if(this.job.equals("마법사"))
			System.out.println("파이어볼!!");
		else if(this.job.equals("전사"))
			System.out.println("배쉬!!");
		else if(this.job.equals("궁수"))
			System.out.println("크리티컬 샷!!");
		else
			System.out.println("기본공격!!");
	}
	
	@Override
	public String toString() {
		return "["+id+"("+job+") Lv"+level+"]님의 스탯: str("+str+"), dex("+dex+"), intel("+intel+")";
	}
}
