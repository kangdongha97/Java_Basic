package Basic0826;

//ex23 �����ε�)
class MethodOver{
	// �Լ� �μ��� ������ �ٸ��ų� �μ��� Ÿ���� �ٸ� ��� ���� �̸��� �Լ��� ����� �� �ִ�.
	void method01() {
		System.out.println(1);
	}
	void method01(int a) {
		System.out.println(2);
	}
	void method01(int a, int b) {
		System.out.println(3);
	}
	void method01(String a) {
		System.out.println(a);
	}
	int getAreaRect(int w, int h) { // ī�� ǥ���
		return w*h; 
	}
	int getAreaRect(int l) {
		return l*l;
	}
}
public class Overloading23 {

	public static void main(String[] args) {
		MethodOver t = new MethodOver();
		t.method01();
		t.method01(1);
		t.method01(1, 1);
		t.method01("ȣ����");
		System.out.println("----------------------");
		System.out.println(t.getAreaRect(5, 4));
		System.out.println(t.getAreaRect(5));
	}

}
