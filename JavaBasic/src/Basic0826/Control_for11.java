package Basic0826;

//ex11 ��� for)
public class Control_for11 {

	public static void main(String[] args) {
		// for �� for(���� �ʱ�ȭ; ����; ���� ����) ����Ű ���
		System.out.println(1000);
		int num = 10;
		num = num + 3;
		System.out.println(num);
		num = num + 1;
		System.out.println(num);
		num++; // ���׿�����
		System.out.println(num);
		num--;
		System.out.println(num);
		for (int i = 0; i < 3; i++) {
			System.out.println("ȣ����" + i);
		}

		// for �� �߸��� �� 
		// ���� �ʱ�ȭ �κп� 0 �Ǵ� 1�� ������
		// ���ǹ� �ε�ȣ ���� �ٲ��� ����
		// ���� ������ 1���� �̿ܿ��� ������ ����
		// for (int i = 5; i > 4; i = i + 3) {}
		// for �� ����
		for (int i = 0; i < 5; i++) {

		}
		for (int i = 1; i <= 5; i++) {

		}
		int n = 5;
		for (int i = -n; i <= -5; i++) {

		} // ��ǥ�� ������ �� �ַ� ���

	}

}
