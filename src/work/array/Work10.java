package work.array;

import java.util.Scanner;

public class Work10 {
	
	public static void main(String[] args) {
		
		Work10 w10 = new Work10();
		
		Scanner scan = new Scanner(System.in);
		int[] numArray = new int[100];
		int stopNumber = 0;
		int max = 0, min = 0;
		for(int i=0;i<100;i++)
		{
			System.out.print("정수를 입력해주세요: ");
			int inputNum = scan.nextInt();
			if(inputNum==0)
			{
				stopNumber = i;
				break;
			}
			numArray[i]=inputNum;
		}
		
		w10.print5MultiNumber(numArray, stopNumber);
		
	}
	
	public void print5MultiNumber(int[] numArray,int stopNumber)
	{
		int sum=0;
		int count=0;
		for(int i=0;i<stopNumber;i++)
		{
			if(numArray[i]%5==0)
			{
				count++;
				sum+=numArray[i];
			}
		}
		System.out.println("Multiples of 5 : "+count);
		System.out.println("sum : "+sum);
	}

}
