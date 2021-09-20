package Basic0901;

//ex65 스레드 원리, 업캐스팅, 오버라이딩)
class A65{
	void start() {
		System.out.println("start call");
		run(); // 업캐스팅 되어있어 자식을 쳐다봄
	}
	void run() {
		System.out.println("A run call");
	}
}
class B65 extends A65{
	void run() {
		System.out.println("스레드 시작");
		System.out.println("B run call");
		System.out.println("스레드 종료");
	}
}
public class Thread65{
	
	public static void main(String[] args) {
	
		A65 a = new B65();
		a.start();
		
	}
}
