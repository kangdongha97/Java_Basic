package Basic0826;

//ex18 �޼ҵ� 4����)
//���ֻ��Ǵ� �ڵ带 �����Ͽ� ȣ���Ͽ� ���
class Method{
	void merry() {
		System.out.println("��");
	}
	// int num = 3 �Ķ���� ����
	void happy(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("��");
		}
	}
	int turtle() {
		System.out.println("turtle call");
		return 15;
	}

	int fish(int num) {
		int n = num * 3;
		return n;
	}

}
public class Class_Method {

	public static void main(String[] args) {
		Method t = new Method(); // new ����Ű ��밡��
		t.merry();
		t.merry();
		t.merry();
		for (int i = 0; i < 10; i++) {
			t.merry();
		}
		System.out.println("--------------------------------");

		t.happy(3); //d �μ�����
		System.out.println("--------------------------------");

		int num = t.turtle();
		System.out.println(num);
		System.out.println(t.turtle());
		System.out.println("--------------------------------");
		System.out.println(t.fish(2));
		int ct = t.fish(2);
		System.out.println(ct);
		//���ϰ�   �����μ�
		//  x      x
		//  x      o
		//  o      x
		//  o      o
	}
}
