package Basic0830;

//ex45 - 5 인터페이스, injection 주입)
//문제점해결 : 객체 호출 > 생성자에서 인수전달

class Baduk45_5{
	Ai45_5 ai;
	Baduk45_5(Ai45_5 ai){
		this.ai = ai;
		System.out.println("대국을 시작합니다.");
	}
	void play() {
		ai.play();
	}
	void stop() {
		ai.stop();
	}
}

interface Ai45_5{
	void play();
	void stop();
}

//구글에서 만듦
class Alphago45_5 implements Ai45_5{
	public void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
	public void stop() {
		System.out.println("알파고가 점수 계산을 합니다.");	
	}
}

//아마존에서 만듦
class Betago45_5 implements Ai45_5{
	public void play() {
		System.out.println("인공지능은 베타고입니다.");
	}
	public void stop() {
		System.out.println("베타고가 점수 계산을 합니다.");
		
	}
}

public class Baduk_ex45_5{
	
	public static void main(String[] args) {
		Baduk45_5 baduk1 = new Baduk45_5(new Alphago45_5());
		Baduk45_5 baduk2 = new Baduk45_5(new Betago45_5());
		
		baduk1.play();
		baduk2.play();
		baduk1.stop();
		baduk2.stop();
		
	}
}
