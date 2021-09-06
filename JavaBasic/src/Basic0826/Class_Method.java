package Basic0826;

//ex18 메소드 4가지)
//자주사용되는 코드를 저장하여 호출하여 사용
class Method{
	void merry() {
		System.out.println("멍");
	}
	// int num = 3 파라미터 받음
	void happy(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("왕");
		}
	}
	int turtle() {
		System.out.println("turtle call");
		return 15;
	}

	int fish(int num) {
		int n = num * 3;
		return n;
	}

}
public class Class_Method {

	public static void main(String[] args) {
		Method t = new Method(); // new 단축키 사용가능
		t.merry();
		t.merry();
		t.merry();
		for (int i = 0; i < 10; i++) {
			t.merry();
		}
		System.out.println("--------------------------------");

		t.happy(3); //d 인수전달
		System.out.println("--------------------------------");

		int num = t.turtle();
		System.out.println(num);
		System.out.println(t.turtle());
		System.out.println("--------------------------------");
		System.out.println(t.fish(2));
		int ct = t.fish(2);
		System.out.println(ct);
		//리턴값   전달인수
		//  x      x
		//  x      o
		//  o      x
		//  o      o
	}
}
