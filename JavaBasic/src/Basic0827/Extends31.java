package Basic0827;

//ex31 상속)
class Animal31{
	void m2() {
		System.out.println(2);
	}
	void m3() {
		System.out.println(31);
	}
}
class Tiger31 extends Animal31{ //Tiger 는 Animal 이다. B is A 구조
	void m1() {
		System.out.println(1);
	}
	void m3() {
		System.out.println(32);
	}
	void m4() {
		super.m3(); // 부모 클래스의 m3 함수를 호출
		System.out.println(4);
	}
}
public class Extends31{
	
	public static void main(String[] args) {
		Animal31 t1 = new Animal31();
		Tiger31 t2 = new Tiger31();
		t2.m1();
		t2.m2(); // Tiger 클래스에 m2가 없으므로 부모 클래스에서 찾음
		t2.m3(); // Tiger 클래스에 m3가 있으므로 부모 클래스 함수는 사용하지 않음
		t2.m4(); // super를 사용하여 우회해서 부모 클래스의 함수 사용
		
	}
}