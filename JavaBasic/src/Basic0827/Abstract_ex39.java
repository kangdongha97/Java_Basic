package Basic0827;

//ex39 �߻�Ŭ���� Ȱ��)
abstract class ��������39{
	void Į() {
		System.out.println("Į�� �� ����ϴ�.");
	}
	abstract void ����();
}

class ���׳�1_39 extends ��������39{
	void ����() {
		System.out.println("���и� �� ����ϴ�.");
	}
}

class ���׳�2_39 extends ��������39{
	// ����Ű ���
	// ������μ� > ���α׷��Ӱ� �Ǽ��� �� �ִ� ��Ȳ�� �̿��� ����
	@Override
	void ����() {
		// TODO Auto-generated method stub
		System.out.println("���и� ���� �� ����ϴ�.");
	}
}

public class Abstract_ex39{
	
	public static void main(String[] args) {
		���׳�1_39 t1 = new ���׳�1_39();
		t1.Į();
		t1.����();
		���׳�2_39 t2 = new ���׳�2_39();
		t2.Į();
		t2.����();
	}
}