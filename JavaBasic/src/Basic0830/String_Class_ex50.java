package Basic0830;

//ex50 String 표준 클래스 활용)
public class String_Class_ex50{
	
	public static void main(String[] args) {
		String s = "무궁화꽃이피었습니다";
		// 1. length
		System.out.println(s.length());
		// 2. char charAt(int index) char 타입으로 리턴
		System.out.println(s.charAt(3));
		// 3. indexOf
		System.out.println(s.indexOf("화꽃"));
		System.out.println(s.indexOf("목꽃이"));
		
		int num = s.indexOf("화꽃");
		if(num != -1) {
			System.out.println("find : " + num + "번 쨰");
		}
		else {
			System.out.println("not find");
		}
		// 4. replace 해당되는 문자열을 모두 바꿔줌
		
		System.out.println(s.replace("꽃이", "나무가"));
		System.out.println(s);
		
		// 주의 : String은 데이터를 변경이나 갱신시킬 수 없음
		// 아래는 변경이나 갱신이 아닌 객체를 삭제하고 다시 생성한 것
		//s = "대한민국";
		//System.out.println(s);
		
		// 5. slicing
		System.out.println(s.substring(5));
		System.out.println(s.substring(3, 6));
		
		// 6. trim 앞 뒤 공백제거
		String s2 = "   App   le   ";
		System.out.print(s2.trim());
		System.out.println("호랑이");
		
		// 7. toUpperCAse, toLowerCase 대문자, 소문자 변환
		String s3 = "APple";
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		// 8. 문자를 문자열로, 문자열을 문자로 변환
		// 데이터 수신에서 주로 사용
		byte[] data = new byte[] {65, 'B', 'C', 'D'};
		String s4 = new String(data, 0, data.length);
		System.out.println(s4);
		
		// 데이터 송신에서 주로 사용
		String s5 = "Banana";
		byte[] data1 = s5.getBytes();
		for (byte value : data1) {
			System.out.println((char)value);
		}
	}
}
