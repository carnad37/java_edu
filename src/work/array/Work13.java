package work.array;

import java.util.Scanner;

public class Work13 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Work13 w13 = new Work13();
		int[] numArray = new int[100];
		int[] scoreRating = new int[11];
		int stopNumber = 0;
		int max = 0, min = 0;
		for(int i=0;i<100;i++)
		{
			System.out.print("정수를 입력해주세요: ");
			int inputNum = scan.nextInt();
			if(inputNum==0)
			{
				stopNumber = i;
				break;
			}
			numArray[i]=inputNum;
		}
		for(int i=0;i<stopNumber;i++)
		{
			if(numArray[i]==0)
			{
				scoreRating[0]++;
			}
			else
			{
				int frontNumber = numArray[i]/10;
				scoreRating[frontNumber]++;
			}
		}
		w13.printScoreRating(scoreRating);
		
	}
	
	public void printScoreRating(int[] scoreRating)
	{
		String word;
		for(int i=0;i<11;i++)
		{
			
			if(i==0)
			{
				word = "10점 미만의 학생 수 : ";
			}
			else if(i==10)
			{
				word = "100점인 학생의 수 : ";
			}
			else
			{
				word = i+"0~"+i+"9 점 학생 수 : ";
			}
			System.out.println(word+scoreRating[i]);
		}
	}
}
