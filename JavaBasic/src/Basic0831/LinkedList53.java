package Basic0831;

import java.util.LinkedList;

//ex53 데이터 관리 컬렉션 CRUD > list > linkedlist)
//제네릭 문법, 컨테이너 동일한 자료형들만 다룰 수 있음 <> 형식

public class LinkedList53{
	
	public static void main(String[] args) {
	
		System.out.println("1000");
		LinkedList<Integer> mm = new LinkedList<Integer>(); //<>안에 클래스만 사용가능
		
		//C(create)RUD
		mm.add(10);
		System.out.println(mm.size());
		for (int i = 0; i < 10; i++) {
			mm.add(i * 10 + i);
		}
		
		// CR(read)UD
		// read 3가지방법
		// 1. 출력코드
		System.out.println(mm);

		// 2. for문, get 이용 활용도가 가장 높음
		int size = mm.size(); // for문 안에 함수 호출을 넣게되면 비용이 많이 발생
		for (int i = 0; i < size; i++) {
			int data = mm.get(i);
			System.out.print(data + " ");
		}System.out.println();
		
		// 3. foreach문 사용, x, data, value
		for (Integer x : mm) {
			System.out.print(x + " ");
		}System.out.println();
		
		// CRU(update)D
		// set 사용
		mm.set(5, 999); // 정렬이 일어남
		System.out.println(mm);
		
		// CRUD(delete)
		// remove 사용
		mm.remove(5);
		System.out.print(mm + " ");
		System.out.println();
	}
}
