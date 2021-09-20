package Basic0827;

//ex35 배열)
public class Array35{
	
	public static void main(String[] args) {
		int a = 10;
		// 아래 세 개 같음
		int [] ar = new int [5]; // 주로 사용
		int [] br = new int [] {1, 2, 3, 4, 5};
		int [] cr = {10, 20, 30, 40, 50};
		
		System.out.println(ar.length);
		
		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i] +" ");
		}System.out.println(); // 줄바꿈
		System.out.println("호랑이");
		
		// foreach문(간략화된 for or 향상된 for문)
		// 간략화된 for문에서는 i 대신 x, data, value 많이 사용
		for (int x : cr) {
			System.out.print(x +" ");
		}
		// 배열의 인덱스는 cr같은 경우 메모리를 5개 요청했으므로 0부터 배열의 길이 -1 만큼 사용가능
		cr[0] = 100;
		cr[4] = 200;
		// cr[5] = 300; 유효범위를 벗어났기 때문에 에러 발생
		// ar[-1] = 400; 위와 같음
		
		int num = 3;
		ar[num] = 500;
		ar[num*3-5] = 200; // 유효범위안에서만 사용 가능
		
		System.out.println("\n---------------------");
		for (int x : ar) {
			System.out.print(x +" ");
		}
		System.out.println();
		ar[2] = 3;
		ar[ar[2]] = 999;
		
		System.out.println(ar[2] + " " + ar[3]);
		
		ar[ar[3]-998] = 888;
		for (int x : ar) {
			System.out.print(x +" ");
		}
		System.out.println("\n---------------------");
		boolean[] dr = {true, true, false, true};
		for (boolean x : dr) {
			System.out.print(x +" ");
		}
		System.out.println("\n---------------------");
		
		String [] ss = new String[4];
		ss[0] = "호랑이";
		ss[1] = "사자";
		ss[2] = "치타";
		ss[3] = "표범";
		
		for (int i = 0; i < ss.length; i++) {
			System.out.print(ss[i] + " ");
		}System.out.println();
		
		for (String x : ss) {
			System.out.print(x + " ");
		}
		// 배열 생성 아래 두 개 같음
		String[] st = new String[] {"진달래", "튤립", "장미"};
		String s1 = "호랑이";
		
		String s2 = new String ("독수리");
		String[] su = new String[] {new String ("민들레"), new String ("튤립"), new String ("장미")};
		System.out.println("\n---------------------");
		for (String x : su) {
			System.out.print(x +" ");
		}
	}
}