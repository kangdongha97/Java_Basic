package Basic0901;

//ex63 컨테이너, 제네릭 문법 원리)
class A63{
	private int data;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}
class B63{
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
class C63{
	private float data;

	public float getData() {
		return data;
	}

	public void setData(float data) {
		this.data = data;
	}
	
}
public class Container63{
	
	public static void main(String[] args) {
		A63 a = new A63();
		a.setData(100);
		System.out.println(a.getData());
		
		B63 b = new B63();
		b.setData("호랑이");
		System.out.println(b.getData());
		
		C63 c = new C63();
		c.setData(100);
		System.out.println(c.getData());
		
	}
}
