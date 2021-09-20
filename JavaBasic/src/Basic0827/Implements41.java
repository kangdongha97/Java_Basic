package Basic0827;

//ex41 다중 상속)
//클래스는 하나의 클래스만 상속가능하지만, 인터페이스는 여러개 상속할 수 있음 > 다중 상속 구현
class A41{
	void m1() {
		System.out.println(1);
	}
}

interface B41{
	void m2(); // 코드가 없는 함수 > 함수 원형 or 함수 프로토타입
}

interface C41{
	void m3();
}

class D41 extends A41 implements B41, C41{
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println(2);
	}
	
	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println(3);
	}
}

@FunctionalInterface // 함수 원형이 1개이하라는 뜻, 인터페이스 분리 원칙
interface E41{
	void m1();
	
	//void m2();
}



public class Implements41{
	
	public static void main(String[] args) {
		D41 t = new D41();
		t.m1();
		t.m2();
		t.m3();
		Thread t2 = null; // 객체가 아님을 강조
		String s = null;
		StringBuffer sf = null;
	}
}