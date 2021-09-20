package Basic0830;

//ex51 진법, StringBuffer 클래스 insert 활용)
public class Bit51{
	static String hexaToBinary(int n) {
		String s = Integer.toBinaryString(n);
		System.out.println(s);
		System.out.println(s.length());
		
		while(s.length() < 32) {
			s = "0" + s;
		}
		System.out.println(s);
		
		StringBuffer s1 = new StringBuffer(s);
		for (int i = 0; i < 7; i++) {
			s1.insert((7-i)*4, " "); // 앞 부터 하면 공백에 의해 밀리기 때문에 뒤 부터
		}
		
		System.out.println(s1);
		
		return s1.toString(); // 일반적으로 String을 리턴함
	}
	
	public static void main(String[] args) {
		// 0011 1011 0001 0010 1100 1101 0101 1001
		int a = 0x3b12cd59;
		int b = 991087961;
		System.out.println(a);
		if(a == b) {
			System.out.println(1);
		}
		System.out.println(hexaToBinary(a));
		System.out.println(hexaToBinary(b));
		
	}
}
