package work.array;

import java.util.Scanner;

public class Work09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] numArray = new int[100];
		int stopNumber = 0;
		int max = 0, min = 0;
		for(int i=0;i<100;i++)
		{
			System.out.print("정수를 입력해주세요: ");
			int inputNum = scan.nextInt();
			if(inputNum==999)
			{
				stopNumber = i;
				break;
			}
			numArray[i]=inputNum;
		}
		for(int i=0;i<stopNumber;i++)
		{
			if(i==0)
			{
				max = numArray[i];
				min = numArray[i];
			}
			else
			{
				if(max<numArray[i])
				{
					max = numArray[i];
				}
				else if(min>numArray[i])
				{
					min = numArray[i];
				}
			}
		}
		System.out.println("max:"+max);
		System.out.println("min:"+min);

	}	

}
