package Basic0827;

//ex28 static) 
//static 멤버는 객체생성 여부와 관계없이 만들어져있음
//객체간의 전역 멤버, 공용으로 사용하기 위함
//객체를 생성시킬때 비용이 많이듬 > static 을 이용해 비용절감

class Static_ex28{
	int num1;
	static int num2 = 100;
	
	static void m1() {
		System.out.println("static 함수 call");
	}
}
public class Static28{
	
	public static void main(String[] args) {
		
		System.out.println(Static_ex28.num2); // 객체생성하지 않고 클래스.멤버 형식으로 static 멤버 사용
		Static_ex28 t1 = new Static_ex28();
		Static_ex28 t2 = new Static_ex28();
		System.out.println(t1.num2); // 작동은 하지만 이렇게 사용하지 않음
		t2.num2 = 200;
		System.out.println(t1.num2);
		System.out.println(Static_ex28.num2);
		Static_ex28.m1();
		// 예시
		System.out.println(Math.abs(-10)); // Math 클래스의 abs 함수는 static으로 정의되어 있음을 알 수 있음
		
	}
}
