package work.array2;

import java.util.Scanner;

public class ArrayMethod {
	
	public void printArray(int[] targetArray)
	{
		for(int i=0;i<targetArray.length;i++)
		{
			System.out.print(targetArray[i]+"\t");
		}		
		System.out.println("");
	}
	
	public void printArray(int[][] targetArray)
	{
		for(int i=0;i<targetArray.length;i++)
		{
			for(int j=0;j<targetArray[i].length;j++)
			{
				System.out.print(targetArray[i][j]+"\t");
			}
			System.out.println("");
		}		
		System.out.println("");
	}
	public void setArray(Scanner scan, int[][] targetArray)
	{
		//변수 하나로 들어갈 위치를 체크
		String[] wordArray;
		for(int i=0;i<targetArray.length;i++)
		{
			wordArray = scan.nextLine().split(" ");
			for(int j=0;j<targetArray[i].length;j++)
			{
				targetArray[i][j]=Integer.parseInt(wordArray[j]);
			}		
		}
	}
}


