package work.array2;

import java.util.Scanner;
import work.array2.ArrayMethod;

public class Work11 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayMethod am = new ArrayMethod();
		Work11 w11 = new Work11();
		
		int[][] firstArray = new int[2][3];
		int[][] secondArray = new int[2][3];	
		int[][] multiArray;
		System.out.println("FirstArray");
		w11.setArray(scan, firstArray);
		System.out.println("SecondArray");
		w11.setArray(scan, secondArray);
		
		scan.close();
		
		multiArray = w11.setMultiArray(firstArray, secondArray);
		am.printArray(multiArray);

	
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
	
	public int[][] setMultiArray(int[][] firstArray, int[][] secondArray)
	{
		int[][] multiArray = new int[2][3];
		for(int i=0;i<multiArray.length;i++)
		{
			for(int j=0;j<multiArray[i].length;j++)
			{
				multiArray[i][j]=firstArray[i][j]*secondArray[i][j];
			}
		}	
		
		return multiArray;
	}
}
