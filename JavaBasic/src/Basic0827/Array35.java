package Basic0827;

//ex35 �迭)
public class Array35{
	
	public static void main(String[] args) {
		int a = 10;
		// �Ʒ� �� �� ����
		int [] ar = new int [5]; // �ַ� ���
		int [] br = new int [] {1, 2, 3, 4, 5};
		int [] cr = {10, 20, 30, 40, 50};
		
		System.out.println(ar.length);
		
		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i] +" ");
		}System.out.println(); // �ٹٲ�
		System.out.println("ȣ����");
		
		// foreach��(����ȭ�� for or ���� for��)
		// ����ȭ�� for�������� i ��� x, data, value ���� ���
		for (int x : cr) {
			System.out.print(x +" ");
		}
		// �迭�� �ε����� cr���� ��� �޸𸮸� 5�� ��û�����Ƿ� 0���� �迭�� ���� -1 ��ŭ ��밡��
		cr[0] = 100;
		cr[4] = 200;
		// cr[5] = 300; ��ȿ������ ����� ������ ���� �߻�
		// ar[-1] = 400; ���� ����
		
		int num = 3;
		ar[num] = 500;
		ar[num*3-5] = 200; // ��ȿ�����ȿ����� ��� ����
		
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
		ss[0] = "ȣ����";
		ss[1] = "����";
		ss[2] = "ġŸ";
		ss[3] = "ǥ��";
		
		for (int i = 0; i < ss.length; i++) {
			System.out.print(ss[i] + " ");
		}System.out.println();
		
		for (String x : ss) {
			System.out.print(x + " ");
		}
		// �迭 ���� �Ʒ� �� �� ����
		String[] st = new String[] {"���޷�", "ƫ��", "���"};
		String s1 = "ȣ����";
		
		String s2 = new String ("������");
		String[] su = new String[] {new String ("�ε鷹"), new String ("ƫ��"), new String ("���")};
		System.out.println("\n---------------------");
		for (String x : su) {
			System.out.print(x +" ");
		}
	}
}