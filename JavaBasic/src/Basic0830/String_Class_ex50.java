package Basic0830;

//ex50 String ǥ�� Ŭ���� Ȱ��)
public class String_Class_ex50{
	
	public static void main(String[] args) {
		String s = "����ȭ�����Ǿ����ϴ�";
		// 1. length
		System.out.println(s.length());
		// 2. char charAt(int index) char Ÿ������ ����
		System.out.println(s.charAt(3));
		// 3. indexOf
		System.out.println(s.indexOf("ȭ��"));
		System.out.println(s.indexOf("�����"));
		
		int num = s.indexOf("ȭ��");
		if(num != -1) {
			System.out.println("find : " + num + "�� ��");
		}
		else {
			System.out.println("not find");
		}
		// 4. replace �ش�Ǵ� ���ڿ��� ��� �ٲ���
		
		System.out.println(s.replace("����", "������"));
		System.out.println(s);
		
		// ���� : String�� �����͸� �����̳� ���Ž�ų �� ����
		// �Ʒ��� �����̳� ������ �ƴ� ��ü�� �����ϰ� �ٽ� ������ ��
		//s = "���ѹα�";
		//System.out.println(s);
		
		// 5. slicing
		System.out.println(s.substring(5));
		System.out.println(s.substring(3, 6));
		
		// 6. trim �� �� ��������
		String s2 = "   App   le   ";
		System.out.print(s2.trim());
		System.out.println("ȣ����");
		
		// 7. toUpperCAse, toLowerCase �빮��, �ҹ��� ��ȯ
		String s3 = "APple";
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		// 8. ���ڸ� ���ڿ���, ���ڿ��� ���ڷ� ��ȯ
		// ������ ���ſ��� �ַ� ���
		byte[] data = new byte[] {65, 'B', 'C', 'D'};
		String s4 = new String(data, 0, data.length);
		System.out.println(s4);
		
		// ������ �۽ſ��� �ַ� ���
		String s5 = "Banana";
		byte[] data1 = s5.getBytes();
		for (byte value : data1) {
			System.out.println((char)value);
		}
	}
}
