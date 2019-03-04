package work.array2;

import java.util.Scanner;

public class Work16 {

	public static void main(String[] arg)
	{
	
		Work16 w16 = new Work16();
		int inputNum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		inputNum = scan.nextInt();
		scan.close();
		int countNum = w16.countCollazt(inputNum);
		
		System.out.println(countNum);
		
	}

	public int countCollazt(int num)
	{
		int count = 0;
		while(num!=1)
		{
			if(count==500)
			{
				count = -1;
				break;
			}
			if(num%2==0)
			{
				num = num/2;
			}
			else
			{
				num = (num*3)+1;
			}
			count++;
		}
		return count;
	}
	
}
