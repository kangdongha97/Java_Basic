package Basic0901;

//ex56 �����Լ��� ����
interface Test1_56{
	void m1();
}

interface Test2_56{
	void m1(int num);
}

interface Test3_56{
	int m1();
}

interface Test4_56{
	String m1(int n, String s);
}


public class Lambda56{
	
	public static void main(String[] args) {
		Test1_56 t1 = new Test1_56() {
			@Override
			public void m1() {
				System.out.println(1);
			}
		};
		t1.m1();
		System.out.println("--------------------------------------");
		
		// �����Լ� ex2) �����Լ��� �������̽� �ȿ� �Լ��� 1���ۿ� ���ٴ� ������ �ΰ� ���
		Test1_56 t2 = () -> {
			System.out.println(2);

		};
		t2.m1();
		
		// �μ������� �ִ� �����Լ� ex3)
		Test2_56 t3 = (n) -> {
			System.out.println(n);
		};
		t3.m1(100);
		System.out.println("--------------------------------------");
		// ������ �ִ� �����Լ� ex4) ���� Ű���� �ۼ�
		Test3_56 t4 = () -> {
			System.out.println(3);
			return 100;
		};
		
		System.out.println(t4.m1());
		
		System.out.println("--------------------------------------");
		// ���ϰ� �μ����� �Ѵ� �ִ� ���� �Լ� ex5)
		Test4_56 t5 = (n, s) -> {
			System.out.println(n + s);
			return n + s;
		};
		System.out.println(t5.m1(200, "ȣ����"));
	
		System.out.println("--------------------------------------");
		// �����Լ� ex6 ������ ������ ����, {} ���� �����ؾ���)
		// �ڵ尡 �����̰�, �μ�����, ���ϸ� �ִ� ���¿��� ��밡��
		Test3_56 t6 = () -> 100;
		System.out.println(t6.m1());
		
		
	}
}
