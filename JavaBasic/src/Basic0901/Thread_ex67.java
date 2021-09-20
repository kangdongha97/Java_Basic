package Basic0901;

import java.util.Scanner;

//ex67 스레드, 스캐너
//window > show View > other > debug 스레드 관리

class Tiger67 extends Thread{
	public void run() {
		
		Thread t = new Lion67();
		t.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Tiger start");
		int i = sc.nextInt();
		// 블로킹 함수를 실행했을 때 블로킹 상태에 의해
		// 뒤 쪽 코드을 실행하기 전에 스레드가 제어권을 타 스레드에 넘겨버리는 경우도 있음
		// 이 경우 타 스레드의 코드가 실행될 때 같이 실행됨 
		
		System.out.println("Tiger end" + i);
	
	}

}
class Lion67 extends Thread{
	public void run() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lion start");
		int i = sc.nextInt();
		
		System.out.println("Lion end" + i);
	
	}
}
public class Thread_ex67{
	public static void main(String[] args) {
		
		
		Thread t = new Tiger67();
		t.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("main start");
		int i = sc.nextInt(); // 블로킹 함수 특정 행위를 하지 않을 시 계속 대기상태
		
		System.out.println("main end" + i);
	}
}
