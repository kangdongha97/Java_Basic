package Basic0901;

//ex58 접근지정자와 set, get)
class Tiger58{
	private int a; // 클래스 내에서만 접근 가능
	public int b;
	
	private int num;
	// set, get 제너레이터로 자동생성 제공
	// 인수를 받아 private 변수에 접근
	public void setNum(int num) { // private에 접근하기 위해 만든 메소드이름은 set ~
		this.num = num;
	}
	// private 변수 리턴
	public int getNum() {
		return this.num;
	}
	
	void m1() {
		a = 100;
		b = 200;
	}
	
	private void m2() {	// 함수에도 접근지정자가 있음
		
	}
	
}
public class Access_Modifiers58{
	
	public static void main(String[] args) {
	
		Tiger58 t = new Tiger58();
		t.b = 10;
		//t.a;
		t.setNum(100);
		System.out.println(t.getNum());
	}
}
