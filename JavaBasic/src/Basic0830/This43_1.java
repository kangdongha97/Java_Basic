package Basic0830;

//ex43 - 1 �����Ǿ��ִ� this)
class Tiger43_1{
	
	//�����Ǿ�����
	//Tiger this;
	//Tiger(Tiger t, int a, int b){ //Tiger t ���� t1 ��ü�� ���޵�
	//	this = t;
	//}
	
	
	Tiger43_1(int a, int b){
		System.out.println(this.hashCode());
	}
	
	void m1(int a, String b, Tiger43_1 c) {
		System.out.println(1);
	}
	
}


public class This43_1{
	
	public static void main(String[] args) {
		Tiger43_1 t1 = new Tiger43_1(10, 20);
		//t1.m1();
		System.out.println(t1.hashCode());
		
		Tiger43_1 t2 = new Tiger43_1(30, 40);
		System.out.println(t2.hashCode()); // this�� t2��ü�� �ؽ��ڵ尡 ����, this = t2
	}
}
