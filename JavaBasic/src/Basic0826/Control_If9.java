package Basic0826;

//ex9 ��� if)
public class Control_If9 {

	public static void main(String[] args) {
		//9-1
		System.out.println(1);
		if(true) {
			System.out.println(2);
			System.out.println(4);
		}; // ; ���� ����

		System.out.println(3);
		System.out.print("\n");


		// 9-2
		if (false) {
			System.out.println(5);
		}else {
			System.out.println(6);
		}
		System.out.print("\n");


		// 9-3 ���׿��� if�� else�� ����ϴ� ���, if, else ��� ������ ���� ���
		int a = 10, b = 5;
		int c;
		if(a > b) {
			c = 7;
		}else {
			c = 8;
		}
		// ���� if, else �ڵ�� �Ʒ� ���׿����� �ڵ尡 ����
		System.out.println(c);
		c = a > b ? 7 : 8;
		System.out.println(c);

		if (a < b) {
			System.out.println("ȣ����");

		}else {
			System.out.println("�ڳ���");
		}
		System.out.println(a > b ? "ȣ����" : "�ڳ���"); // ���� �ȿ����� ��밡��
		System.out.print("\n");

		// 9-4 else if, switch������ �ٲ� �� �ִٸ� �ٲٴ°� ��Ģ
		int num = 83;
		if (num >= 90) {
			System.out.println("A �����Դϴ�.");
		}else if (num >= 80) {
			System.out.println("B �����Դϴ�.");
		}else if (num >= 70) {
			System.out.println("C �����Դϴ�.");
		}else if (num >= 60) {
			System.out.println("D �����Դϴ�.");
		}else {
			System.out.println("F �����Դϴ�.");
		}
		System.out.print("\n");
	}

}
