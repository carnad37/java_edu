package work.array;

import java.util.Scanner;

public class Work23 {
	
	public static void main(String[] args)
	{
		//1~10������ ����� 5������ ������ ���� ���� �����̹Ƿ� ������� �ʿ䰡����.
		//2-4-8
		//3-6-9
		//5-10
		//20���� �Ͻÿ�
		//10-20
		//9-18...�̴�.
		//�� num/2�� �ʰ��ϴ� ���ڵ��߿��� ����� �� �����ְ�, ����� �ƴҽ� �ٸ� ������� �ִ� ������� �����ش�.
		//�� ������� ���Ѵ�.
		//20������ ġ��
		//11,12	
		Work23 w23 = new Work23();
		
		int[] numArray;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ��� : ");
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