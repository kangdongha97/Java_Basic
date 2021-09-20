package Basic0901;

//ex61 - 1 РЬСп for ЙЎ)
public class For_ex61_1{
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("[" + i + " " + j + "]");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				if((i+j)%2 ==0) {
					System.out.print("0 ");
				}
				else {
					System.out.print("X ");
				}
			}
			System.out.println();
		}
	}
}
