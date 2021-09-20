package Basic0830;

//ex48 unhandled exception °ú try - catch)
class Tiger48{
	
}

public class Try_Catch48{
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}
			catch (Exception e) {
				
			}
			
		}	
	}
}