package Basic0826;

//ex22 continue, break)
public class Continue_Break22 {

	public static void main(String[] args) {
		System.out.println("1000");
		for (int i = 0; i < 10; i++) {
			if(i < 3) {
				continue; // ���ĸ� �������� �ʰ� ���������� �Ѿ
			}
			System.out.println(i);
			if(i == 7) {
				break; // ���� ����� �ݺ��� Ż��
			}
		}
		System.out.println("ȣ����");
		int num = 0;
		while(true) {

			if (num%2 == 0) {
				System.out.println("ȣ����" + num);
				num++;
				continue;
			}
			if (num == 10) {
				System.out.println("�ڳ���" + num);
				break;
			}
		}
	}

}
