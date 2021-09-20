package Basic0826;

//ex23 오버로딩)
class MethodOver{
	// 함수 인수의 개수가 다르거나 인수의 타입이 다를 경우 같은 이름의 함수를 사용할 수 있다.
	void method01() {
		System.out.println(1);
	}
	void method01(int a) {
		System.out.println(2);
	}
	void method01(int a, int b) {
		System.out.println(3);
	}
	void method01(String a) {
		System.out.println(a);
	}
	int getAreaRect(int w, int h) { // 카멜 표기법
		return w*h; 
	}
	int getAreaRect(int l) {
		return l*l;
	}
}
public class Overloading23 {

	public static void main(String[] args) {
		MethodOver t = new MethodOver();
		t.method01();
		t.method01(1);
		t.method01(1, 1);
		t.method01("호랑이");
		System.out.println("----------------------");
		System.out.println(t.getAreaRect(5, 4));
		System.out.println(t.getAreaRect(5));
	}

}
