package Basic0826;

//ex21 return)
class Return{
	int m1(int a, int b) {
		if(a > b) {
			return 100;
		}
		else {
			System.out.println("호랑이");
			return 200; // 무조건 리턴을 한 번은 만나야함
		}
	}
	void m2() {
		System.out.println(1);
		return;
		//System.out.println(2);
	}
	void m3(int num) {
		for (int i = 0; i < 10; i++) {
			if(i == num) {
				System.out.println("찾았다.");
				return; // 함수가 더이상 실행 될 필요가 없을 때도 사용
			}
		}
		System.out.println("검색데이터 찾지 못함");
	}
}
public class Class_Return21 {

	public static void main(String[] args) {
		Return t = new Return();
		System.out.println(t.m1(5, 3));
		t.m3(3);
		t.m3(11);
	}

}
