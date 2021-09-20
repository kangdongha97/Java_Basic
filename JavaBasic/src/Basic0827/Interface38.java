package Basic0827;

//ex38 인터페이스)
//abstract class Animal{ // 내부에 abstract 함수를 가지고 있으면 클래스도 abstract 이어야함
//	abstract void m1(); // {}가 없는 코드 > 미완성 코드 > abstract
//} //인터페이스 역할만 함 >> interface 함수 내부에 코드가 없는 클래스

interface Animal38{
	abstract void m1(); // 인터페이스에서는 abstract 생략가능
}


class Tiger38 implements Animal38{ // 인터페이스를 상속받을 때는 implements
	// 완성되지 않은 m1은 자식클래스에서 완성되어야함
	public void m1() { // abstract의 본 함수는 public으로 작성되어야 함
		System.out.println(2);
	}
}

public class Interface38{
	
	public static void main(String[] args) {
		Animal38 t1 = new Tiger38();
		t1.m1();
		
		//Animal38 t2 = new Animal38();
		//인터페이스로 객체생성 불가 내부에 코드가 없음
	}
}
