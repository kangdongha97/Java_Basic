package Basic0901;

import java.util.Scanner;

//ex67 ������, ��ĳ��
//window > show View > other > debug ������ ����

class Tiger67 extends Thread{
	public void run() {
		
		Thread t = new Lion67();
		t.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Tiger start");
		int i = sc.nextInt();
		// ���ŷ �Լ��� �������� �� ���ŷ ���¿� ����
		// �� �� �ڵ��� �����ϱ� ���� �����尡 ������� Ÿ �����忡 �Ѱܹ����� ��쵵 ����
		// �� ��� Ÿ �������� �ڵ尡 ����� �� ���� ����� 
		
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
		int i = sc.nextInt(); // ���ŷ �Լ� Ư�� ������ ���� ���� �� ��� ������
		
		System.out.println("main end" + i);
	}
}
