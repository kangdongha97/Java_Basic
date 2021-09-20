package Basic0830;

//ex47 exception 발생 시켰을때 에러를 피하는 방법, throw, throws)
//사용자가 직접 파악해서 이용하라고 unhandled exception 으로 만들어짐
class Tiger47{
	void m1() {
		System.out.println(1);
		
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception 발생함");
		}
	}
	
	void m2() throws Exception { // 함수 호출하는 측에서 예외를 다루어야함
		System.out.println(2);
		throw new Exception();

	}
}
public class Throw47{
	
	public static void main(String[] args) {
		Tiger47 t1 = new Tiger47();
		t1.m1();
		// unhandled exception 예외 떠넘김
		try {
			t1.m2();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(3);
		
		
	}
}
