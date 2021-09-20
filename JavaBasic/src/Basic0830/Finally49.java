package Basic0830;

//ex49 finally)
class Tiger49{
	void m1(int a, int b) {
		if(a > b) {
			System.out.println(1);
		}
		else {
			return;
		}
		System.out.println(2);
	}
	void m2(int a, int b) {
		try {
			if(a > b) {
				System.out.println(1);
			}
			else {
				return;
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally { // return과 관계없이 무조건 finally 실행
			System.out.println(2);
		}
		
	}
}

public class Finally49{
	
	public static void main(String[] args) {
		try {
			int a = 10 / 0;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// 예외와 상관없이 finally 문 실행
			System.out.println(1);
		}
		Tiger49 t1 = new Tiger49();
		t1.m1(2, 3);
		t1.m2(2, 3); // return을 만나더라도 finally 실행
	}
}
