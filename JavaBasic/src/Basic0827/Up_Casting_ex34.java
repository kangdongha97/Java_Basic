package Basic0827;

//ex34 ��ĳ���� Ȱ��)
class Animal34{
	Animal34(){
		
	}
	void cry() {
		System.out.println("...");
	}
}

class Dog34 extends Animal34{
	Dog34(){
		
	}
	void cry() {
		System.out.println("�۸�");
	}
}

class Cat34 extends Animal34{
	Cat34(){
		
	}
	void cry() {
		System.out.println("�߿�");
	}
}

class Snake34 extends Animal34{
	Snake34(){
		
	}
}

class Zoo34{
	Zoo34(){
		
	}
	//void sound(Dog t) {
	//	t.cry();
	//}
	//void sound(Cat t) {
	//	t.cry();
	//}
	//void sound(Snake t) {
	//	t.cry();
	//}
	// Ȯ�忡�� ��������, �ڵ��� ���濡�� �������� ��������� ��Ģ
	void sound(Animal34 t) {
		t.cry();
	}
}

public class Up_Casting_ex34{
	
	public static void main(String[] args) {
		Animal34 t1 = new Dog34();
		Animal34 t2 = new Cat34();
		Animal34 t3 = new Snake34();
		t1.cry(); // �ڽ�Ŭ������ cry �Լ��� �ֱ� ������ �ڽ�Ŭ���� cry ȣ��
		t2.cry(); // �ڽ�Ŭ������ cry �Լ��� �ֱ� ������ �ڽ�Ŭ���� cry ȣ��
		t3.cry(); // �ڽ�Ŭ������ cry �Լ��� ���� ������ �θ�Ŭ���� cry ȣ��
		
		Dog34 t4 = new Dog34();
		Cat34 t5 = new Cat34();
		Snake34 t6 = new Snake34();
		t4.cry();
		t5.cry(); 
		t6.cry();
		System.out.println("----------------------------------");
		// ������ �߰��� �� ���� Zoo Ŭ������ �Լ��� �߰��ؾ��ϱ� ������ �׷��� ���� �ʰ� ���� ��ĳ���� ���
		Zoo34 t7 = new Zoo34();
		t7.sound(new Dog34());
		t7.sound(new Cat34());
		t7.sound(new Snake34());
		
	}
}
