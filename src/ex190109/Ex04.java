package ex190109;

public class Ex04 {

	public static void main(String[] args) {
		
		char c = '\uac02';
		
		System.out.println("AC02는 문자 "+ c +"에 대응된다.");
		
		int i = c;
		
		System.out.println(c+"를 10진수로 변환시 "+i+"가 된다.");
		
		char a = 'A';
		
		String a1 = Integer.toBinaryString(a);
		String a2 = Integer.toHexString(a);
		
		System.out.println("A를 2진수로 출력하면 " + a1 +"이다.");
		System.out.println("A를 16진수로 출력하면 " + a2 +"이다.");
		
		int a3 = Integer.parseInt(a1);
		//문자열을 숫자열로 변환.
		
		System.out.println("A+A은 " + (a3+a3));

	}
	
}
