package ex190109;

public class Ex04 {

	public static void main(String[] args) {
		
		char c = '\uac02';
		
		System.out.println("AC02�� ���� "+ c +"�� �����ȴ�.");
		
		int i = c;
		
		System.out.println(c+"�� 10������ ��ȯ�� "+i+"�� �ȴ�.");
		
		char a = 'A';
		
		String a1 = Integer.toBinaryString(a);
		String a2 = Integer.toHexString(a);
		
		System.out.println("A�� 2������ ����ϸ� " + a1 +"�̴�.");
		System.out.println("A�� 16������ ����ϸ� " + a2 +"�̴�.");
		
		int a3 = Integer.parseInt(a1);
		//���ڿ��� ���ڿ��� ��ȯ.
		
		System.out.println("A+A�� " + (a3+a3));

	}
	
}
