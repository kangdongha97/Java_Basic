package Basic0901;

//ex56 람다함수의 문법
interface Test1_56{
	void m1();
}

interface Test2_56{
	void m1(int num);
}

interface Test3_56{
	int m1();
}

interface Test4_56{
	String m1(int n, String s);
}


public class Lambda56{
	
	public static void main(String[] args) {
		Test1_56 t1 = new Test1_56() {
			@Override
			public void m1() {
				System.out.println(1);
			}
		};
		t1.m1();
		System.out.println("--------------------------------------");
		
		// 람다함수 ex2) 람다함수는 인터페이스 안에 함수가 1개밖에 없다는 전제를 두고 사용
		Test1_56 t2 = () -> {
			System.out.println(2);

		};
		t2.m1();
		
		// 인수전달이 있는 람다함수 ex3)
		Test2_56 t3 = (n) -> {
			System.out.println(n);
		};
		t3.m1(100);
		System.out.println("--------------------------------------");
		// 리턴이 있는 람다함수 ex4) 리턴 키워드 작성
		Test3_56 t4 = () -> {
			System.out.println(3);
			return 100;
		};
		
		System.out.println(t4.m1());
		
		System.out.println("--------------------------------------");
		// 리턴과 인수전달 둘다 있는 람다 함수 ex5)
		Test4_56 t5 = (n, s) -> {
			System.out.println(n + s);
			return n + s;
		};
		System.out.println(t5.m1(200, "호랑이"));
	
		System.out.println("--------------------------------------");
		// 람다함수 ex6 리턴을 생략한 형태, {} 같이 생략해야함)
		// 코드가 단줄이고, 인수없고, 리턴만 있는 형태에서 사용가능
		Test3_56 t6 = () -> 100;
		System.out.println(t6.m1());
		
		
	}
}
