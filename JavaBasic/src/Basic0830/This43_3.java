package Basic0830;

//ex43 - 3 this�� ��� chaining ���� ����� ������ �ڵ忡�� �ٸ� �ڵ尡 ���ԵǴ� ���� ����)
class Tiger43_3{
	Tiger43_3 m1() {
		// return new Tiger(); // ����Ÿ�� ����
		
		// Tiger t = new Tiger(); // ����Ÿ�� ����
		// return t;
		System.out.println(1);
		return this; // ����Ÿ�� ����
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
		t1.m1().m2().m1().m2().m3(); // ü�̴� chaining
		System.out.println("--------------------------");
		t1.m1().m2().m3(); // chaining�� ����ϸ� �ڵ尡 ���ԵǴ� ���� ����
		t1.m1();
		t1.m2();
		System.out.println("ȣ����"); // �ڵ尡 ���Ե�
		t1.m3();
		
	}
}
