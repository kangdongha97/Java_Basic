package Basic0901;

//ex68 Thread Ŭ���� ������� ����)

public class Thread_ex68{
	
	public static void main(String[] args) {
		// Thread Ŭ������ �������̽��̱� ������ �Ʒ��� ���� ���
		Thread t = new Thread() {
			public void run() {
				System.out.println(1);
			}
		};
		t.start();
		
		
		// �� �ڵ�� ����
		new Thread() {
			public void run() {
				System.out.println(1);
			}
		}.start();
		
	}
}
