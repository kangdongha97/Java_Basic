package Basic0825;

//ex7 변수 사용)
public class Value7 {

	public static void main(String[] args) {
		// 7-1)
		int a;
		a = 10;
		System.out.println(a);

		// 7-2)
		int b, c, d;
		b = 1;
		c = 2;
		d = 3;
		System.out.println(b + " " + c + " " + d);
		System.out.println((int)Character.MIN_VALUE);
		System.out.println((int)Character.MAX_VALUE);

		// 7-3)
		int e = 10;

		int f = 20, g = 30;

		int h, i = 40, j;
		h = 50;
		j = 60;

		System.out.println(e + " " + g + " " + j);

		// 7-4) 변수 첫 글자 숫자 x
		int a10;
		a10 = 10;
		System.out.println(a10);

		a10 = 20;
		System.out.println(a10 + "\n");

		// 7-5) swap
		int aa = 88, bb = 99;
		int temp;
		System.out.println(aa + " " + bb);
		temp = aa; // temp = 88
		aa = bb; // aa = 99
		bb = temp; // bb = 88
		System.out.println(aa + " " + bb);

		// 7-6)
		int cc = 100, dd = 200;
		System.out.println(cc + " " + dd);
		int tt = cc;
		cc = dd;
		dd = tt;
		System.out.println(cc + " " + dd);
	}

}
