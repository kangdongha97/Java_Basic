package Basic0825;

//ex6 �޸�, ���Կ���, Ÿ��)
public class Value_Type {

	public static void main(String[] args) {
		byte apple;
		apple = 126; // -128 ~ 127 1����Ʈ
		System.out.println(apple);
		System.out.println(Byte.MAX_VALUE); // ���� ���
		System.out.println(Byte.MIN_VALUE);
		
		short banana;
		banana = 30020; // 2����Ʈ
		System.out.println(banana);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		int orange;
		orange = 2144442222; // 4����Ʈ
		System.out.println(orange);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		long melon;
		melon = 911232323; // 8����Ʈ
		System.out.println(melon);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		float tiger; // �Ǽ� 4����Ʈ
		tiger = 3.14f;
		System.out.println(tiger);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		double rion; // �Ǽ� 8����Ʈ
		rion = 3.14;
		System.out.println(rion);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		// char �� ���� x
		char han;
		han = '��';
		System.out.println(han);
		
		
		boolean nabi;
		nabi = true;
		System.out.println(nabi);
	}

}
