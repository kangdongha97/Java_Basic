package Basic0826;

//ex21 return)
class Return{
	int m1(int a, int b) {
		if(a > b) {
			return 100;
		}
		else {
			System.out.println("ȣ����");
			return 200; // ������ ������ �� ���� ��������
		}
	}
	void m2() {
		System.out.println(1);
		return;
		//System.out.println(2);
	}
	void m3(int num) {
		for (int i = 0; i < 10; i++) {
			if(i == num) {
				System.out.println("ã�Ҵ�.");
				return; // �Լ��� ���̻� ���� �� �ʿ䰡 ���� ���� ���
			}
		}
		System.out.println("�˻������� ã�� ����");
	}
}
public class Class_Return21 {

	public static void main(String[] args) {
		Return t = new Return();
		System.out.println(t.m1(5, 3));
		t.m3(3);
		t.m3(11);
	}

}
