package work.array2;

import java.util.Scanner;
import work.array2.ArrayMethod;

public class Work20 {

	public static void main(String[] args) {
		
		//두 행렬을 만든다.
		Work20 w20 = new Work20();
		Scanner scan = new Scanner(System.in);
		int[][] firstMatrix = w20.setMatrix(scan);
		int[][] secondMatrix = w20.setMatrix(scan);
		scan.close();
		if(firstMatrix[0].length==secondMatrix.length)
		{	
			w20.printMatrixMulti(firstMatrix,secondMatrix);		
		}
		else if(firstMatrix.length==secondMatrix[0].length)
		{
			w20.printMatrixMulti(secondMatrix,firstMatrix);		
		}
		else
		{
			System.out.println("곱셈이 불가능한 행렬입니다.");
			return;
		}
		

	}
	
	public int[][] setMatrix(Scanner scan)
	{
		System.out.print("행을 입력해주세요 : ");
		int line = scan.nextInt();
		System.out.print("열을 입력해주세요 : ");
		int row = scan.nextInt();
		int[][] matrix = new int[line][row];
		int lineValue = 0;
		for(int i=0;i<line;i++)
		{	
			System.out.print((i+1)+"열의 행을 입력해주세요(열은 "+row+"개) : ");
			lineValue = scan.nextInt();
			int j=0;
			matrix[i][j] = lineValue;
			for(j=1;j<row;j++)
			{
				lineValue = scan.nextInt();
				matrix[i][j] = lineValue;
			}
		}			
		return matrix;
	}
	
	public void printMatrixMulti(int[][] array1, int[][] array2)
	{
		int arrayRow = array1.length;
		int arrayLine = array2[0].length;
		int[][] rearray2 = replaceArray(array2);
		int[][]	mulArray = new int[arrayRow][arrayLine];
		for(int i=0;i<arrayRow;i++)
		{
			for(int j=0;j<arrayLine;j++)
			{
				mulArray[i][j] = mulRowLine(array1[i],rearray2[j]);
			}
		}
		ArrayMethod am = new ArrayMethod();
		am.printArray(mulArray);
		
		
	}
	public int[][] replaceArray(int[][] target)
	{
		int[][] reArray = new int[target[0].length][target.length];
		for(int i=0;i<reArray.length;i++)
		{
			for(int j=0;j<reArray[i].length;j++)
			{
				reArray[i][j]=target[j][i];
			}
		}
		return reArray;
			
	}

	public int mulRowLine(int[] array1, int[]array2)
	{
		int sum = 0;
		for(int i=0;i<array1.length;i++)
		{
			sum += array1[i]*array2[i];
		}
		return sum;
	}
}

