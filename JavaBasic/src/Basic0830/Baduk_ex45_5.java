package Basic0830;

//ex45 - 5 �������̽�, injection ����)
//�������ذ� : ��ü ȣ�� > �����ڿ��� �μ�����

class Baduk45_5{
	Ai45_5 ai;
	Baduk45_5(Ai45_5 ai){
		this.ai = ai;
		System.out.println("�뱹�� �����մϴ�.");
	}
	void play() {
		ai.play();
	}
	void stop() {
		ai.stop();
	}
}

interface Ai45_5{
	void play();
	void stop();
}

//���ۿ��� ����
class Alphago45_5 implements Ai45_5{
	public void play() {
		System.out.println("�ΰ������� ���İ��Դϴ�.");
	}
	public void stop() {
		System.out.println("���İ� ���� ����� �մϴ�.");	
	}
}

//�Ƹ������� ����
class Betago45_5 implements Ai45_5{
	public void play() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
	}
	public void stop() {
		System.out.println("��Ÿ�� ���� ����� �մϴ�.");
		
	}
}

public class Baduk_ex45_5{
	
	public static void main(String[] args) {
		Baduk45_5 baduk1 = new Baduk45_5(new Alphago45_5());
		Baduk45_5 baduk2 = new Baduk45_5(new Betago45_5());
		
		baduk1.play();
		baduk2.play();
		baduk1.stop();
		baduk2.stop();
		
	}
}
