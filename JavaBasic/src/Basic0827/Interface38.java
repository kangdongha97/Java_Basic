package Basic0827;

//ex38 �������̽�)
//abstract class Animal{ // ���ο� abstract �Լ��� ������ ������ Ŭ������ abstract �̾����
//	abstract void m1(); // {}�� ���� �ڵ� > �̿ϼ� �ڵ� > abstract
//} //�������̽� ���Ҹ� �� >> interface �Լ� ���ο� �ڵ尡 ���� Ŭ����

interface Animal38{
	abstract void m1(); // �������̽������� abstract ��������
}


class Tiger38 implements Animal38{ // �������̽��� ��ӹ��� ���� implements
	// �ϼ����� ���� m1�� �ڽ�Ŭ�������� �ϼ��Ǿ����
	public void m1() { // abstract�� �� �Լ��� public���� �ۼ��Ǿ�� ��
		System.out.println(2);
	}
}

public class Interface38{
	
	public static void main(String[] args) {
		Animal38 t1 = new Tiger38();
		t1.m1();
		
		//Animal38 t2 = new Animal38();
		//�������̽��� ��ü���� �Ұ� ���ο� �ڵ尡 ����
	}
}
