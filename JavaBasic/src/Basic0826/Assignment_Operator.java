package Basic0826;

//ex15 ���Կ�����, ���׿�����)
public class Assignment_Operator {

	public static void main(String[] args) {
		// 15-1 ���ͷ� �����ؼ� �� �� �ִ� �͵�
		int a = 10;

		// 15-2
		int b = 20;
		short c = 30;
		// Ÿ���� ���ƾ���
		b = (int)c; // Ÿ�� ĳ����
		c = (short)a;

		int num = 10;
		num = num + 3;
		num += 3; // ������ �ӵ��� �� ���� ����

		int a1 = 0, a2 = 0;
		a1 = a2 + 3;

		int t = +1;
		int u = -1;
		int k = 10;
		k += 3; // ���׿����� ���� ����
		System.out.println(k);
		k = +3;
		System.out.println(k);

		int d = 0;
		d++;
		System.out.println(d);
		++d;
		System.out.println(d);
		d = d + 1;
		System.out.println(d);
		d += 1;
		System.out.println(d);

	}

}
