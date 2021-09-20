package Basic0827;

import java.util.Random;

public class Random36{
	
	public static void main(String[] args) {
		Random rn = new Random();
		System.out.println(rn.nextInt());
		
		for (int i = 0; i < 10; i++) {
			//int num = rn.nextInt(2); 아래 한줄과 같음
			//System.out.println(num);
			System.out.println(rn.nextInt(10));
		}
	}
}
