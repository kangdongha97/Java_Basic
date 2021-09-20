package Basic0901;

import java.util.LinkedList;

//ex64 컨테이너, 제네릭 문법 사용)
//같은 타입
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
		A64<Integer> a = new A64<Integer>(); // 무조건 Integer 타입으로 전환하여 객체 생성
		a.setData(100);
		System.out.println(a.getData());
		
		A64<String> b = new A64<String>(); // 무조건 String 타입으로 전환하여 객체 생성
		b.setData("호랑이");
		System.out.println(b.getData());
		
		LinkedList<Integer> mm = new LinkedList<Integer>();
	}
}