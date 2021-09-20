package Basic0830;

//ex43 - 3 this의 용법 chaining 서로 비슷한 목적의 코드에서 다른 코드가 난입되는 것을 방지)
class Tiger43_3{
	Tiger43_3 m1() {
		// return new Tiger(); // 리턴타입 충족
		
		// Tiger t = new Tiger(); // 리턴타입 충족
		// return t;
		System.out.println(1);
		return this; // 리턴타입 충족
	}
	Tiger43_3 m2() {
		System.out.println(2);
		return this;
	}
	void m3() {
		System.out.println(3);
	}
}
public class This43_3{
	
	public static void main(String[] args) {
		Tiger43_3 t1 = new Tiger43_3();
		Tiger43_3 t2 = t1.m1();
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		t1.m1().m2().m1().m2().m3(); // 체이닝 chaining
		System.out.println("--------------------------");
		t1.m1().m2().m3(); // chaining을 사용하면 코드가 난입되는 것을 방지
		t1.m1();
		t1.m2();
		System.out.println("호랑이"); // 코드가 난입됨
		t1.m3();
		
	}
}
