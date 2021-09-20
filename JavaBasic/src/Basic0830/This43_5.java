package Basic0830;

//ex43 - 5 생성자 안에서 다른 생성자를 호출할 때 this 사용)
class Tiger43_5{
	Tiger43_5(){
		System.out.println(1);
	}
	Tiger43_5(int a){
		this();
		System.out.println(a);
	}
	Tiger43_5(int a, int b){
		this(a + b); // 생성자안에서 다른 생성자를 호출할 때 사용
		System.out.println(a + " " + b);
	}
	
}
public class This43_5{
	
	public static void main(String[] args) {
		Tiger43_5 t1 = new Tiger43_5(10, 20);
		
		
	}
}
