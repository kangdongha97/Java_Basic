package Basic0830;

//ex44 - 1) 익명클래스 구현
interface Animal44_1{
	void m1();
}
class Tiger44_1 implements Animal44_1{
	@Override
	public void m1() { // 단축키 사용
		// TODO Auto-generated method stub
		System.out.println(1);
	}
}
class Zoo44_1{
	void m1(Animal44_1 t) {
		t.m1();
	}
}
public class Interface_ex44_1{
	
	public static void main(String[] args) {
		Tiger44_1 t1 = new Tiger44_1();
		t1.m1();
		Animal44_1 t2 = new Tiger44_1(); // 업캐스팅
		t2.m1();
		Animal44_1 t3 = new Animal44_1() { // 익명클래스를 이용하여 객체생성, 단축키 사용
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println(2);
			}
		};
		t3.m1();
		new Animal44_1() { // 익명객체를 이용하여 사용, 인스턴스화, 동적객체
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println(3);
			}
		}.m1();
		
		Zoo44_1 t4 = new Zoo44_1(); // 함수 인수에 객체를 이용해서 코드를 전달
		t4.m1(new Animal44_1() {
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println(4);
			}
		});
		
		t4.m1(t1);
		
	}
}
