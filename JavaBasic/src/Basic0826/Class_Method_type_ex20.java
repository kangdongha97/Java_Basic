package Basic0826;

//ex20 �������� �޼ҵ� Ÿ�� Ȱ��)
class MethodType_ex1{
	String m1() {

		return "������";
	}
	MethodType_ex2 m2() {
		//return new MethodType_ex2(); �Ʒ��� ����
		MethodType_ex2 t = new MethodType_ex2();
		return t;
	}
	MethodType_ex2 m3 (MethodType_ex2 t) {
		return t;
	}
}
class MethodType_ex2{
	void show() {
		System.out.println(1000);
	}
}
public class Class_Method_type_ex20 {

	public static void main(String[] args) {
		MethodType_ex1 t1 = new MethodType_ex1();
		String s1 = t1.m1();
		System.out.println(s1);
		System.out.println(t1.m1());

		MethodType_ex2 t2 = t1.m2();
		t2.show();

		MethodType_ex2 t3 = t1.m3(new MethodType_ex2());
		t3.show();

		t1.m3(new MethodType_ex2()).show();
	}

}
