package ex190118;

public class Test03 {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		double avg = 0;
		int count = 0;
		for(i = 1; i < 11; i++)
		{
			
			sum = sum + i;
			count = count + 1;
			
		}
		avg = (double)sum/count;
		System.out.println("Sum : "+sum);
		System.out.println("Avg : "+avg);
		
	}
	
}
