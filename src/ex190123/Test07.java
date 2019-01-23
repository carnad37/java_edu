package ex190123;

public class Test07 {
	public static void main(String[] args) {
		
		int start = 3, end = 13, sum = 0, count = 0, avg = 0;
		end++;
		while(start<end)
		{
			sum+=start;
			count++;
			start++;
		}
		avg = sum/count;
		System.out.println("Avg : "+avg);
		
	}
}
