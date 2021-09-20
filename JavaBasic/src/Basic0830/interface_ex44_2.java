package Basic0830;

//ex44 -2) 익명클래스 활용
interface Animal44_2{
	void m1();
}
class Zoo44_2{
	void sound(Animal44_2 t) {
		t.m1();
	}
}
public class interface_ex44_2{
	
	public static void main(String[] args) {
	
		Animal44_2 t1 = new Animal44_2() {
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println(1);
			}
		};
		t1.m1();
		
		Zoo44_2 t2 = new Zoo44_2();
		t2.sound(new Animal44_2() {
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println(2);
			}
		});
		
	}
}
