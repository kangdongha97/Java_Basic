package Basic0826;

//ex14 while�� Ȱ��)
public class Control_while_ex {

	public static void main(String[] args) {
		// 14-1 ��ڼ� ��� ���α׷�
		int n = 3223;
		while(true) {
			System.out.println(n);
			//if(n%2==0) {
			//	n = n/2;
			//}
			//else {
			//	n = n*3+1;
			//} ���׿������� ����
			n = (n%2==0) ? n/2 : n*3+1;

			System.out.println(n);

			if(n==1) {
				System.out.println(n);
				System.out.println("Ż���ϱ� ����");
				break;
			}
		}System.out.println("----------------------");
		// 14-2
		int n2 = 1234;
		int sum = 0;
		while(true) {
			int r = n2%10;
			n2 = n2/10;
			System.out.println(n2 + " " + r);
			sum = sum + r;
			if(n2==0) {
				break;
			}
		}
		System.out.println(sum);
	}

}
