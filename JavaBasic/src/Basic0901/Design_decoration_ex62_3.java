package Basic0901;

//ex62 - 3 디자인패턴 - 데코레이션의 활용)
class 커피62_3{
	int 가격 = 30;
	int 계산() {
		System.out.println("커피 주문");
		return 가격;
	}
}
class 설탕62_3 extends 커피62_3{
	int 가격 = 20;
	커피62_3 a; // 곧 사라지게 될 객체를 백업받음
	설탕62_3(커피62_3 a){
		this.a = a;
	}
	int 계산() {
		System.out.println("설탕 추가");
		return 가격 + a.계산();
	}
}
class 프림62_3 extends 커피62_3{
	int 가격 = 30;
	커피62_3 a; // 곧 사라지게 될 객체를 백업받음
	프림62_3(커피62_3 a){
		this.a = a;
	}
	int 계산() {
		System.out.println("프림 추가");
		return 가격 + a.계산();
	}
}
public class Design_decoration_ex62_3{
	
	public static void main(String[] args) {
		
		커피62_3 a = new 커피62_3();
		a = new 설탕62_3(a); // 생성자에 인수 전달하여 사라질 객체를 백업
		a = new 설탕62_3(a); // 많이 추가 가능
		a = new 프림62_3(a);
		a = new 프림62_3(a);
		//System.out.println(a.계산());
		//System.out.println("------------------------------");
		a = new 프림62_3(a);
		System.out.println(a.계산());
	}
}
