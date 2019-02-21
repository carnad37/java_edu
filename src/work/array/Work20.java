package work.array;

import java.util.Scanner;

public class Work20 {
	
	public static void main(String[] args) {
		
		//최대공약수 구하기.
		//두 약수 배열을 만들고, 두 배열끼리 비교한다.
		//두 수의 약수를 찾는다. 동시에 약수가 찾아지는 경우를 확인한다.
		
		int[] numArray = new int[2];
		Scanner scan = new Scanner(System.in);
		
		int minNumber=0, maxDiv=0;
		
		for(int i=0;i<2;i++)
		{
			System.out.print("숫자를 입력해주세요");
			numArray[i] = scan.nextInt();
		}
		if(numArray[0]>numArray[1])
		{
			minNumber = numArray[1];
		}
		else
		{
			minNumber = numArray[0];
		}
		for(int j=minNumber;j>0;j--)
		{
			if((numArray[1]%j==0)&&(numArray[0]%j==0))
			{
				maxDiv = j;
				break;
			}
		}
		System.out.println(maxDiv);
		
		
	}
//	public int[] setDivNumberArray(int num)
//	{
//		int[] DivNumberArray;
//		for(int i=2;i<num;i++)
//		{
//			
//		}
//	}

}
