package work.array;

import java.util.Scanner;

public class Work31
{

	public static void main(String[] args)
	{
		//완전수 구하기
		//완전수는 자신의 약수들의 합이 자신이 되는 수.
		//약수들의 int[]를 구하고, 합이 본인과 같은 수를 찾는다.
		Work31 w31 = new Work31();

		Scanner scan = new Scanner(System.in);
		System.out.print("자연수를 입력해주세요(6이상이어야한다) : ");
		int num = scan.nextInt();
		w31.setDivNumberArray(num);
		
		
	}
	
	public void setDivNumberArray(int num)
	{
		int[] numArray = new int[100];


		for(int i=1;i<=num;i++)
		{
			int sum = 0;
			int divNum=1;
			int arrayIndex=0;
			while(true)
			{
				if(divNum>(i/2)||divNum==i)
				{
					break;
				}
				if(i%divNum==0)
				{
					numArray[arrayIndex]=divNum;
					arrayIndex++;
				}		
				divNum++;
			}
			for(int j=0;j<arrayIndex;j++)
			{
				sum+=numArray[j];
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
	}			
}

