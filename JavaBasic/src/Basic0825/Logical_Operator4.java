package Basic0825;

//ex4 ��������)
public class Logical_Operator4 {

	public static void main(String[] args) {
		System.out.println(false||false); // ��or
		System.out.println(false||true);
		System.out.println(true||false);
		System.out.println(true||true);
		System.out.println("\n");
		
		System.out.println(false&&false); // �� and
		System.out.println(false&&true);
		System.out.println(true&&false);
		System.out.println(true&&true);
		
		System.out.println("\n");
		System.out.println(true&&true&&false);
		System.out.println(false&&false&&true);
		System.out.println(false&&(false||true));
		System.out.println(3>2||false||6<=3);
		
		System.out.println("\n"); // �� not
		System.out.println(!true);
		System.out.println(!(3>2));
	}

}
