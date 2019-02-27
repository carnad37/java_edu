package work.array;

import java.util.Scanner;

public class Work37 {

	public static void main(String[] args) {
		
		//10개의 정수를 입력받아 내림차순으로 정리.
		//버블쇼트을 하자
		int[] numArray = new int[10];
		Scanner scan = new Scanner(System.in);
		Work37 w37 = new Work37();

		for(int i=0;i<numArray.length;i++)
		{
			System.out.print("숫자를 입력해주세요 : ");
			int inputNum = scan.nextInt();
			numArray[i]=inputNum;
		}
		scan.close();
		w37.selectArray(numArray);
		for(int i=0;i<10;i++)
		{
			System.out.println(numArray[i]);
		}
		
		
	}
	public void selectArray(int[] numArray)
	{

		for(int i=0;i<numArray.length-1;i++)
		{
			for(int j=0;j<numArray.length-1-i;j++)
			{
				if(numArray[j]<numArray[j+1])
				{
					setChangeIndex(numArray,j);
				}

			}
		}
	}
	public void setChangeIndex(int[] array, int index)
	{
		System.out.println(index+"에서 교차발생");
		int value = array[index+1];
		array[index+1] = array[index];
		array[index] = value;
	}
	
}
