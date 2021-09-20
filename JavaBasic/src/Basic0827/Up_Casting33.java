package Basic0827;

//ex33 다형성 문법, 업캐스팅)
class Animal33{
	Animal33(){
		
	}
	void m1() {
		System.out.println(1);
	}
	void m3() {
		System.out.println(31);
	}
}
class Tiger33 extends Animal33{
	Tiger33(){
		
	}
	void m2() {
		System.out.println(2);
	}
	void m3() {
		System.out.println(32);
	}
}

public class Up_Casting33{
	
	public static void main(String[] args) {
		Animal33 t1 = new Animal33();
		Tiger33 t2 = new Tiger33();
		Animal33 t3 = new Tiger33(); // 업캐스팅
		// Tiger t4 = new Animal(); 에러, 사용하지 않음 다운캐스팅
		t3.m1(); // Animal 문법으로 객체를 생성했기 때문에 m2 사용 불가
		// 업캐스팅의 목적
		// 자식 클래스에 해당 함수가 있는지 확인 후 없으면 부모 클래스의 m3 호출, 있으면 자식의 m3 호출
		// 위의 기능을 위해 부모 클래스와 자식 클래스 메모리 둘 다 확보
		t3.m3();
	}
}
