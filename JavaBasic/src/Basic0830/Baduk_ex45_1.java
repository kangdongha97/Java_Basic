package Basic0830;

//ex45 - 1)
//문제점 : 인공지능이 바뀐다면 어떻게 할 것인가?
class Baduk45_1{
	Baduk45_1(){
		System.out.println("대국을 시작합니다.");
	}
	void play() {
		System.out.println("인공지능은 알파고입니다.");
	}
}
public class Baduk_ex45_1{
	
	public static void main(String[] args) {
		Baduk45_1 baduk = new Baduk45_1();
		baduk.play();
	}
}
