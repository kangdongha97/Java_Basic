package Basic0827;

class Car_ex27{
	// 필드
	int fuel = 100;
	String name = "Nan";
	// 생성자 메소드
	Car_ex27(){
		System.out.println("default 생성자 call");
		name = "무명";
	}
	Car_ex27(String n, int f){
		fuel = f;
		name = n;
		System.out.println("인수 1 생성자 call");
	}
	// 메소드
	void move() {
		fuel -= 30;
		System.out.println(name + "자동차가 달린다.");
	}
	void stop() {
		fuel -=10;
		System.out.println(name + "자동차가 멈춘다.");
		System.out.println(name + "의 남은 연료 : " + fuel);
	}
	void show() {
		System.out.println(name + "의 남은 연료 : " + fuel);
	}
	void inject() {
		fuel += 100;
		System.out.println("연료가 주입되었습니다." + "연료 : " + fuel);
	}
	void inject(int f) {
		fuel += f;
		System.out.println("연료가 주입되었습니다." + "연료 : " + fuel);
	}
	
}
public class Class_ex27{
	
	public static void main(String[] args) {
		Car_ex27 c1 = new Car_ex27();
		Car_ex27 c2 = new Car_ex27("꼬마", 200);
		c1.move();
		c1.show();
		c2.move();
		c2.show();
		
	}
}
