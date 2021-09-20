package Basic0831;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Predicate;

//ex55 ������ ���� ���� �� Iterator, removeIf)
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
		
		// ex1-1 ���������ڰ� ���� for �� Ȱ��
		try {
			for (int i = 0; i < size; ) {
				int num = mm.get(i);

				if (num % 2 == 0) {
					mm.remove(i);
					System.out.println(num + " �����մϴ�.");
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
		
		// �ε������� �ذ��� ex1-2 �̰�쿡�� �Լ�ȣ���� ����ؾ���)
		// size�� �Լ�ȣ�� ���� �ʰ� ����Ҷ��� try - catch���� �̿��Ͽ� ���� ó��
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
		
		// ex3 removeIf ���ǿ� ���缭 ����)
		// �������̽�Ŭ���� predicate ���� test ����, return�� ���ǹ�
		mm.removeIf(new Predicate<Integer>() {
			@Override
			public boolean test(Integer num) {
				return num % 2 == 0;
			}
		});
		System.out.println(mm);
		System.out.println("----------------------------------");
		
		// ex4 �����Լ� ��� ex1)
		mm.removeIf(num -> num % 2 == 0);
		
		System.out.println(mm);
	
	}
}
