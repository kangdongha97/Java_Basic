package Basic0827;

//ex40 �������̽� ���� ����)
interface �ѱ�����40{
	void �Ա�();
	void ���();
	void ��ü();
	void ����();
}

class ��������40 implements �ѱ�����40{
	@Override
	public void �Ա�() {
		// TODO Auto-generated method stub
		System.out.println("�������� 3% �Դϴ�.");
	}@Override
	public void ���() {
		// TODO Auto-generated method stub
		
	}@Override
	public void ��ü() {
		// TODO Auto-generated method stub
		
	}@Override
	public void ����() {
		// TODO Auto-generated method stub
		
	}
	
}
class �츮����40 implements �ѱ�����40{
	@Override
	public void �Ա�() {
		// TODO Auto-generated method stub
		System.out.println("�������� 5% �Դϴ�.");
	}@Override
	public void ���() {
		// TODO Auto-generated method stub
		
	}@Override
	public void ��ü() {
		// TODO Auto-generated method stub
		
	}@Override
	public void ����() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Interface_Bank_ex40{
	
	public static void main(String[] args) {
		�ѱ�����40 t1 = new ��������40();
		�ѱ�����40 t2 = new �츮����40();
		t1.�Ա�();
		t2.�Ա�();
	}
}
