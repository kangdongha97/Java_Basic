package Basic0826;

//ex9 제어문 if)
public class Control_If9 {

	public static void main(String[] args) {
		//9-1
		System.out.println(1);
		if(true) {
			System.out.println(2);
			System.out.println(4);
		}; // ; 생략 가능

		System.out.println(3);
		System.out.print("\n");


		// 9-2
		if (false) {
			System.out.println(5);
		}else {
			System.out.println(6);
		}
		System.out.print("\n");


		// 9-3 삼항연산 if와 else를 사용하는 경우, if, else 사용 변수가 같을 경우
		int a = 10, b = 5;
		int c;
		if(a > b) {
			c = 7;
		}else {
			c = 8;
		}
		// 위의 if, else 코드와 아래 삼항연산자 코드가 같음
		System.out.println(c);
		c = a > b ? 7 : 8;
		System.out.println(c);

		if (a < b) {
			System.out.println("호랑이");

		}else {
			System.out.println("코끼리");
		}
		System.out.println(a > b ? "호랑이" : "코끼리"); // 인자 안에서도 사용가능
		System.out.print("\n");

		// 9-4 else if, switch문으로 바뀔 수 있다면 바꾸는게 원칙
		int num = 83;
		if (num >= 90) {
			System.out.println("A 학점입니다.");
		}else if (num >= 80) {
			System.out.println("B 학점입니다.");
		}else if (num >= 70) {
			System.out.println("C 학점입니다.");
		}else if (num >= 60) {
			System.out.println("D 학점입니다.");
		}else {
			System.out.println("F 학점입니다.");
		}
		System.out.print("\n");
	}

}
