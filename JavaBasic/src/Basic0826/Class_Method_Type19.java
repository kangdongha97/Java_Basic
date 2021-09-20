package Basic0826;

//ex19 여러가지 메소드 유형)
class MethodType1{
	// 주의 int a, b x
	void m1(int a, int b) {
		System.out.println(a + " " + b);
		System.out.println(a * b + a);
	}
	void m2(int a, char b, boolean c, float d, String e) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	void m3(MethodType2 a) {
		a.sound();
	}
}
class MethodType2{
	void sound() {
		System.out.println("어흥");
	}
}
public class Class_Method_Type19 {

	public static void main(String[] args) {
		String s1 = "호랑이";
		System.out.println(s1);
		System.out.println(s1.length());
		MethodType1 t1 = new MethodType1();
		t1.m1(3, 4);
		t1.m2(10, '한', true, 3.14f, "호랑이");
		System.out.println("---------------");
		
		MethodType2 t2 = new MethodType2();
		System.out.println(t2.hashCode());
		t1.m3(t2);
		// MethodType2 a = new MethodType2()
		t1.m3(new MethodType2());
	}

}
