package ex190111;

public class test04 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		//¶Ç´Â a++;
		int sum = a++ + ++b;
		//a++;
		//sum=a+b;
		//b++;
		System.out.println("a="+a);
		System.out.println("b="+b);		
		System.out.println("sum="+sum);
		
		double c =2.6;
		double d =2.5;
		sum = 0;
		sum = (int)(c + d);
		System.out.println("sum="+sum);
	}
	
}
