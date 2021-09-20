package Basic0831;

//ex52 비트연산자, 시프트연산자)
public class Bit_Shift52{
	static String hexaToBinary(int n) {
		String s = Integer.toBinaryString(n);
		while(s.length() < 32) // 단문장일때 {} 생략
			s = "0" + s;
		
		StringBuffer s1 = new StringBuffer(s);
		for (int i = 0; i < 7; i++) {
			s1.insert((7-i)*4, " ");
		}		
		return s1.toString();
	}
	
	public static void main(String[] args) {
		int a = 0x0000cd5a;
		int b = 0x0000ff00;
		
		int c = 0x77000000;
		
		// AND 연산
		System.out.println(hexaToBinary(a));
		System.out.println(hexaToBinary(b));
		System.out.println(hexaToBinary(a & b));
		System.out.println(hexaToBinary((a & b) >> 8)); // 시프트연산자
		System.out.println(a & b);
		System.out.println((a & b) >> 8);
		
		System.out.println((0xf800 & a) >> 11); // 원하는 비트자리를 얻기 위해 마스크와 & 연산
		System.out.println((0x07e0 & a) >> 5);
		System.out.println(0x001f & a);
		
		// OR 연산
		System.out.println(hexaToBinary(a | c));
		int c1 = 25;
		int c2 = 42;
		int c3 = 26;
		int c4 = 0x00000000;
		System.out.println("----------------------------------------");
		System.out.println(hexaToBinary(c1));
		
		//c4 = (c4 | c3);
		//c4 = c4 | (c2 << 5);
		//c4 = c4 | (c1 << 11);
		
		c4 = (((((c4 | c1) << 6) | c2) << 5) | c3); //위 코드와 동일 
		
		System.out.println(hexaToBinary(c4));
		System.out.println(Integer.toHexString(c4));
		
		char c5 = 0xdc; //1101 1100
		//1000 0000
		// 과 OR 연산했을 때 1보다 크면 트루
		// 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
		// 1000 0000 AND 이 1보다 크면 온 작으면 오프
		
		System.out.println("----------------------------------------");
		// 삼항연산자 이용
		int c6 = 0x80;
		String[] ary = new String [] {"전자레인지", "컴퓨터", "가스레인지", "세탁기", 
				"인덕션", "하이라이트", "전등", "전기포트"};
		
		for (int i = 0; i < 8; i++, c6 >>= 1) {
			System.out.println(((int)c5 & c6) > 1 ? ary[i] + "\tOn" : ary[i] + "\tOff");
		}
		
		System.out.println("----------------------------------------");
		
		int c7 = 0x80;
		String[] ary1 = new String [] {"전자레인지", "컴퓨터", "가스레인지", "세탁기", 
				"인덕션", "하이라이트", "전등", "전기포트"};
		
		for (int i = 0; i < 8; i++) {
			if(((int)c5 & c7) > 1) {
				ary1[i] = ary1[i] + "\t" + "On";
				System.out.println(ary1[i]);
				//System.out.println(hexaToBinary(c5));
				//System.out.println(hexaToBinary(c7));
				//System.out.println(((int)c5 & c7) >> (7-i));
				//System.out.println("--------------------");
			}
			else {
				ary1[i] = ary1[i] + "\t" + "Off";
				System.out.println(ary1[i]);
				//System.out.println(hexaToBinary(c5));
				//System.out.println(hexaToBinary(c7));
				//System.out.println(((int)c5 & c7) >> (7-i)); // 어짜피 0이라 없어도됨
				//System.out.println("--------------------");
			}
			c7 = c7 >> 1;
		}
		
	}// 25 42 26
}
