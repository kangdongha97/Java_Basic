package Basic0901;

//ex58 ���������ڿ� set, get)
class Tiger58{
	private int a; // Ŭ���� �������� ���� ����
	public int b;
	
	private int num;
	// set, get ���ʷ����ͷ� �ڵ����� ����
	// �μ��� �޾� private ������ ����
	public void setNum(int num) { // private�� �����ϱ� ���� ���� �޼ҵ��̸��� set ~
		this.num = num;
	}
	// private ���� ����
	public int getNum() {
		return this.num;
	}
	
	void m1() {
		a = 100;
		b = 200;
	}
	
	private void m2() {	// �Լ����� ���������ڰ� ����
		
	}
	
}
public class Access_Modifiers58{
	
	public static void main(String[] args) {
	
		Tiger58 t = new Tiger58();
		t.b = 10;
		//t.a;
		t.setNum(100);
		System.out.println(t.getNum());
	}
}
