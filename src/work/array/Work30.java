package work.array;

import java.util.Scanner;

public class Work30 {

	public static void main(String[] args) {
		
		//Ȧ���� ���ӵǸ� -�� ���̿� �߰�.
		//¦���� ���ӵǸ� *�� ���̿� �߰�.
		Work30 w30 = new Work30();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڿ��� �Է����ּ��� : ");
		String preWord = scan.nextLine();
		
		w30.DashInsert(preWord);
		
		
		
	}
	public void DashInsert(String preWord)
	{
		char[] charArray = new char[100];
		String word="";
		int arrayIndex = 0, preCheck = 0, wordIndex=0;
		char postWord = preWord.charAt(0);
		if(((int)preWord.charAt(0)-48)%2!=0)
		{
			preCheck = 1;
		}
		charArray[arrayIndex]=preWord.charAt(wordIndex);
		arrayIndex++;
		wordIndex++;
		while(true)
		{
			//check�� ���� ���� ���ڰ� Ȧ������ ¦������ Ȯ��.
			//check=0�̸� ¦��, check�� 1�̸� Ȧ��.
			//n-1,n�� Ȯ���� ���ӵɽ�, n-2,n-1(-�Ǵ�*),n�� �Ѳ����� �Է�.
			//�ԷµǴ� ������ index�� ���� ����Ѵ�.
			if(wordIndex>preWord.length()-1)
			{
				break;
			}
			int postCheck=((int)preWord.charAt(wordIndex)-48)%2;
			if(postCheck==preCheck)	//���ӵɶ�
			{
				if(postCheck==0)
				{
					charArray[arrayIndex]='*';
					arrayIndex++;
				}
				else
				{
					charArray[arrayIndex]='-';
					arrayIndex++;
				}
//				charArray[arrayIndex+1]=preWord.charAt(wordIndex);
//				arrayIndex+=2;
			}
//			else	//���ӵ��� ������
//			{
			charArray[arrayIndex]=preWord.charAt(wordIndex);
			arrayIndex++;
//			}
			preCheck=postCheck;
			wordIndex++;			
		}
		for(int i=0;i<arrayIndex;i++)
		{
			System.out.print(charArray[i]);
		}
	}	
}
