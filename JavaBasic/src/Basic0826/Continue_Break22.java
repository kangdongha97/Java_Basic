package Basic0826;

//ex22 continue, break)
public class Continue_Break22 {

	public static void main(String[] args) {
		System.out.println("1000");
		for (int i = 0; i < 10; i++) {
			if(i < 3) {
				continue; // 이후를 실행하지 않고 증감문으로 넘어감
			}
			System.out.println(i);
			if(i == 7) {
				break; // 가장 가까운 반복문 탈출
			}
		}
		System.out.println("호랑이");
		int num = 0;
		while(true) {

			if (num%2 == 0) {
				System.out.println("호랑이" + num);
				num++;
				continue;
			}
			if (num == 10) {
				System.out.println("코끼리" + num);
				break;
			}
		}
	}

}
