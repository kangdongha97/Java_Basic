package Basic0827;

//ex34 업캐스팅 활용)
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
		System.out.println("멍멍");
	}
}

class Cat34 extends Animal34{
	Cat34(){
		
	}
	void cry() {
		System.out.println("야옹");
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
	// 확장에서 열려있음, 코드의 변경에는 닫혀있음 개방폐쇄의 원칙
	void sound(Animal34 t) {
		t.cry();
	}
}

public class Up_Casting_ex34{
	
	public static void main(String[] args) {
		Animal34 t1 = new Dog34();
		Animal34 t2 = new Cat34();
		Animal34 t3 = new Snake34();
		t1.cry(); // 자식클래스에 cry 함수가 있기 때문에 자식클래스 cry 호출
		t2.cry(); // 자식클래스에 cry 함수가 있기 때문에 자식클래스 cry 호출
		t3.cry(); // 자식클래스에 cry 함수가 없기 때문에 부모클래스 cry 호출
		
		Dog34 t4 = new Dog34();
		Cat34 t5 = new Cat34();
		Snake34 t6 = new Snake34();
		t4.cry();
		t5.cry(); 
		t6.cry();
		System.out.println("----------------------------------");
		// 동물이 추가될 때 마다 Zoo 클래스에 함수를 추가해야하기 때문에 그렇게 하지 않고 위의 업캐스팅 사용
		Zoo34 t7 = new Zoo34();
		t7.sound(new Dog34());
		t7.sound(new Cat34());
		t7.sound(new Snake34());
		
	}
}
