package Basic0830;

//ex45 - 3)
//�������ذ� : ���ο� Ŭ������ ���鶧 ���� �Լ��� �������� > �������̽�ȭ ��Ŵ > ��ĳ�������� ���
//������ : stop �Լ��� �߰�
class Baduk45_3{
	Baduk45_3(){
		System.out.println("�뱹�� �����մϴ�.");
	}
	void play(Ai45_3 ai) {
		ai.play();
	}
}
interface Ai45_3{
	void play();
}
//���ۿ��� ����
class Alphago45_3 implements Ai45_3{
	public void play() {
		System.out.println("�ΰ������� ���İ��Դϴ�.");
	}
}
//�Ƹ������� ����
class Betago45_3 implements Ai45_3{
	public void play() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
	}
}
public class Baduk_ex45_3{
	
	public static void main(String[] args) {
		Baduk45_3 baduk = new Baduk45_3();
		baduk.play(new Alphago45_3());
		baduk.play(new Betago45_3());
	}
}
