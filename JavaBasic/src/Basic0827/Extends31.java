package Basic0827;

//ex31 ���)
class Animal31{
	void m2() {
		System.out.println(2);
	}
	void m3() {
		System.out.println(31);
	}
}
class Tiger31 extends Animal31{ //Tiger �� Animal �̴�. B is A ����
	void m1() {
		System.out.println(1);
	}
	void m3() {
		System.out.println(32);
	}
	void m4() {
		super.m3(); // �θ� Ŭ������ m3 �Լ��� ȣ��
		System.out.println(4);
	}
}
public class Extends31{
	
	public static void main(String[] args) {
		Animal31 t1 = new Animal31();
		Tiger31 t2 = new Tiger31();
		t2.m1();
		t2.m2(); // Tiger Ŭ������ m2�� �����Ƿ� �θ� Ŭ�������� ã��
		t2.m3(); // Tiger Ŭ������ m3�� �����Ƿ� �θ� Ŭ���� �Լ��� ������� ����
		t2.m4(); // super�� ����Ͽ� ��ȸ�ؼ� �θ� Ŭ������ �Լ� ���
		
	}
}