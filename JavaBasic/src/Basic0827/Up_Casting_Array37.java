package Basic0827;

import java.util.Random;

//ex37 ��ĳ���ð� �迭 Ȱ��)
class Animal37{
	Animal37(){
		
	}
	// ������ ���α׷� > cry��� �Լ��� �پ��� ���·� ��Ÿ���� ����� ������ ����
	void cry() {
		System.out.println("...");
	}
}

class Dog37 extends Animal37{
	Dog37(){
		
	}
	void cry() {
		System.out.println("�۸�");
	}
}

class Cat37 extends Animal37{
	Cat37(){
		
	}
	void cry() {
		System.out.println("�߿�");
	}
}

class Snake37 extends Animal37{
	Snake37(){
		
	}
}

public class Up_Casting_Array37{

	public static void main(String[] args) {
		Random rn = new Random();

		Animal37 t0 = new Dog37();
		Animal37 t1 = new Cat37();
		Animal37 t2 = new Snake37();
		for (int i = 0; i < 10; i++) {

			int num = rn.nextInt(3);
			switch (num) {
			case 0: {
				t0.cry();
				break;
			}
			case 1: {
				t1.cry();
				break;
			}
			case 2: {
				t2.cry();
				break;
			}
			}
		}
		System.out.println("\n------------------------");
		// ��ĳ������ �̿��� ���� ����ġ���� ������ ȿ������ �ڵ� �ۼ�����
		Animal37[] t3 = new Animal37[] {new Dog37(), new Cat37(), new Snake37()};
		for (int i = 0; i < 10; i++) {
			t3[rn.nextInt(3)].cry();
		}
	}
}