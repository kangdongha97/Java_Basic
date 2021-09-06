package Basic0826;

//ex15 대입연산자, 단항연산자)
public class Assignment_Operator {

	public static void main(String[] args) {
		// 15-1 리터럴 대입해서 들어갈 수 있는 것들
		int a = 10;

		// 15-2
		int b = 20;
		short c = 30;
		// 타입이 같아야함
		b = (int)c; // 타입 캐스팅
		c = (short)a;

		int num = 10;
		num = num + 3;
		num += 3; // 컴파일 속도가 위 보다 빠름

		int a1 = 0, a2 = 0;
		a1 = a2 + 3;

		int t = +1;
		int u = -1;
		int k = 10;
		k += 3; // 단항연산자 사용시 주의
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
