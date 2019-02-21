package work.array;

import java.util.Scanner;

public class Work23 {
	
	public static void main(String[] args)
	{
		//1~10까지의 수라면 5이전의 수들은 앞의 수의 절반이므로 계산해줄 필요가없다.
		//2-4-8
		//3-6-9
		//5-10
		//20까지 일시엔
		//10-20
		//9-18...이다.
		//즉 num/2을 초과하는 숫자들중에서 약수는 걍 곱해주고, 약수가 아닐시 다른 수들과의 최대 공약수로 곱해준다.
		//각 약수들을 구한다.
		//20까지라 치면
		//11,12	
		Work23 w23 = new Work23();
		
		int[] numArray;
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 등록 : ");
		int inputNum = scan.nextInt();
		int startNum = 0;
		if(inputNum%2!=0)
		{
			startNum = (inputNum/2)+1;
		}
		else
		{
			startNum = inputNum/2;
		}
		numArray = new int[inputNum+1-startNum];
		for(int i=startNum;i<inputNum+1;i++)
		{
			numArray[i-startNum]=i;			
		}
		int compare = w23.compareTwoNumber(numArray[0], numArray[1]);

		for(int i=2;i<numArray.length;i++)
		{
			compare = w23.compareTwoNumber(compare, numArray[i]);
		}
		System.out.println(compare);
		
		
	}
	public int compareTwoNumber(int x, int y)
	{
		int max=0;
		int min=0;
		if(x>y)
		{
			max=x;
			min=y;
		}
		else
		{
			min=x;
			max=y;
		}
		
		int i=2;
		int result = 1;
		while(true)
		{
			if((min%i==0)&&(max%i==0))
			{
				max=max/i;
				min=min/i;
				result = result*i;
			}
			else
			{
				i++;
			}
			if(i>(max/2))
			{
				break;
			}
		}
		result = result*max*min;
		return result;
	}

}