package Basic0901;

import java.util.LinkedList;

//ex64 �����̳�, ���׸� ���� ���)
//���� Ÿ��
class A64<T>{
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
public class Generic64{
	
	public static void main(String[] args) {
		A64<Integer> a = new A64<Integer>(); // ������ Integer Ÿ������ ��ȯ�Ͽ� ��ü ����
		a.setData(100);
		System.out.println(a.getData());
		
		A64<String> b = new A64<String>(); // ������ String Ÿ������ ��ȯ�Ͽ� ��ü ����
		b.setData("ȣ����");
		System.out.println(b.getData());
		
		LinkedList<Integer> mm = new LinkedList<Integer>();
	}
}