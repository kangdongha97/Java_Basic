package Basic0901;

import java.util.LinkedList;
import java.util.function.Predicate;

//ex57 람다함수의 활용)
interface Test1_57{
	void m1();
}

interface Test2_57{
	int m1();
}
class Tiger57{
	void m2(Test1_57 t) {
		t.m1();
	}
	void m3(Test2_57 t) {
		t.m1();
		System.out.println(t.m1());
	}
}



public class Lambda_ex57{
	
	public static void main(String[] args) {
		Test1_57 t1 = () -> {
				System.out.println(1);
			
		};
		Tiger57 tiger = new Tiger57();
		tiger.m2(t1);
		tiger.m2(()->{
			System.out.println(2);
		});
		
		tiger.m3(()->{
			return 100;
		});
		
		tiger.m3(() -> 100); // 위 코드와 동일 return 생략형

		
		// LinkedList의 removeIf함수에서 활용
		// 원래 형태
		LinkedList<Integer> mm = new LinkedList<Integer>();
		mm.removeIf(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return false;
			}
		});
		
		// 생략 후 형태
		LinkedList<Integer> mm1 = new LinkedList<Integer>();
		mm1.removeIf(Lion -> Lion%2==0); // 인수가 하나일때는 () 생략가능
		mm1.removeIf(Lion -> {
			return Lion%2==0;
		});
	}
}