package Basic0901;

//ex60 디자인패턴 - 싱글톤패턴 하나의 클래스에 하나의 객체만 생성할 수 있는 패턴)
//객체 하나를 만들때 비용이 많이들거나 두개이상의 객체가 필요없는 곳에 활용
class Tiger60{
	
	int num;
	private static Tiger60 instance = null; // 객체가 아니라는 것을 의미 (객체 생성전)
	
	private Tiger60(){} // private 생성자 외부에서 호출 불가 > 객체생성 불가
	
	static Tiger60 getInstance() { // static 함수안에서는 static 변수만 사용가능
		if(instance == null) {
			System.out.println(1);
			instance = new Tiger60();
	
		}
		return instance;
	}
	
	void m1() {
		
	}
}
public class Design_Singletone60{
	
	public static void main(String[] args) {
		
		//Tiger t1 = new Tiger();
		//Tiger t2 = new Tiger();
		Tiger60 t1 = Tiger60.getInstance(); // static
		Tiger60 t2 = Tiger60.getInstance(); // if문에 의해 생성안됨
	
		System.out.println(t1.hashCode()); // t1, t2 서로 같은 객체
		System.out.println(t2.hashCode());
		
		t1.m1();
		t2.m1();
		
		t1.num = 2000;
		System.out.println(t1.num);
		System.out.println(t2.num); // 서로 같은 객체
		
	}
}