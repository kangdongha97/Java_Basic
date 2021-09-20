package Basic0830;

//ex43 - 4 자기자신을 객체로 넘길때 this 사용)
class Tiger43_4{
	void m1(Tiger43_4 t){
		Rion43_4 t1 = new Rion43_4();

		t1.marry(this);
		
	}
	int m2() {
		System.out.println("제가 가지고 있는 재산은");
		return 100;
	}
	String m3() {
		return "난폭";
	}
}
class Rion43_4{
	boolean marry(Tiger43_4 t) {
		if(t.m2() > 80) {
			System.out.println("감사합니다.");
			return true;
		}
		else {
			
			String s = t.m3();
			switch(s) {
			case "온순":
				System.out.println("ㅇㅋ");
				return true;
			case "난폭":
				System.out.println("ㄴㄴ");
				return false;
			
			}
			return false;
		}
	}

}
public class This43_4{
	
	public static void main(String[] args) {
		
		Tiger43_4 t1 = new Tiger43_4();
		t1.m1(t1);
	}
}
