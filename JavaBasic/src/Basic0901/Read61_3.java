package Basic0901;

import java.io.FileReader;
import java.io.Reader;
import java.nio.charset.Charset;

//ex61 - 3 파일 입출력함수 read)
// test02.txt 에 쓰여진 문자열을 읽음
public class Read61_3{
	
	public static void main(String[] args) {
		try {
			Reader r = new FileReader("test02.txt", Charset.forName("UTF-8"));
			
			
			while(true) {
				int data = r.read(); // 자동으로 다음 인덱스를 읽음	
				if(data == -1) { // 비었으면 -1 리턴
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
