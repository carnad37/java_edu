package work.array2;

import java.util.Scanner;

public class Work07 {

	public static void main(String[] args) {
		
		//5¹ø ¹Ýº¹ ½ºÄµ
		int[][] scoreArray =new int[5][4];
		
		Work07 w7 = new Work07();
		w7.scanScore(scoreArray);
		w7.printTestResult(scoreArray);
		
	}
	public void scanScore(int[][] scoreArray)
	{
		String word;
		String[] wordArray;
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<scoreArray.length;i++)
		{
			word = scan.nextLine();
			wordArray = word.split(" ");
			for(int j=0;j<scoreArray[i].length;j++)
			{
				scoreArray[i][j]=Integer.parseInt(wordArray[j]);
			}
		}
		scan.close();
	}
	
	
	public void printTestResult(int[][] scoreArray)
	{
		int sCount = 0;
		for(int[] i:scoreArray)
		{
			int sum = 0;
			for(int j:i)
			{
				sum+=j;
			}
			if((sum/scoreArray[0].length)>=80)
			{
				System.out.println("pass");
				sCount++;
			}
			else
			{
				System.out.println("fail");
			}
		}
		System.out.println("Successful : "+sCount);
	}
}
