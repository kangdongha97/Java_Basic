package Basic0827;

//ex32 super, �θ�� �ڽ� Ŭ������ ������ Ȱ��)
class Animal32{
	Animal32(){
		System.out.println("�θ� ������ call");
	}
	Animal32(int n){
		System.out.println(n + 100);
	}
}
class Tiger32 extends Animal32{
	Tiger32(){
		// ���� ���ο� �ڵ尡 �� ���� �����Ǿ� ����
		super(); // �θ��� �����ڸ� ȣ��, ������ �ڵ����� ����� 
		System.out.println("�ڽ� ������ call");
	}
	Tiger32(int num){
		super(100); // �θ��� ������ ȣ��, ������ �ڵ����� �����
		System.out.println(num);
	}
	Tiger32(int a, int b){
		super(a*b); // super�� �ݵ�� �ڵ��� ù ��° �ٿ� �ۼ��Ǿ����
		// ���� super�� �θ��� Ư�� �����ڸ� ȣ���� �� ���
		System.out.println("�� ��° ������");
	}
}
public class Super32{
	
	public static void main(String[] args) {
		// ��ü ������ �ڽ��� ������ Tiger ���� > super(); ����
		// 
		Tiger32 t1 = new Tiger32();
		Tiger32 t2 = new Tiger32(100);
		Tiger32 t3 = new Tiger32(3, 4);
	}
}
