package Basic0901;

//ex59 접근지정자 활용
class Tiger59{
	private String name;
	private int age;
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
}
public class Access_Modifiers_ex59{
	
	public static void main(String[] args) {
		
		Tiger59 t1 = new Tiger59();
		t1.setAge(1);
		System.out.println(t1.getAge());
	}
}
