package work.array;

import java.util.Scanner;

public class Work41 {

	String[] stringArray;
	int[] scoreArray;
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int peopleNum = scan.nextInt();
		String word = scan.nextLine();
		scan.close();
		System.out.print("점수를 입력해주세요(학생1 학생2 ... 학생X) : ");
		word = scan.nextLine();
		Work41 w41 = new Work41();
		w41.setScoreArray(word, peopleNum);
		for(int k:w41.scoreArray)
		{
			System.out.println(k);
		}
		
		
	}
	
	public void setScoreArray(String word, int number)
	{
		String space = " ";
		this.stringArray = word.split(space);
		if(stringArray.length!=number)
		{
			System.out.println("입력오류입니다. 시스템을 다시 실행해주세요.");
		}
		else
		{
			this.scoreArray = new int[number];
			int count=0;
			for(String str:this.stringArray)
			{
				this.scoreArray[count]=Integer.parseInt(str);
				count++;
			}
			scoreReArray();
		}
	}
	
	public void scoreReArray()
	{
		for(int i=0;i<scoreArray.length-1;i++)
		{
			for(int j=i+1;j<scoreArray.length;j++)
			{
				if(scoreArray[i]<scoreArray[j])
				{
					 int value = scoreArray[i];
					 scoreArray[i] = scoreArray[j];
					 scoreArray[j] = value;					
				}
			}
		}
	}
	
}
