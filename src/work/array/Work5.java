package work.array;

import java.util.Scanner;

public class Work5 {

	public static void main(String[] args) {
		
		//홀수번째 합, 짝수번째 합.
		Work5 w5 = new Work5();
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		for(int i=0;i<10;i++)
		{
			System.out.print("숫자를 입력해주세요: ");
			int inputNum = sc.nextInt();
			num[i]=inputNum;
		}
		
		w5.printSumNumber(num);
		
		
	}
	public void printSumNumber(int[] num)
	{
		int sum1=0, sum2=0;
		for(int i=0;i<10;i++)
		{
			
			if(i%2==0)
			{
				sum1+=num[i];
			}
			else
			{
				sum2+=num[i];
			}
			
		}
		System.out.println("짝수번째 입력의 합은 "+sum2);
		System.out.println("홀수번째 입력의 합은 "+sum1);

	}

	
}
