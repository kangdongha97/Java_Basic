package Basic0830;

//ex43 - 5 ������ �ȿ��� �ٸ� �����ڸ� ȣ���� �� this ���)
class Tiger43_5{
	Tiger43_5(){
		System.out.println(1);
	}
	Tiger43_5(int a){
		this();
		System.out.println(a);
	}
	Tiger43_5(int a, int b){
		this(a + b); // �����ھȿ��� �ٸ� �����ڸ� ȣ���� �� ���
		System.out.println(a + " " + b);
	}
	
}
public class This43_5{
	
	public static void main(String[] args) {
		Tiger43_5 t1 = new Tiger43_5(10, 20);
		
		
	}
}
