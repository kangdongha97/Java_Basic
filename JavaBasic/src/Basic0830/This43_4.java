package Basic0830;

//ex43 - 4 �ڱ��ڽ��� ��ü�� �ѱ涧 this ���)
class Tiger43_4{
	void m1(Tiger43_4 t){
		Rion43_4 t1 = new Rion43_4();

		t1.marry(this);
		
	}
	int m2() {
		System.out.println("���� ������ �ִ� �����");
		return 100;
	}
	String m3() {
		return "����";
	}
}
class Rion43_4{
	boolean marry(Tiger43_4 t) {
		if(t.m2() > 80) {
			System.out.println("�����մϴ�.");
			return true;
		}
		else {
			
			String s = t.m3();
			switch(s) {
			case "�¼�":
				System.out.println("����");
				return true;
			case "����":
				System.out.println("����");
				return false;
			
			}
			return false;
		}
	}

}
public class This43_4{
	
	public static void main(String[] args) {
		
		Tiger43_4 t1 = new Tiger43_4();
		t1.m1(t1);
	}
}
