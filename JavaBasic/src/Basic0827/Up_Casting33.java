package Basic0827;

//ex33 ������ ����, ��ĳ����)
class Animal33{
	Animal33(){
		
	}
	void m1() {
		System.out.println(1);
	}
	void m3() {
		System.out.println(31);
	}
}
class Tiger33 extends Animal33{
	Tiger33(){
		
	}
	void m2() {
		System.out.println(2);
	}
	void m3() {
		System.out.println(32);
	}
}

public class Up_Casting33{
	
	public static void main(String[] args) {
		Animal33 t1 = new Animal33();
		Tiger33 t2 = new Tiger33();
		Animal33 t3 = new Tiger33(); // ��ĳ����
		// Tiger t4 = new Animal(); ����, ������� ���� �ٿ�ĳ����
		t3.m1(); // Animal �������� ��ü�� �����߱� ������ m2 ��� �Ұ�
		// ��ĳ������ ����
		// �ڽ� Ŭ������ �ش� �Լ��� �ִ��� Ȯ�� �� ������ �θ� Ŭ������ m3 ȣ��, ������ �ڽ��� m3 ȣ��
		// ���� ����� ���� �θ� Ŭ������ �ڽ� Ŭ���� �޸� �� �� Ȯ��
		t3.m3();
	}
}
