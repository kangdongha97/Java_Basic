package Basic0901;

//ex65 ������ ����, ��ĳ����, �������̵�)
class A65{
	void start() {
		System.out.println("start call");
		run(); // ��ĳ���� �Ǿ��־� �ڽ��� �Ĵٺ�
	}
	void run() {
		System.out.println("A run call");
	}
}
class B65 extends A65{
	void run() {
		System.out.println("������ ����");
		System.out.println("B run call");
		System.out.println("������ ����");
	}
}
public class Thread65{
	
	public static void main(String[] args) {
	
		A65 a = new B65();
		a.start();
		
	}
}
