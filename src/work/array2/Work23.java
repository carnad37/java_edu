package work.array2;

import java.util.Scanner;

public class Work23 {
	
	public static void main(String[] args) {
		
		//입력된 숫자들의 최소공배수 구하기
		Work23 w23 = new Work23();
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		String stringNum = scan.nextLine();
		scan.close();

		int[] numArray = w23.setIntArray(stringNum);
		w23.sortArray(numArray);
		int divNum = w23.calArrayMaxDivNumber(numArray);
		int mulNum = w23.calArrayMinMulNumber(numArray, divNum);
		System.out.println(mulNum);
		
		
	}
	
	public int[] setIntArray(String word)
	{
		String[] wordArray = word.split(" ");
		int length = wordArray.length;
		int[] intArray = new int[length];
		for(int i=0;i<wordArray.length;i++)
		{
			intArray[i]=Integer.parseInt(wordArray[i]);					
		}
		return intArray;
	}
	
	public int maxDivNumber(int max, int min)
	{
		int result = max%min;
		if(result==0)
		{
			result = min;
		}
		return result;
	}
	
	public void sortArray(int[] targetArray)
	{
		for(int i=0;i<targetArray.length-1;i++)
		{
			for(int j=i+1;j<targetArray.length;j++)
			{
				if(targetArray[i]>targetArray[j])
				{
					int targetValue = targetArray[i];
					targetArray[i] = targetArray[j];
					targetArray[j] = targetValue;
				}
			}
		}
	}
	
	public int calArrayMaxDivNumber(int[] target)
	{
		int length = target.length;
		int divNum = 1;

		for(int i=length-1;i>0;i--)
		{
			if(i==length-1)
			{
				divNum = maxDivNumber(target[i],target[i-1]);
			}
			else
			{
				if(divNum>target[i-1])
				{
					divNum = maxDivNumber(divNum,target[i-1]);
				}
				else
				{
					divNum = maxDivNumber(target[i-1],divNum);
				}
			}
		}
		return divNum;
	}
	
	public int calArrayMinMulNumber(int[] target, int divNum)
	{
		int mulNum = 1;
		for(int num:target)
		{
			mulNum=mulNum*num/divNum;
		}
		return mulNum*divNum;
	}

}

