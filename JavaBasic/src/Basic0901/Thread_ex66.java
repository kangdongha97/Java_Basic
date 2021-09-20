package Basic0901;

//ex66 스레드
class Tiger66 extends Thread{
	public void run(){ // 2
		for (int i = 0; i < 10; i++) {
			System.out.println("호랑이" + i);
			try{
				Thread.sleep(0);
			}
			catch (Exception e) {
			}
		}
		System.out.println("종료");
	}
}
public class Thread_ex66{
	public static void main(String[] args) {
		
		Thread t = new Tiger66();
		t.start(); // 1
		
		for (int i = 0; i < 10; i++) {
			System.out.println("코끼리" + i);
			try {
				Thread.sleep(0);
			} catch (Exception e) {
			}
		}
		System.out.println("Main Exit");
	}
}
