package Basic0901;

import java.io.FileReader;
import java.io.Reader;
import java.nio.charset.Charset;

//ex61 - 3 ���� ������Լ� read)
// test02.txt �� ������ ���ڿ��� ����
public class Read61_3{
	
	public static void main(String[] args) {
		try {
			Reader r = new FileReader("test02.txt", Charset.forName("UTF-8"));
			
			
			while(true) {
				int data = r.read(); // �ڵ����� ���� �ε����� ����	
				if(data == -1) { // ������� -1 ����
					break;
				}
				System.out.print((char)data);
			}System.out.println();
			
			r.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("1000");
	}
}
