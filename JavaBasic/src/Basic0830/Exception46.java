package Basic0830;

//ex46 exception 3가지, try - catch문
public class Exception46{
	
	public static void main(String[] args) {
		System.out.println(1);
		try {
			int a = 10 / 0;
		} catch (Exception e) {
			// e.printStackTrace(); // 어떤 예외가 발생했는지 출력
		}
		
		// ArrayIndexOutOfBoundsException
		int[]ar = {1, 2, 3};
		try {
			ar[3] = 10;
		} catch (Exception e) {
			// TODO: handle exception
			// e.printStackTrace();
		}
		
		String s = "무궁화꽃이피었습니다";
		System.out.println(s.length());
		s = null;
		// NullPointerException
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(s.length());
		}
		
		System.out.println(4);
		
	}
}
