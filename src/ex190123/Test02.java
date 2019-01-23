package ex190123;

public class Test02 {
	
	public static void main(String[] args) {
		
		int i =1, sum = 0;
		double avg = 0;
		
		while(i<11)
		{
			sum += i;
			i++;
		}
		i--;
		avg = (double)sum/i;
		System.out.println(avg);
		
	}

}
