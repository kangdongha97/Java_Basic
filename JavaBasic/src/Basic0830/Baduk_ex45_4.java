package Basic0830;

//ex45 - 4)
//������ : ��ü ȣ��

class Baduk45_4{
	Baduk45_4(){
		System.out.println("�뱹�� �����մϴ�.");
	}
	void play(Ai45_4 ai) {
		ai.play();
	}
	void stop(Ai45_4 ai) {
		ai.stop();
	}
}

interface Ai45_4{
	void play();
	void stop();
}

//���ۿ��� ����
class Alphago45_4 implements Ai45_4{
	public void play() {
		System.out.println("�ΰ������� ���İ��Դϴ�.");
	}
	public void stop() {
		System.out.println("���İ� ���� ����� �մϴ�.");	
	}
}

//�Ƹ������� ����
class Betago45_4 implements Ai45_4{
	public void play() {
		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
	}
	public void stop() {
		System.out.println("��Ÿ�� ���� ����� �մϴ�.");
		
	}
}

public class Baduk_ex45_4{
	
	public static void main(String[] args) {
		Baduk45_4 baduk = new Baduk45_4();
		baduk.play(new Alphago45_4());
		baduk.play(new Betago45_4());
		baduk.stop(new Alphago45_4());
		baduk.stop(new Betago45_4());
		
	}
}