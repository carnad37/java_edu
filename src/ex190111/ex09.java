package ex190111;

public class ex09 {

	public static void main(String[] args) {
		
		//���� ���ڿ�.equlas(�� ���ڿ�));
		//���ڿ�(String) �� �޼ҵ�.
		
		int num1 = 10;
		int num2 = 10;
		System.out.println("(num1 == num2) = "+(num1 == num2));
		System.out.println("(num1 != num2) = "+(num1 != num2));
		System.out.println("(num1 <= num2) = "+(num1 <= num2));
		
		char char1 = 'A';
		char char2 = 'B';
		
		System.out.println("(char1 < char2) = " + (char1 < char2));
	
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		
		System.out.println(strVar1+"�� "+strVar2+"�� "+strVar1.equals(strVar2)+"��.");
		
		//String���� �񱳽ÿ��� ==���ƴ϶� equal()�޼ҵ带 ����Ѵ�.
		
	}
}