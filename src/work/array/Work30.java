package work.array;

import java.util.Scanner;

public class Work30 {

	public static void main(String[] args) {
		
		//홀수가 연속되면 -를 사이에 추가.
		//짝수가 연속되면 *를 사이에 추가.
		Work30 w30 = new Work30();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력해주세요 : ");
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
			//check를 통해 이전 숫자가 홀수인지 짝수인지 확인.
			//check=0이면 짝수, check가 1이면 홀수.
			//n-1,n을 확인후 연속될시, n-2,n-1(-또는*),n을 한꺼번에 입력.
			//입력되는 순서는 index로 따로 계산한다.
			if(wordIndex>preWord.length()-1)
			{
				break;
			}
			int postCheck=((int)preWord.charAt(wordIndex)-48)%2;
			if(postCheck==preCheck)	//연속될때
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
//			else	//연속되지 않을때
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
