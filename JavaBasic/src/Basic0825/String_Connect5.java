package Basic0825;

//ex5 문자열 연결)
public class String_Connect5 {

	public static void main(String[] args) {
		System.out.println(10); // 숫자 출력
		System.out.println('한'); // 문자 출력
		System.out.println("호랑이"); // 문자열 출력
		System.out.println("1000\n"); // 문자열 출력
		
		System.out.println(10 + 20); // 숫자 + 숫자
		System.out.println(10 + "호랑이"); // 숫자 + 문자열 문자열 연결
		System.out.println("호랑이" + 10); // 문자열 + 숫자 문자열 연결 
		System.out.println("호랑이" + "코끼리\n"); // 문자열 연결
		
		System.out.println(10 + "호랑이" + 20); // 좌측에서 부터
		System.out.println(10 + 20 + "호랑이");
		System.out.println("호랑이" + 10 + 20);
		System.out.println(10 + " " + 20);
	}

}
