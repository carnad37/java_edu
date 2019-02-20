package work.array;

import java.util.Scanner;

public class Work17 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		Work17 w17 = new Work17();
		
		System.out.print("숫자를 입력해주세요 : ");
		
		int select = scan.nextInt();
		
		String[] answer = new String[select];
		int[] answerScore = new int[select];
		
		w17.setAnswer(answer);
		w17.scoreCalulator(answer, answerScore);
		
	}
	public void setAnswer(String[] answer)
	{
		Scanner scan = new Scanner(System.in);

		for(int i=0;i<answer.length;i++)
		{
			System.out.print("테스트 결과를 입력해주세요 : ");
			answer[i]=scan.nextLine();
		}
	}
	public void scoreCalulator(String[] answer, int[] answerScore)
	{
		char answerCheck;
		int sum;
//		char[] answerArray;
		for(int i=0;i<answer.length;i++)	//답안지 Array를 하나씩 불러옴.
		{
//			answerArray = new char[answer[i].length()];
			//쪼개서 charArray에 담기
			int checkCounter = 0;
			sum = 0;
			for(int j=0;j<answer[i].length();j++)	//각각의 답안지 index를 하나씩 불러옴.
			{				
				answerCheck = answer[i].charAt(j);
				if(answerCheck=='O')
				{
					checkCounter++;
				}
				else if(answerCheck=='X')
				{
					while(checkCounter>0)
					{
						sum+=checkCounter;
						checkCounter--;
					}
				}	
			}
			while(checkCounter>0)
			{
				sum+=checkCounter;
				checkCounter--;
			}
			System.out.println("점수합계 : "+sum);
		}
	}
	
}