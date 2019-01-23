package ex190123;

public class Test03 {

	public static void main(String[] args) {
		
		//1부터 10이하의 수중 3의 배수만 합
		int i = 1, sum = 0;
		
		while(i<11)
		{			
			if(i%3==0)
			{
				sum+=i;
			}
			i++;
		}
		System.out.println("3의 배수의 합 : "+sum);
	}
	
}
