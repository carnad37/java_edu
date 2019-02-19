package work.array;

import java.util.Scanner;

public class Work11 {
	
	public static void main(String[] args) {
		
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
				System.out.println(stopNumber);
				break;
			}
			numArray[i]=inputNum;
		}
		for(int i=0;i<stopNumber;i++)
		{
			int ret;
			if(numArray[i]%2==0)
			{
				ret = numArray[i]/2;
			}
			else
			{
				ret = numArray[i]*2;
			}
			System.out.print(ret+" ");
		}
	}
}
