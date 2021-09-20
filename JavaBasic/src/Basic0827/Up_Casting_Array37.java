package Basic0827;

import java.util.Random;

//ex37 업캐스팅과 배열 활용)
class Animal37{
	Animal37(){
		
	}
	// 다형성 프로그램 > cry라는 함수가 다양한 형태로 나타나는 결과의 구조를 가짐
	void cry() {
		System.out.println("...");
	}
}

class Dog37 extends Animal37{
	Dog37(){
		
	}
	void cry() {
		System.out.println("멍멍");
	}
}

class Cat37 extends Animal37{
	Cat37(){
		
	}
	void cry() {
		System.out.println("야옹");
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
		// 업캐스팅을 이용해 위의 스위치문과 같지만 효율적인 코드 작성가능
		Animal37[] t3 = new Animal37[] {new Dog37(), new Cat37(), new Snake37()};
		for (int i = 0; i < 10; i++) {
			t3[rn.nextInt(3)].cry();
		}
	}
}