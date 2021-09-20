package Basic0830;

//ex45 - 4)
//문제점 : 객체 호출

class Baduk45_4{
	Baduk45_4(){
		System.out.println("대국을 시작합니다.");
	}
	void play(Ai45_4 ai) {
		ai.play();
	}
	void stop(Ai45_4 ai) {
		ai.stop();
	}
}

interface Ai45_4{
	void play();
	void stop();
}

//구글에서 만듦
class Alphago45_4 implements Ai45_4{
	public void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
	public void stop() {
		System.out.println("알파고가 점수 계산을 합니다.");	
	}
}

//아마존에서 만듦
class Betago45_4 implements Ai45_4{
	public void play() {
		System.out.println("인공지능은 베타고입니다.");
	}
	public void stop() {
		System.out.println("베타고가 점수 계산을 합니다.");
		
	}
}

public class Baduk_ex45_4{
	
	public static void main(String[] args) {
		Baduk45_4 baduk = new Baduk45_4();
		baduk.play(new Alphago45_4());
		baduk.play(new Betago45_4());
		baduk.stop(new Alphago45_4());
		baduk.stop(new Betago45_4());
		
	}
}