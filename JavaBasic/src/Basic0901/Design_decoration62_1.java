package Basic0901;

//ex62 - 1 디자인패턴 데코레이션)
class AA{}
class BB extends AA{}
class CC extends AA{}
public class Design_decoration62_1{
	
	public static void main(String[] args) {
		AA a1 = new BB();
		System.out.println(a1.hashCode());
		a1 = new CC(); // 새로운 객체가 되어버림
		System.out.println(a1.hashCode());
		a1 = new BB();
		System.out.println(a1.hashCode());
		
		// 새로운 객체를 생성하기 전 백업
		AA a2 = a1;
		a1 = new BB();
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
	}
}
