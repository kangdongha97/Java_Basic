package Basic0830;

//ex45 - 2)
//�������ذ� : �ΰ������� �ٲ�ٸ� ��� �� ���ΰ�? > �����ε�
//������ : ���ο� Ŭ������ ���鶧 ���� �Լ��� ��������
class Baduk45_2{
	Baduk45_2(){
		System.out.println("�뱹�� �����մϴ�.");
	}
	void play(Alphago45_2 alphago) { // �����ε�
		alphago.play();
	}
	void play(Betago45_2 betago) { // �����ε�
		betago.play();
	}
}
//���ۿ��� ����
class Alphago45_2{
	void play() {
		System.out.println("�ΰ������� ���İ��Դϴ�.");
	}
}
//�Ƹ������� ����
class Betago45_2{
	void play() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
	}
}
public class Baduk_ex45_2{
	
	public static void main(String[] args) {
		Baduk45_2 baduk = new Baduk45_2();
		baduk.play(new Alphago45_2());
		baduk.play(new Betago45_2());
	}
}
