package Basic0827;

//ex28 static) 
//static ����� ��ü���� ���ο� ������� �����������
//��ü���� ���� ���, �������� ����ϱ� ����
//��ü�� ������ų�� ����� ���̵� > static �� �̿��� �������

class Static_ex28{
	int num1;
	static int num2 = 100;
	
	static void m1() {
		System.out.println("static �Լ� call");
	}
}
public class Static28{
	
	public static void main(String[] args) {
		
		System.out.println(Static_ex28.num2); // ��ü�������� �ʰ� Ŭ����.��� �������� static ��� ���
		Static_ex28 t1 = new Static_ex28();
		Static_ex28 t2 = new Static_ex28();
		System.out.println(t1.num2); // �۵��� ������ �̷��� ������� ����
		t2.num2 = 200;
		System.out.println(t1.num2);
		System.out.println(Static_ex28.num2);
		Static_ex28.m1();
		// ����
		System.out.println(Math.abs(-10)); // Math Ŭ������ abs �Լ��� static���� ���ǵǾ� ������ �� �� ����
		
	}
}
