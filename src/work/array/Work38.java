package work.array;

import java.util.Scanner;

public class Work38 {

	public static void main(String[] args) {
		
		//삽입정렬
		
		int[] numArray = new int[10];
		Scanner scan = new Scanner(System.in);
		Work38 w38 = new Work38();
		System.out.print("숫자를 입력해주세요 : ");
		int inputNum = scan.nextInt();
		numArray[0]=inputNum;
		for(int i=1;i<numArray.length;i++)
		{
			System.out.print("숫자를 입력해주세요 : ");
			inputNum = scan.nextInt();
			w38.compareValue(inputNum,numArray,i);
		}
		scan.close();
//		w38.selectArray(numArray);
		for(int i=0;i<10;i++)
		{
			System.out.println(numArray[i]);
		}
		
		
		
	}
	public void compareValue(int num, int[] numArray, int count)
	{
		int point = 0;
		int i=0;
		if(numArray[count-1]<=num)
		{
			numArray[count]=num;
		}
		else
		{
			for(i=0; i<count; i++)
			{
				if(num<numArray[i])
				{
					point = i;
					pushValue(numArray,point,count);
					numArray[i]=num;
					break;
				}
			}
		}

	}
	
	public void pushValue(int[] numArray, int point, int count)
	{
		for(int i=count-1;i>=point;i--)
		{
			numArray[i+1]=numArray[i];
		}
	}
}
