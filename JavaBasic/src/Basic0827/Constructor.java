package Basic0827;

//ex25 ������)
//1. �����ڴ� �Լ��̴�. > ������ �Լ�
//2. �Լ� �̸��� Ŭ���� �̸��� �ݵ�� ����
//3. ������ �Լ��� ���� ���� ���� �� ���� > void ����
//4. ������ �Լ��� �����ε� ����
//5. ������ �Լ��� ��ü�� ������ �� �� �� �� ȣ���(���Ƿ� ȣ�� �� �� ����)
//6. �����ڸ� ����ϴ� ������ ��� �޼ҵ带 �ʱ�ȭ ��Ű�� �������� ���
//7. ������ �Լ��� �ۼ����� ���� �� ���� �ڵ����� default �����ڰ� �������

class Class_Construct{

	int age = 20;
	String name = "ȫ�浿";
	// �μ������� ���� ������ > default ������
	Class_Construct(){
		System.out.println("������ call");
		//age = 20;
		//name = "ȫ�浿";
	}
	Class_Construct(int a, String n){
		age = a;
		name = n;
	}
	void showInfo() {
		System.out.println(age + " " + name);
	}
}

public class Constructor {

	public static void main(String[] args) {
		Class_Construct t1 = new Class_Construct(); // () ��ü������ �ڵ����� ������ ȣ��
		t1.showInfo();
		Class_Construct t2 = new Class_Construct(); // () ��ü������ �ڵ����� ������ ȣ��
		t2.showInfo();
		Class_Construct t3 = new Class_Construct(100, "������");
		t3.showInfo();
		Class_Construct t4 = new Class_Construct(200, "�޹���");
		t4.showInfo();
	}

}
