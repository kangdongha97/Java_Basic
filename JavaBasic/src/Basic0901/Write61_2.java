package Basic0901;

import java.io.FileWriter;
import java.io.Writer;

//ex61 - 2 ���� ������Լ� write)
//���丮�� test01.txt ���� ����
public class Write61_2{
	
	public static void main(String[] args) {
		try {
			// ����������� ����� �Ŀ��� �ݾ��־����
			Writer w = new FileWriter("test01.txt"); //ungandled exception
			w.write("apple\n");
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 10; j++) {
					if((i+j)%2 == 0) {
						w.write("O ");
					}
					else {
						w.write("X ");
					}
				}
				w.write("\n");
			}
			
			// ���׿����� ���
			w.write("\n");
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 10; j++) {
					w.write((i+j)%2 == 0 ? "O " : "X ");
				}
				w.write("\n");
			}
			
			
			
			
			w.close();
			System.out.println("���� ����� ����");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
