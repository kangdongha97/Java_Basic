package Basic0830;

//ex43 - 1 생략되어있는 this)
class Tiger43_1{
	
	//생략되어있음
	//Tiger this;
	//Tiger(Tiger t, int a, int b){ //Tiger t 에는 t1 객체가 전달됨
	//	this = t;
	//}
	
	
	Tiger43_1(int a, int b){
		System.out.println(this.hashCode());
	}
	
	void m1(int a, String b, Tiger43_1 c) {
		System.out.println(1);
	}
	
}


public class This43_1{
	
	public static void main(String[] args) {
		Tiger43_1 t1 = new Tiger43_1(10, 20);
		//t1.m1();
		System.out.println(t1.hashCode());
		
		Tiger43_1 t2 = new Tiger43_1(30, 40);
		System.out.println(t2.hashCode()); // this와 t2객체의 해시코드가 같음, this = t2
	}
}
