package Basic0901;

//ex68 Thread 클래스 구현방법 예시)

public class Thread_ex68{
	
	public static void main(String[] args) {
		// Thread 클래스는 인터페이스이기 때문에 아래와 같이 사용
		Thread t = new Thread() {
			public void run() {
				System.out.println(1);
			}
		};
		t.start();
		
		
		// 위 코드와 같음
		new Thread() {
			public void run() {
				System.out.println(1);
			}
		}.start();
		
	}
}
