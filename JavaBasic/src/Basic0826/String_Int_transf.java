package Basic0826;

//ex24 문자열과 숫자 변환)
public class String_Int_transf {

	public static void main(String[] args) {
		int a = 100;
		String s1 = Integer.toString(a);
		System.out.println(s1 + 200);
		String s2 = "" + a; // 위와 같음
		System.out.println(s2 + 200);
		
		String s3 = "456";
		int b = Integer.parseInt(s3);
		System.out.println(b + 100);
		
	}

}
