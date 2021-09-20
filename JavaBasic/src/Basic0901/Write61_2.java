package Basic0901;

import java.io.FileWriter;
import java.io.Writer;

//ex61 - 2 파일 입출력함수 write)
//디렉토리에 test01.txt 파일 생성
public class Write61_2{
	
	public static void main(String[] args) {
		try {
			// 파일입출력을 사용한 후에는 닫아주어야함
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
			
			// 삼항연산자 사용
			w.write("\n");
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 10; j++) {
					w.write((i+j)%2 == 0 ? "O " : "X ");
				}
				w.write("\n");
			}
			
			
			
			
			w.close();
			System.out.println("파일 입출력 종료");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
