package Basic0830;

//ex46 exception 3����, try - catch��
public class Exception46{
	
	public static void main(String[] args) {
		System.out.println(1);
		try {
			int a = 10 / 0;
		} catch (Exception e) {
			// e.printStackTrace(); // � ���ܰ� �߻��ߴ��� ���
		}
		
		// ArrayIndexOutOfBoundsException
		int[]ar = {1, 2, 3};
		try {
			ar[3] = 10;
		} catch (Exception e) {
			// TODO: handle exception
			// e.printStackTrace();
		}
		
		String s = "����ȭ�����Ǿ����ϴ�";
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
