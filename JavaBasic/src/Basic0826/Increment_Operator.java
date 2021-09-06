package Basic0826;

//ex16 증감연산자)
public class Increment_Operator {

	public static void main(String[] args) {
		int a = 10, b;
		b = a++; // 대입 먼저
		System.out.println(a + " " + b);

		int c = 10, d = 0;
		d = ++c;
		System.out.println(c + " " + d);

		int a1 = 10, a2 = 10;
		System.out.println(a1++);
		System.out.println(++a2);
		System.out.println(a1);
		System.out.println(a2);
	}

}
