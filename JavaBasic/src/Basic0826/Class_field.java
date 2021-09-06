package Basic0826;

//ex17 클래스와 객체, 필드)
class Field{
	// 필드 (클래스안에서 선언되는 변수) = 변수 = 멤버
	int a;
	int b = 20;
	int c, d = 30;
	// 생성자
	// 메소드

}
public class Class_field {

	public static void main(String[] args) {
		// 객체생성 (인스턴스화)
		Field t1 = new Field();
		Field t2 = new Field();
		t1.a = 100;
		t1.c = t1.a + 30;
		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println(t1.c);
		System.out.println(t1.d);
		System.out.println(t2.c);

		System.out.println();
		// 모든 객체는 객체가 생성될 때 반드시 자기 자신의 고유한 번호를 지님
		System.out.println(t1.hashCode()); // 고유식별 번호
		System.out.println(t2.hashCode());

		Field t3;
		t3 = t2;
		System.out.println(t3.hashCode()); // 메모리를 공유한다 (참조)
		t3.a = 999;
		System.out.println(t2.a);
		System.out.println(t3.a);
	}

}
