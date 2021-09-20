package Basic0827;

//ex40 인터페이스 은행 예시)
interface 한국은행40{
	void 입금();
	void 출금();
	void 이체();
	void 대출();
}

class 국민은행40 implements 한국은행40{
	@Override
	public void 입금() {
		// TODO Auto-generated method stub
		System.out.println("이자율은 3% 입니다.");
	}@Override
	public void 출금() {
		// TODO Auto-generated method stub
		
	}@Override
	public void 이체() {
		// TODO Auto-generated method stub
		
	}@Override
	public void 대출() {
		// TODO Auto-generated method stub
		
	}
	
}
class 우리은행40 implements 한국은행40{
	@Override
	public void 입금() {
		// TODO Auto-generated method stub
		System.out.println("이자율은 5% 입니다.");
	}@Override
	public void 출금() {
		// TODO Auto-generated method stub
		
	}@Override
	public void 이체() {
		// TODO Auto-generated method stub
		
	}@Override
	public void 대출() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Interface_Bank_ex40{
	
	public static void main(String[] args) {
		한국은행40 t1 = new 국민은행40();
		한국은행40 t2 = new 우리은행40();
		t1.입금();
		t2.입금();
	}
}
