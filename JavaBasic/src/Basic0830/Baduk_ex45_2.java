package Basic0830;

//ex45 - 2)
//문제점해결 : 인공지능이 바뀐다면 어떻게 할 것인가? > 오버로딩
//문제점 : 새로운 클래스를 만들때 마다 함수를 만들어야함
class Baduk45_2{
	Baduk45_2(){
		System.out.println("대국을 시작합니다.");
	}
	void play(Alphago45_2 alphago) { // 오버로딩
		alphago.play();
	}
	void play(Betago45_2 betago) { // 오버로딩
		betago.play();
	}
}
//구글에서 만듦
class Alphago45_2{
	void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
}
//아마존에서 만듦
class Betago45_2{
	void play() {
		System.out.println("인공지능은 베타고입니다.");
	}
}
public class Baduk_ex45_2{
	
	public static void main(String[] args) {
		Baduk45_2 baduk = new Baduk45_2();
		baduk.play(new Alphago45_2());
		baduk.play(new Betago45_2());
	}
}
