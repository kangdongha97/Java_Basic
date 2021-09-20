package Basic0831;

import java.util.LinkedList;

//ex53 ������ ���� �÷��� CRUD > list > linkedlist)
//���׸� ����, �����̳� ������ �ڷ����鸸 �ٷ� �� ���� <> ����

public class LinkedList53{
	
	public static void main(String[] args) {
	
		System.out.println("1000");
		LinkedList<Integer> mm = new LinkedList<Integer>(); //<>�ȿ� Ŭ������ ��밡��
		
		//C(create)RUD
		mm.add(10);
		System.out.println(mm.size());
		for (int i = 0; i < 10; i++) {
			mm.add(i * 10 + i);
		}
		
		// CR(read)UD
		// read 3�������
		// 1. ����ڵ�
		System.out.println(mm);

		// 2. for��, get �̿� Ȱ�뵵�� ���� ����
		int size = mm.size(); // for�� �ȿ� �Լ� ȣ���� �ְԵǸ� ����� ���� �߻�
		for (int i = 0; i < size; i++) {
			int data = mm.get(i);
			System.out.print(data + " ");
		}System.out.println();
		
		// 3. foreach�� ���, x, data, value
		for (Integer x : mm) {
			System.out.print(x + " ");
		}System.out.println();
		
		// CRU(update)D
		// set ���
		mm.set(5, 999); // ������ �Ͼ
		System.out.println(mm);
		
		// CRUD(delete)
		// remove ���
		mm.remove(5);
		System.out.print(mm + " ");
		System.out.println();
	}
}
