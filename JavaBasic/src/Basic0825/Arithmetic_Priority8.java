package Basic0825;

//ex8 ������ �켱����)
public class Arithmetic_Priority8 {

	public static void main(String[] args) {
		int a = 17, b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b + "\n");
		
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		System.out.print("\n");
		
		System.out.println(a > b * 6); // ��������� �켱���� ���>��>��
		System.out.println(a > b * 7 || a - 10 > 5);
	}

}
