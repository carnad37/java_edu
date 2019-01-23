package ex190116;

public class Test01 {

	public static void main(String[] args) {
		
		char input1 = 'a', input2 = 'z';
		int max = 0;
		
		int num01 = input1;
		int num02 = input2;
		
		
		System.out.println("a = "+num01+", z = "+num02);
		
		if(num01>num02)
		{
			max = num01;	
		}
		else
		{
			max = num02;
		}
		System.out.println(max);
		
		
	}
	

	
}
