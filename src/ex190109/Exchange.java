package ex190109;

public class Exchange {

	public static void main(String[] args) {
		int num = 77;
		String a2 = Integer.toBinaryString(num);	//10����->2����
		String a16 = Integer.toHexString(num);		//10����->16����
		
		System.out.println("2���� : " + a2);
		System.out.println("16���� : " + a16);
		
		String b1 = Integer.toBinaryString(33);
		
		System.out.println("33�� 2���� ���� "+b1);

		char c ='��';		//���� ������ ����
		int i = c;			//���� c�� 10������ ��ȯ.
		String c1 = Integer.toBinaryString(i);		//10������ ����� ������ 2������ ��ȯ
		String c2 = Integer.toHexString(i);			//10������ ����� ������ 16������ ��ȯ
		
		System.out.println("���� 2������ " + c1);
		System.out.println("���� 16������ " + c2);
	}	
}