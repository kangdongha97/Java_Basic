package Basic0830;

//ex47 exception �߻� �������� ������ ���ϴ� ���, throw, throws)
//����ڰ� ���� �ľ��ؼ� �̿��϶�� unhandled exception ���� �������
class Tiger47{
	void m1() {
		System.out.println(1);
		
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception �߻���");
		}
	}
	
	void m2() throws Exception { // �Լ� ȣ���ϴ� ������ ���ܸ� �ٷ�����
		System.out.println(2);
		throw new Exception();

	}
}
public class Throw47{
	
	public static void main(String[] args) {
		Tiger47 t1 = new Tiger47();
		t1.m1();
		// unhandled exception ���� ���ѱ�
		try {
			t1.m2();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(3);
		
		
	}
}
