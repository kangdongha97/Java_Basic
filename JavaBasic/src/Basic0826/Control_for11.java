package Basic0826;

//ex11 제어문 for)
public class Control_for11 {

	public static void main(String[] args) {
		// for 문 for(변수 초기화; 조건; 변수 증감) 단축키 사용
		System.out.println(1000);
		int num = 10;
		num = num + 3;
		System.out.println(num);
		num = num + 1;
		System.out.println(num);
		num++; // 단항연산자
		System.out.println(num);
		num--;
		System.out.println(num);
		for (int i = 0; i < 3; i++) {
			System.out.println("호랑이" + i);
		}

		// for 문 잘못된 예 
		// 변수 초기화 부분에 0 또는 1만 들어가야함
		// 조건문 부등호 방향 바뀌지 않음
		// 변수 증감에 1증감 이외에는 사용되지 않음
		// for (int i = 5; i > 4; i = i + 3) {}
		// for 문 형식
		for (int i = 0; i < 5; i++) {

		}
		for (int i = 1; i <= 5; i++) {

		}
		int n = 5;
		for (int i = -n; i <= -5; i++) {

		} // 좌표값 제어할 때 주로 사용

	}

}
