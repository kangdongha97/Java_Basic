package Basic0827;

//ex32 super, 부모와 자식 클래스의 생성자 활용)
class Animal32{
	Animal32(){
		System.out.println("부모 생성자 call");
	}
	Animal32(int n){
		System.out.println(n + 100);
	}
}
class Tiger32 extends Animal32{
	Tiger32(){
		// 현재 라인에 코드가 한 줄이 생략되어 있음
		super(); // 부모의 생성자를 호출, 생략시 자동으로 실행됨 
		System.out.println("자식 생성자 call");
	}
	Tiger32(int num){
		super(100); // 부모의 생성자 호출, 생략시 자동으로 실행됨
		System.out.println(num);
	}
	Tiger32(int a, int b){
		super(a*b); // super는 반드시 코드의 첫 번째 줄에 작성되어야함
		// 보통 super는 부모의 특정 생성자를 호출할 때 사용
		System.out.println("세 번째 생성자");
	}
}
public class Super32{
	
	public static void main(String[] args) {
		// 객체 생성시 자신의 생성자 Tiger 실행 > super(); 실행
		// 
		Tiger32 t1 = new Tiger32();
		Tiger32 t2 = new Tiger32(100);
		Tiger32 t3 = new Tiger32(3, 4);
	}
}
