package Basic0901;

//ex62 - 1 ���������� ���ڷ��̼�)
class AA{}
class BB extends AA{}
class CC extends AA{}
public class Design_decoration62_1{
	
	public static void main(String[] args) {
		AA a1 = new BB();
		System.out.println(a1.hashCode());
		a1 = new CC(); // ���ο� ��ü�� �Ǿ����
		System.out.println(a1.hashCode());
		a1 = new BB();
		System.out.println(a1.hashCode());
		
		// ���ο� ��ü�� �����ϱ� �� ���
		AA a2 = a1;
		a1 = new BB();
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
	}
}
