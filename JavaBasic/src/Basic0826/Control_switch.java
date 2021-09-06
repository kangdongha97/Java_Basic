package Basic0826;

//ex10 제어문 switch)
public class Control_switch {

	public static void main(String[] args) {
		// switch 문 단축키 사용
		// 1. case 뒤에는 변수가 올 수 없음
		// 2. switch 안에는 변수가 올 수 있음
		// 3. default break 는 생략 가능
		// 4. 의도적인 경우에는 break 를 생략 가능
		// 5. case 분기문에서 실행되는 명령문이 한 문장 이상일 때는 일반적으로 블록 처리를 함

		switch (10) { //switch (int num = 10) o
		case 10: // case int num = 10 x
			System.out.println(1);
			break;

		case 20:{ // 한 문장 이상일 때 블록 처리
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
			System.out.println("A 학점입니다.");
		}else if (q == 8) {
			System.out.println("B 학점입니다.");
		}else if (q == 7) {
			System.out.println("C 학점입니다.");
		}else if (q == 6) {
			System.out.println("D 학점입니다.");
		}else {
			System.out.println("F 학점입니다.");
		}
		System.out.print("\n");

		// switch문은 if, else문에 비해 프로그램 실행속도가 평준화됨, 속도가 안정적(조건이 세 가지 이상일 때)

		switch (q) {
		case 9:
			System.out.println("A 학점입니다.");
			break;
		case 8:
			System.out.println("B 학점입니다.");
			break;
		case 7:
			System.out.println("C 학점입니다.");
			break;
		case 6:
			System.out.println("D 학점입니다.");
			break;
		default:
			System.out.println("F 학점입니다.");
			break;
		}
	}

}
