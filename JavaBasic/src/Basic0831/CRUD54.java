package Basic0831;

import java.util.LinkedList;

//ex54 ������ �˻��� ���� Ȱ��)
public class CRUD54{
	
	public static void main(String[] args) {
		LinkedList<Integer> mm = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			mm.add(i * 10 + i);
		}
		System.out.println(mm);
		
		// �˻�
		int size = mm.size();
		for (int i = 0; i < size; i++) {
			int num = mm.get(i);
			// System.out.print(num + " ");
			if (num == 44) {
				System.out.println(i+1 + "�� ° " + num + " ã�Ҵ�.");
				break;
			}
			if(i == size - 1) {
				System.out.println("�� ã�Ҵ�.");
			}
		}
		
		// ����
		System.out.println("--------------------------------------");
		System.out.println(mm);
		for (int i = 0; i < size; i++) {
			int num = mm.get(i);
			// System.out.print(num + " ");
			if (num == 55) {
				mm.remove(i);
				System.out.println(i+1 + "�� ° " + num + " �����մϴ�.");
				break;
			}
			if(i == size - 1) {
				System.out.println("������ ����");
			}
		}
		System.out.println(mm);
		
	}
}
