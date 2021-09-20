package Basic0901;

//ex62 - 2 ���������� - ���ڷ��̼�, ��ü�� ��ü�� ���δ� ����, ��ü�� ��ü�� ������, �߰�)
class A62_2{
	int num = 10;
	int run() {
		System.out.println("A Run");
		return num;
	}
}
class B62_2 extends A62_2{
	int num = 20;
	A62_2 a; // �� ������� �� ��ü�� �������
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
	A62_2 a; // �� ������� �� ��ü�� �������
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
		a = new B62_2(a); // �����ڿ� �μ� �����Ͽ� ����� ��ü�� ���
		System.out.println(a.run());
		System.out.println("------------------------------");
		a = new C62_2(a);
		System.out.println(a.run());
	}
}
