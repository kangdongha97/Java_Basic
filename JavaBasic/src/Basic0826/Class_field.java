package Basic0826;

//ex17 Ŭ������ ��ü, �ʵ�)
class Field{
	// �ʵ� (Ŭ�����ȿ��� ����Ǵ� ����) = ���� = ���
	int a;
	int b = 20;
	int c, d = 30;
	// ������
	// �޼ҵ�

}
public class Class_field {

	public static void main(String[] args) {
		// ��ü���� (�ν��Ͻ�ȭ)
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
		// ��� ��ü�� ��ü�� ������ �� �ݵ�� �ڱ� �ڽ��� ������ ��ȣ�� ����
		System.out.println(t1.hashCode()); // �����ĺ� ��ȣ
		System.out.println(t2.hashCode());

		Field t3;
		t3 = t2;
		System.out.println(t3.hashCode()); // �޸𸮸� �����Ѵ� (����)
		t3.a = 999;
		System.out.println(t2.a);
		System.out.println(t3.a);
	}

}
