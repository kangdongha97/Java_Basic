package Basic0827;

class Car_ex27{
	// �ʵ�
	int fuel = 100;
	String name = "Nan";
	// ������ �޼ҵ�
	Car_ex27(){
		System.out.println("default ������ call");
		name = "����";
	}
	Car_ex27(String n, int f){
		fuel = f;
		name = n;
		System.out.println("�μ� 1 ������ call");
	}
	// �޼ҵ�
	void move() {
		fuel -= 30;
		System.out.println(name + "�ڵ����� �޸���.");
	}
	void stop() {
		fuel -=10;
		System.out.println(name + "�ڵ����� �����.");
		System.out.println(name + "�� ���� ���� : " + fuel);
	}
	void show() {
		System.out.println(name + "�� ���� ���� : " + fuel);
	}
	void inject() {
		fuel += 100;
		System.out.println("���ᰡ ���ԵǾ����ϴ�." + "���� : " + fuel);
	}
	void inject(int f) {
		fuel += f;
		System.out.println("���ᰡ ���ԵǾ����ϴ�." + "���� : " + fuel);
	}
	
}
public class Class_ex27{
	
	public static void main(String[] args) {
		Car_ex27 c1 = new Car_ex27();
		Car_ex27 c2 = new Car_ex27("����", 200);
		c1.move();
		c1.show();
		c2.move();
		c2.show();
		
	}
}
