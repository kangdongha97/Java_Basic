package Basic0830;

//ex51 ����, StringBuffer Ŭ���� insert Ȱ��)
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
			s1.insert((7-i)*4, " "); // �� ���� �ϸ� ���鿡 ���� �и��� ������ �� ����
		}
		
		System.out.println(s1);
		
		return s1.toString(); // �Ϲ������� String�� ������
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
