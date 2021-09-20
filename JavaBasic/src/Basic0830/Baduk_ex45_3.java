package Basic0830;

//ex45 - 3)
//문제점해결 : 새로운 클래스를 만들때 마다 함수를 만들어야함 > 인터페이스화 시킴 > 업캐스팅으로 사용
//문제점 : stop 함수의 추가
class Baduk45_3{
	Baduk45_3(){
		System.out.println("대국을 시작합니다.");
	}
	void play(Ai45_3 ai) {
		ai.play();
	}
}
interface Ai45_3{
	void play();
}
//구글에서 만듦
class Alphago45_3 implements Ai45_3{
	public void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
}
//아마존에서 만듦
class Betago45_3 implements Ai45_3{
	public void play() {
		System.out.println("인공지능은 베타고입니다.");
	}
}
public class Baduk_ex45_3{
	
	public static void main(String[] args) {
		Baduk45_3 baduk = new Baduk45_3();
		baduk.play(new Alphago45_3());
		baduk.play(new Betago45_3());
	}
}
