package Basic0827;

//ex41 ���� ���)
//Ŭ������ �ϳ��� Ŭ������ ��Ӱ���������, �������̽��� ������ ����� �� ���� > ���� ��� ����
class A41{
	void m1() {
		System.out.println(1);
	}
}

interface B41{
	void m2(); // �ڵ尡 ���� �Լ� > �Լ� ���� or �Լ� ������Ÿ��
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

@FunctionalInterface // �Լ� ������ 1�����϶�� ��, �������̽� �и� ��Ģ
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
		Thread t2 = null; // ��ü�� �ƴ��� ����
		String s = null;
		StringBuffer sf = null;
	}
}