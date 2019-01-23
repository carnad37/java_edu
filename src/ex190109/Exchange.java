package ex190109;

public class Exchange {

	public static void main(String[] args) {
		int num = 77;
		String a2 = Integer.toBinaryString(num);	//10진수->2진수
		String a16 = Integer.toHexString(num);		//10진수->16진수
		
		System.out.println("2진수 : " + a2);
		System.out.println("16진수 : " + a16);
		
		String b1 = Integer.toBinaryString(33);
		
		System.out.println("33의 2진수 값은 "+b1);

		char c ='간';		//값을 변수에 대입
		int i = c;			//변수 c를 10진수로 변환.
		String c1 = Integer.toBinaryString(i);		//10진수로 저장된 변수를 2진수로 변환
		String c2 = Integer.toHexString(i);			//10진수로 저장된 변수를 16진수로 변환
		
		System.out.println("간의 2진수는 " + c1);
		System.out.println("간의 16진수는 " + c2);
	}	
}