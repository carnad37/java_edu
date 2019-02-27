package work.array2;

import java.util.Scanner;
import work.array2.ArrayMethod;

public class Work12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayMethod am = new ArrayMethod();
		Work12 w12 = new Work12();
		
		int[][] numArray = new int[4][2];
		
		am.setArray(scan, numArray);
		w12.printLineAvg(numArray);
		w12.printRowAvg(numArray);
		w12.printArrayAvg(numArray);

		
	}
	
	public void printLineAvg(int[][] numArray)
	{
		for(int i=0;i<numArray.length;i++)
		{
			int avg = 0;
			int sum = 0;
			for(int j=0;j<numArray[i].length;j++)
			{
				sum+=numArray[i][j];
			}
			avg = sum/numArray[i].length;
			System.out.print(avg+" ");			
		}
		System.out.println("");

	}
	
	public void printRowAvg(int[][] numArray)
	{
		for(int i=0;i<numArray[i].length;i++)
		{
			int avg = 0;
			int sum = 0;
			for(int j=0;j<numArray.length;j++)
			{
				sum+=numArray[j][i];
			}
			avg = sum/numArray.length;
			System.out.print(avg+" ");
		}
		System.out.println();
	}
	
	public void printArrayAvg(int[][] numArray)
	{
		int avg = 0;
		int sum = 0;
		int count = 0;
		for(int i=0;i<numArray.length;i++)
		{
			for(int j=0;j<numArray[i].length;j++)
			{
				sum+=numArray[i][j];
				count++;
			}

		}
		avg = sum/count;
		System.out.print(avg+" ");
		System.out.println("");

	}
}
