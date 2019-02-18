package work.repeat;

public class Work17 {
	
	public static void main(String[] args) {
		

		int count = 0, max = 100,sum = 0;
		while(true)
		{
			count++;
			if(count%2==1)
			{
				sum+=count;
			}
			else
			{
				sum-=count;
			}
			if(sum>=max)
			{
				break;
			}
			System.out.println(sum);
		}
		System.out.println(count);
	}

}
