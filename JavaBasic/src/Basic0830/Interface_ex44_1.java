package Basic0830;

//ex44 - 1) �͸�Ŭ���� ����
interface Animal44_1{
	void m1();
}
class Tiger44_1 implements Animal44_1{
	@Override
	public void m1() { // ����Ű ���
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
		Animal44_1 t2 = new Tiger44_1(); // ��ĳ����
		t2.m1();
		Animal44_1 t3 = new Animal44_1() { // �͸�Ŭ������ �̿��Ͽ� ��ü����, ����Ű ���
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println(2);
			}
		};
		t3.m1();
		new Animal44_1() { // �͸�ü�� �̿��Ͽ� ���, �ν��Ͻ�ȭ, ������ü
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println(3);
			}
		}.m1();
		
		Zoo44_1 t4 = new Zoo44_1(); // �Լ� �μ��� ��ü�� �̿��ؼ� �ڵ带 ����
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
