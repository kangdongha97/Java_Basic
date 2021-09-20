package Basic0831;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Predicate;

//ex55 데이터 삭제 응용 및 Iterator, removeIf)
public class CRUD_ex55{
	
	public static void main(String[] args) {
		
		
		LinkedList<Integer> mm = new LinkedList<Integer>();
		mm.add(33);
		mm.add(44);
		mm.add(77);
		for (int i = 0; i < 10; i++) {
			mm.add(i*2);
		}
		mm.add(101);
		mm.add(102);
		mm.add(103);
		
		System.out.println(mm);
		
		int size = mm.size();
		
		// ex1-1 증감연산자가 없는 for 문 활용
		try {
			for (int i = 0; i < size; ) {
				int num = mm.get(i);

				if (num % 2 == 0) {
					mm.remove(i);
					System.out.println(num + " 삭제합니다.");
				}
				else {
					i++;
				}				
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
				
		System.out.println(mm);
		System.out.println("----------------------------------");
		
		// 인덱스에러 해결방법 ex1-2 이경우에는 함수호출을 사용해야함)
		// size를 함수호출 하지 않고 사용할때는 try - catch문을 이용하여 예외 처리
		for (int i = 0; i < mm.size(); ) {
			int num = mm.get(i);
			if(num%2==0) {
				mm.remove(i);
			}
			else {
				i++;
			}
		}
		System.out.println(mm); 
		System.out.println("----------------------------------");
		
		// ex2 Iterator)
		for(Iterator<Integer> it = mm.iterator(); it.hasNext(); ) {
			Integer num = it.next();
			if(num%2==0) {
				it.remove();
			}
		}
		System.out.println(mm);
		System.out.println("----------------------------------");
		
		// ex3 removeIf 조건에 맞춰서 제거)
		// 인터페이스클래스 predicate 에서 test 구현, return에 조건문
		mm.removeIf(new Predicate<Integer>() {
			@Override
			public boolean test(Integer num) {
				return num % 2 == 0;
			}
		});
		System.out.println(mm);
		System.out.println("----------------------------------");
		
		// ex4 람다함수 사용 ex1)
		mm.removeIf(num -> num % 2 == 0);
		
		System.out.println(mm);
	
	}
}
