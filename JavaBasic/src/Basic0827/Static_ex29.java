package Basic0827;

//ex29 static�� class ����)
class StaticEX29{
	StaticEX29(){
		
	}
	static void myMain() {
		StaticEX29 t = new StaticEX29();
		t.m1(); // m1�� static�� �ƴϱ⶧���� ��ü�� �����Ͽ� ���
		// m1(); static�� �ƴϱ⶧���� ��ü�������� �ʰ�� ��� �Ұ� 
	}
	void m1() {
		
	}
}

public class Static_ex29{
	
	static int num = 10;
	
	Static_ex29(){
		
	}
	
	static void m1() {
		System.out.println("1�� call");
	}
	
	// main�� static�� ���ٸ� �ü���� main�� ȣ������ ���� ��ü�����������ϱ� ������
	public static void main(String[] args) {
		System.out.println(num); // static ��� �ȿ����� static ����� ��밡��
		m1(); // static �Լ� �ȿ����� static ����� ��밡��
		Static_ex29 h = new Static_ex29();
		h.m2(); // �Լ��� static�� �ƴҰ�� ��ü�� �����Ͽ� ��밡��
		Static_ex29.m1(); // static �̱⶧���� ��ü���� ���� �ʰ� ��밡��
		// Hello.m2(); static�� �ƴϱ� ������ ���Ұ�
	}
	
	void m2() {
		System.out.println("2�� call");
	}
	
}
