package Basic0901;

//ex62 - 3 ���������� - ���ڷ��̼��� Ȱ��)
class Ŀ��62_3{
	int ���� = 30;
	int ���() {
		System.out.println("Ŀ�� �ֹ�");
		return ����;
	}
}
class ����62_3 extends Ŀ��62_3{
	int ���� = 20;
	Ŀ��62_3 a; // �� ������� �� ��ü�� �������
	����62_3(Ŀ��62_3 a){
		this.a = a;
	}
	int ���() {
		System.out.println("���� �߰�");
		return ���� + a.���();
	}
}
class ����62_3 extends Ŀ��62_3{
	int ���� = 30;
	Ŀ��62_3 a; // �� ������� �� ��ü�� �������
	����62_3(Ŀ��62_3 a){
		this.a = a;
	}
	int ���() {
		System.out.println("���� �߰�");
		return ���� + a.���();
	}
}
public class Design_decoration_ex62_3{
	
	public static void main(String[] args) {
		
		Ŀ��62_3 a = new Ŀ��62_3();
		a = new ����62_3(a); // �����ڿ� �μ� �����Ͽ� ����� ��ü�� ���
		a = new ����62_3(a); // ���� �߰� ����
		a = new ����62_3(a);
		a = new ����62_3(a);
		//System.out.println(a.���());
		//System.out.println("------------------------------");
		a = new ����62_3(a);
		System.out.println(a.���());
	}
}
