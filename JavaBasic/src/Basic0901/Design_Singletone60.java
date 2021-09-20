package Basic0901;

//ex60 ���������� - �̱������� �ϳ��� Ŭ������ �ϳ��� ��ü�� ������ �� �ִ� ����)
//��ü �ϳ��� ���鶧 ����� ���̵�ų� �ΰ��̻��� ��ü�� �ʿ���� ���� Ȱ��
class Tiger60{
	
	int num;
	private static Tiger60 instance = null; // ��ü�� �ƴ϶�� ���� �ǹ� (��ü ������)
	
	private Tiger60(){} // private ������ �ܺο��� ȣ�� �Ұ� > ��ü���� �Ұ�
	
	static Tiger60 getInstance() { // static �Լ��ȿ����� static ������ ��밡��
		if(instance == null) {
			System.out.println(1);
			instance = new Tiger60();
	
		}
		return instance;
	}
	
	void m1() {
		
	}
}
public class Design_Singletone60{
	
	public static void main(String[] args) {
		
		//Tiger t1 = new Tiger();
		//Tiger t2 = new Tiger();
		Tiger60 t1 = Tiger60.getInstance(); // static
		Tiger60 t2 = Tiger60.getInstance(); // if���� ���� �����ȵ�
	
		System.out.println(t1.hashCode()); // t1, t2 ���� ���� ��ü
		System.out.println(t2.hashCode());
		
		t1.m1();
		t2.m1();
		
		t1.num = 2000;
		System.out.println(t1.num);
		System.out.println(t2.num); // ���� ���� ��ü
		
	}
}