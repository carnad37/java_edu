package work.array;

import java.util.Scanner;

public class Work36 {

	public static void main(String[] args) {
		
		//10개의 정수를 입력받아 내림차순으로 정리.
		//선택정렬을 하자
		int[] numArray = new int[10];
		Scanner scan = new Scanner(System.in);
		Work36 w36 = new Work36();

		for(int i=0;i<numArray.length;i++)
		{
			System.out.print("숫자를 입력해주세요 : ");
			int inputNum = scan.nextInt();
			numArray[i]=inputNum;
		}
		scan.close();
		w36.selectArray(numArray);
		for(int i=0;i<10;i++)
		{
			System.out.println(numArray[i]);
		}
		
		
	}
	public void selectArray(int[] numArray)
	{

		for(int i=0;i<numArray.length-1;i++)
		{
			for(int j=i;j<numArray.length-1;j++)
			{
				if(numArray[i]<numArray[j+1])
				{
					setRePosition(i,j+1,numArray);
				}

			}
		}
	}
	public void setRePosition(int x, int y, int[] numArray)
	{	
		int value = numArray[x];
		numArray[x] = numArray[y];
		numArray[y] = value;
	}
}
