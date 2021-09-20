package Basic0830;

//ex42 final 3가지 상수, 함수, 클래스)
final class Animal42{ // 마지막 상속임을 의미
	final int NUM = 10; // final 상수 이 값을 더이상 변경할 수 없음
	
	final void M1() { // final 함수는 해당 함수가 마지막 오버라이딩을 의미함, 타 클래스는 상속받지못함
		
	}
}

//class Tiger42 extends Animal42{ final class 는 상속x
//	void M1() {
//		
//	}
//}
public class Final42{
	
	public static void main(String[] args) {
		Animal42 t1 = new Animal42();
		// t1.num;
		System.out.println(Math.PI);
		String s = null; //String 클래스도 final
	}
}
