package Basic0825;

//ex6 메모리, 대입연산, 타입)
public class Value_Type {

	public static void main(String[] args) {
		byte apple;
		apple = 126; // -128 ~ 127 1바이트
		System.out.println(apple);
		System.out.println(Byte.MAX_VALUE); // 헬퍼 사용
		System.out.println(Byte.MIN_VALUE);
		
		short banana;
		banana = 30020; // 2바이트
		System.out.println(banana);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		int orange;
		orange = 2144442222; // 4바이트
		System.out.println(orange);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		long melon;
		melon = 911232323; // 8바이트
		System.out.println(melon);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		float tiger; // 실수 4바이트
		tiger = 3.14f;
		System.out.println(tiger);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		double rion; // 실수 8바이트
		rion = 3.14;
		System.out.println(rion);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		// char 에 숫자 x
		char han;
		han = '한';
		System.out.println(han);
		
		
		boolean nabi;
		nabi = true;
		System.out.println(nabi);
	}

}
