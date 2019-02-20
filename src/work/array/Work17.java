package work.array;

import java.util.Scanner;

public class Work17 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		Work17 w17 = new Work17();
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		
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
			System.out.print("�׽�Ʈ ����� �Է����ּ��� : ");
			answer[i]=scan.nextLine();
		}
	}
	public void scoreCalulator(String[] answer, int[] answerScore)
	{
		char answerCheck;
		int sum;
//		char[] answerArray;
		for(int i=0;i<answer.length;i++)	//����� Array�� �ϳ��� �ҷ���.
		{
//			answerArray = new char[answer[i].length()];
			//�ɰ��� charArray�� ���
			int checkCounter = 0;
			sum = 0;
			for(int j=0;j<answer[i].length();j++)	//������ ����� index�� �ϳ��� �ҷ���.
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
			System.out.println("�����հ� : "+sum);
		}
	}
	
}