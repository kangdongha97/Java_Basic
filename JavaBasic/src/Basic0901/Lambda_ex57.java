package Basic0901;

import java.util.LinkedList;
import java.util.function.Predicate;

//ex57 �����Լ��� Ȱ��)
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
		
		tiger.m3(() -> 100); // �� �ڵ�� ���� return ������

		
		// LinkedList�� removeIf�Լ����� Ȱ��
		// ���� ����
		LinkedList<Integer> mm = new LinkedList<Integer>();
		mm.removeIf(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return false;
			}
		});
		
		// ���� �� ����
		LinkedList<Integer> mm1 = new LinkedList<Integer>();
		mm1.removeIf(Lion -> Lion%2==0); // �μ��� �ϳ��϶��� () ��������
		mm1.removeIf(Lion -> {
			return Lion%2==0;
		});
	}
}