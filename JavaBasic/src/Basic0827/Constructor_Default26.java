package Basic0827;


// ex26 default 생성자)
class class_Constructor_Default{
	class_Constructor_Default(){} // default 생성자를 사용하지 않아도 만들어 놓음
	
	class_Constructor_Default(int a, int b){
		
	}
}

public class Constructor_Default26{
	
	public static void main(String[] args) {
		
		class_Constructor_Default t1 = new class_Constructor_Default();
		class_Constructor_Default t2 = new class_Constructor_Default(10, 20);
	}
}