package Basic0901;

//ex62 - 2 디자인패턴 - 데코레이션, 객체가 객체를 감싸는 형태, 객체에 객체를 덧붙임, 추가)
class A62_2{
	int num = 10;
	int run() {
		System.out.println("A Run");
		return num;
	}
}
class B62_2 extends A62_2{
	int num = 20;
	A62_2 a; // 곧 사라지게 될 객체를 백업받음
	B62_2(A62_2 a){
		this.a = a;
	}
	int run() {
		System.out.println("B Run");
		return num + a.run();
	}
}
class C62_2 extends A62_2{
	int num = 30;
	A62_2 a; // 곧 사라지게 될 객체를 백업받음
	C62_2(A62_2 a){
		this.a = a;
	}
	int run() {
		System.out.println("C Run");
		return num + a.run();
	}
}
public class Design_decoration62_2{
	
	public static void main(String[] args) {
		
		A62_2 a = new A62_2();
		a = new B62_2(a); // 생성자에 인수 전달하여 사라질 객체를 백업
		System.out.println(a.run());
		System.out.println("------------------------------");
		a = new C62_2(a);
		System.out.println(a.run());
	}
}
