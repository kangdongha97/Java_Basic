package Basic0901;

//ex66 ������
class Tiger66 extends Thread{
	public void run(){ // 2
		for (int i = 0; i < 10; i++) {
			System.out.println("ȣ����" + i);
			try{
				Thread.sleep(0);
			}
			catch (Exception e) {
			}
		}
		System.out.println("����");
	}
}
public class Thread_ex66{
	public static void main(String[] args) {
		
		Thread t = new Tiger66();
		t.start(); // 1
		
		for (int i = 0; i < 10; i++) {
			System.out.println("�ڳ���" + i);
			try {
				Thread.sleep(0);
			} catch (Exception e) {
			}
		}
		System.out.println("Main Exit");
	}
}
