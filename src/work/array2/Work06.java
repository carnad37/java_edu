package work.array2;

import java.util.Scanner;

public class Work06 {
	
	public static void main(String[] args) {
		
		//2행 4열의 배열 두개를 만들어서 입력을 받고
		//두 배열의 곱을 구하여 출력.
		int[][] firstArray = new int[2][4];
		int[][] secondArray = new int[2][4];
		int[][] multiArray;
		
		Work06 w6 = new Work06();
		w6.setArray(firstArray, secondArray);
		multiArray=w6.setMultiArray(firstArray, secondArray);
		for(int i=0;i<multiArray.length;i++)
		{
			for(int j=0;j<multiArray[i].length;j++)
			{
				System.out.print(multiArray[i][j]+"\t");
			}
			System.out.println("");
		}		
		System.out.println("");

		
	}
	public void setArray(int[][] firstArray, int[][]secondArray)
	{
		String word = null;
//		int index = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("firstArray");
		for(int i=0;i<firstArray.length;i++)
		{
			word = scan.nextLine();
			setArrayData(word, i, firstArray);
		}
		System.out.println("secondArray");
		for(int i=0;i<secondArray.length;i++)
		{
			word = scan.nextLine();
			setArrayData(word, i, secondArray);
		}
		scan.close();
		
	}
	public void setArrayData(String word, int line , int[][] targetArray)
	{
		String[] wordArray;
		wordArray = word.split(" ");
		for(int j=0;j<targetArray[line].length;j++)
		{
			targetArray[line][j]=Integer.parseInt(wordArray[j]);
		}
	}
	
	public int[][] setMultiArray(int[][] firstArray, int[][] secondArray)
	{
		int[][] multiArray = new int[2][4];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				multiArray[i][j] = firstArray[i][j]*secondArray[i][j];
			}
		}
		return multiArray;
	}
	
	
	
	

}
