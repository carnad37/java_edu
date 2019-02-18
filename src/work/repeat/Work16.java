package work.repeat;

public class Work16 {
	
	public static void main(String[] args) {
		
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		
		int sum = 0;
		int size = 10;
		for(int i=1;i<size+1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				sum += j;
			}
		}
		System.out.println(sum);
		
	}

}
