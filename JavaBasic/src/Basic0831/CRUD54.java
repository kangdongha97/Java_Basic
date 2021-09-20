package Basic0831;

import java.util.LinkedList;

//ex54 데이터 검색과 삭제 활용)
public class CRUD54{
	
	public static void main(String[] args) {
		LinkedList<Integer> mm = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			mm.add(i * 10 + i);
		}
		System.out.println(mm);
		
		// 검색
		int size = mm.size();
		for (int i = 0; i < size; i++) {
			int num = mm.get(i);
			// System.out.print(num + " ");
			if (num == 44) {
				System.out.println(i+1 + "번 째 " + num + " 찾았다.");
				break;
			}
			if(i == size - 1) {
				System.out.println("못 찾았다.");
			}
		}
		
		// 삭제
		System.out.println("--------------------------------------");
		System.out.println(mm);
		for (int i = 0; i < size; i++) {
			int num = mm.get(i);
			// System.out.print(num + " ");
			if (num == 55) {
				mm.remove(i);
				System.out.println(i+1 + "번 째 " + num + " 삭제합니다.");
				break;
			}
			if(i == size - 1) {
				System.out.println("데이터 없음");
			}
		}
		System.out.println(mm);
		
	}
}
