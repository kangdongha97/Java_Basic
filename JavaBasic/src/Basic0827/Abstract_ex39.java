package Basic0827;

//ex39 추상클래스 활용)
abstract class 대장장이39{
	void 칼() {
		System.out.println("칼을 잘 만듭니다.");
	}
	abstract void 방패();
}

class 나그네1_39 extends 대장장이39{
	void 방패() {
		System.out.println("방패를 잘 만듭니다.");
	}
}

class 나그네2_39 extends 대장장이39{
	// 단축키 사용
	// 어노테인션 > 프로그래머가 실수할 수 있는 상황을 미연에 방지
	@Override
	void 방패() {
		// TODO Auto-generated method stub
		System.out.println("방패를 완전 잘 만듭니다.");
	}
}

public class Abstract_ex39{
	
	public static void main(String[] args) {
		나그네1_39 t1 = new 나그네1_39();
		t1.칼();
		t1.방패();
		나그네2_39 t2 = new 나그네2_39();
		t2.칼();
		t2.방패();
	}
}