package ex190111;

public class ex09 {

	public static void main(String[] args) {
		
		//기준 문자열.equlas(비교 문자열));
		//문자열(String) 비교 메소드.
		
		int num1 = 10;
		int num2 = 10;
		System.out.println("(num1 == num2) = "+(num1 == num2));
		System.out.println("(num1 != num2) = "+(num1 != num2));
		System.out.println("(num1 <= num2) = "+(num1 <= num2));
		
		char char1 = 'A';
		char char2 = 'B';
		
		System.out.println("(char1 < char2) = " + (char1 < char2));
	
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		System.out.println(strVar1+"와 "+strVar2+"는 "+strVar1.equals(strVar2)+"다.");
		
		//String끼리 비교시에는 ==가아니라 equal()메소드를 사용한다.
		
	}
}