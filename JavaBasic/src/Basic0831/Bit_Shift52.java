package Basic0831;

//ex52 ��Ʈ������, ����Ʈ������)
public class Bit_Shift52{
	static String hexaToBinary(int n) {
		String s = Integer.toBinaryString(n);
		while(s.length() < 32) // �ܹ����϶� {} ����
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
		
		// AND ����
		System.out.println(hexaToBinary(a));
		System.out.println(hexaToBinary(b));
		System.out.println(hexaToBinary(a & b));
		System.out.println(hexaToBinary((a & b) >> 8)); // ����Ʈ������
		System.out.println(a & b);
		System.out.println((a & b) >> 8);
		
		System.out.println((0xf800 & a) >> 11); // ���ϴ� ��Ʈ�ڸ��� ��� ���� ����ũ�� & ����
		System.out.println((0x07e0 & a) >> 5);
		System.out.println(0x001f & a);
		
		// OR ����
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
		
		c4 = (((((c4 | c1) << 6) | c2) << 5) | c3); //�� �ڵ�� ���� 
		
		System.out.println(hexaToBinary(c4));
		System.out.println(Integer.toHexString(c4));
		
		char c5 = 0xdc; //1101 1100
		//1000 0000
		// �� OR �������� �� 1���� ũ�� Ʈ��
		// 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
		// 1000 0000 AND �� 1���� ũ�� �� ������ ����
		
		System.out.println("----------------------------------------");
		// ���׿����� �̿�
		int c6 = 0x80;
		String[] ary = new String [] {"���ڷ�����", "��ǻ��", "����������", "��Ź��", 
				"�δ���", "���̶���Ʈ", "����", "������Ʈ"};
		
		for (int i = 0; i < 8; i++, c6 >>= 1) {
			System.out.println(((int)c5 & c6) > 1 ? ary[i] + "\tOn" : ary[i] + "\tOff");
		}
		
		System.out.println("----------------------------------------");
		
		int c7 = 0x80;
		String[] ary1 = new String [] {"���ڷ�����", "��ǻ��", "����������", "��Ź��", 
				"�δ���", "���̶���Ʈ", "����", "������Ʈ"};
		
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
				//System.out.println(((int)c5 & c7) >> (7-i)); // ��¥�� 0�̶� �����
				//System.out.println("--------------------");
			}
			c7 = c7 >> 1;
		}
		
	}// 25 42 26
}
