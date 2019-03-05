package work.array2;

import java.util.Scanner;

public class Work25 {

	public static void main(String[] args) {
		
		Scanner	scan = new Scanner(System.in);
		Work25 w25 = new Work25();
		
		System.out.print("숫자를 입력해주세요: ");
		int inputNum = scan.nextInt();
		scan.close();
		w25.sumSameNumber(inputNum);
		
		
		
	}
	public void sumSameNumber(int num)
	{
		for(int i=1;i<=num;i++)
		{
			int result =0;
			for(int j=i;j<=num;j++)
			{
				result+=j;
				if(result==num)
				{
					printSumProcess(i,j);
					break;
				}
				else if(result>num)
				{
					break;
				}
			}
		}
			
	}
	
	public void printSumProcess(int start, int end)
	{
		String word = "(";
		for(int i=start;i<=end;i++)
		{
			if(i!=end)
			{
				word+=i+"+";
			}
			else
			{
				word+=i+")";
			}
		}
		System.out.println(word);
	}
	
}
