package Basic0827;

//ex25 생성자)
//1. 생성자는 함수이다. > 생성자 함수
//2. 함수 이름은 클래스 이름과 반드시 동일
//3. 생성자 함수는 리턴 값을 가질 수 없음 > void 생략
//4. 생성자 함수도 오버로딩 가능
//5. 생성자 함수는 객체가 생성될 때 단 한 번 호출됨(임의로 호출 할 수 없음)
//6. 생성자를 사용하는 목적은 멤버 메소드를 초기화 시키는 목적으로 사용
//7. 생성자 함수를 작성하지 않을 시 에는 자동으로 default 생성자가 만들어짐

class Class_Construct{

	int age = 20;
	String name = "홍길동";
	// 인수전달이 없는 생성자 > default 생성자
	Class_Construct(){
		System.out.println("생성자 call");
		//age = 20;
		//name = "홍길동";
	}
	Class_Construct(int a, String n){
		age = a;
		name = n;
	}
	void showInfo() {
		System.out.println(age + " " + name);
	}
}

public class Constructor {

	public static void main(String[] args) {
		Class_Construct t1 = new Class_Construct(); // () 객체생성시 자동으로 생성자 호출
		t1.showInfo();
		Class_Construct t2 = new Class_Construct(); // () 객체생성시 자동으로 생성자 호출
		t2.showInfo();
		Class_Construct t3 = new Class_Construct(100, "독수리");
		t3.showInfo();
		Class_Construct t4 = new Class_Construct(200, "앵무새");
		t4.showInfo();
	}

}
