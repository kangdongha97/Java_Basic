package Basic0827;

//ex29 static과 class 이해)
class StaticEX29{
	StaticEX29(){
		
	}
	static void myMain() {
		StaticEX29 t = new StaticEX29();
		t.m1(); // m1이 static이 아니기때문에 객체를 생성하여 사용
		// m1(); static이 아니기때문에 객체생성하지 않고는 사용 불가 
	}
	void m1() {
		
	}
}

public class Static_ex29{
	
	static int num = 10;
	
	Static_ex29(){
		
	}
	
	static void m1() {
		System.out.println("1번 call");
	}
	
	// main에 static이 없다면 운영체제가 main을 호출하지 못함 객체생성하지못하기 때문에
	public static void main(String[] args) {
		System.out.println(num); // static 멤버 안에서는 static 멤버만 사용가능
		m1(); // static 함수 안에서는 static 멤버만 사용가능
		Static_ex29 h = new Static_ex29();
		h.m2(); // 함수가 static이 아닐경우 객체를 생성하여 사용가능
		Static_ex29.m1(); // static 이기때문에 객체생성 하지 않고 사용가능
		// Hello.m2(); static이 아니기 때문에 사용불가
	}
	
	void m2() {
		System.out.println("2번 call");
	}
	
}
