package Basic0830;

//ex43 - 2 this�� ���)
class Tiger43_2{
	//Tiger this;
	//Tiger(Tiger t){
	//	this = t;
	//}
	int x, y;
	int size;
	// �ҽ� > ���ʷ����� ����Ʈ���� ��¡ �ʵ� > ������ �������
	Tiger43_2(int x, int y, int size){ //������ �߿�
		this.x = x; // �ʵ� x = �����μ� x ���θ� �����ϱ� ���� this ���
		this.y = y; 
		this.size = size;
	}
	void show() {
		System.out.println(this.x + " " + this.y + " " + this.size);
	}
}
public class This43_2{
	
	public static void main(String[] args) {
		Tiger43_2 t1 = new Tiger43_2(10, 20, 30);
		int num = 10;
		//num = num; // �ڱ� ����, �������
		t1.show();
	}
}
