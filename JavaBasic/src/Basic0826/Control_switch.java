package Basic0826;

//ex10 ��� switch)
public class Control_switch {

	public static void main(String[] args) {
		// switch �� ����Ű ���
		// 1. case �ڿ��� ������ �� �� ����
		// 2. switch �ȿ��� ������ �� �� ����
		// 3. default break �� ���� ����
		// 4. �ǵ����� ��쿡�� break �� ���� ����
		// 5. case �б⹮���� ����Ǵ� ��ɹ��� �� ���� �̻��� ���� �Ϲ������� ��� ó���� ��

		switch (10) { //switch (int num = 10) o
		case 10: // case int num = 10 x
			System.out.println(1);
			break;

		case 20:{ // �� ���� �̻��� �� ��� ó��
			System.out.println(2);
			System.out.println(100);
		}break;

		case 30:
			System.out.println(3);
			break;

		default:
			System.out.println(4);
			break;
		}
		System.out.print("\n");

		int jumsu = 83;
		int q = jumsu/10;

		if (q == 9) {
			System.out.println("A �����Դϴ�.");
		}else if (q == 8) {
			System.out.println("B �����Դϴ�.");
		}else if (q == 7) {
			System.out.println("C �����Դϴ�.");
		}else if (q == 6) {
			System.out.println("D �����Դϴ�.");
		}else {
			System.out.println("F �����Դϴ�.");
		}
		System.out.print("\n");

		// switch���� if, else���� ���� ���α׷� ����ӵ��� ����ȭ��, �ӵ��� ������(������ �� ���� �̻��� ��)

		switch (q) {
		case 9:
			System.out.println("A �����Դϴ�.");
			break;
		case 8:
			System.out.println("B �����Դϴ�.");
			break;
		case 7:
			System.out.println("C �����Դϴ�.");
			break;
		case 6:
			System.out.println("D �����Դϴ�.");
			break;
		default:
			System.out.println("F �����Դϴ�.");
			break;
		}
	}

}
