package work.array2;

import java.util.Scanner;

public class Work18 {
	
	public static void main(String[] args) {
		
		//문장 내에서 한 문단들의 앞뒤를 비교.
		Work18 w18 = new Work18();
		Scanner scan = new Scanner(System.in);
		System.out.print("문장을 입력해주세요 : ");
		String word = scan.nextLine();
		
		int maxPalinNum = w18.checkPalindrome(word);
		System.out.println(maxPalinNum);
		scan.close();
		
	}

	public int checkPalindrome(String word)
	{
		int palinNum = 0;
		int maxNum = 0;
		int wordLength = word.length();
//		boolean resultCheck;
		for(int i=0;i<wordLength-1;i++)
		{
			char data = word.charAt(i);
			for(int j=i+1;j<wordLength;j++)
			{
				char compareData = word.charAt(j);
				if(compareData==data)
				{
					palinNum = calPalindrome(word, i, j);
				}
			}
			if(maxNum<palinNum)
			{
				maxNum = palinNum;
			}		
		}
		return maxNum;
		
	}
	public int calPalindrome(String word, int i, int j)
	{
		int calLength = j-i+1;
		int length = calLength/2;

		for(int k=0;k<length;k++)
		{
			char preWord = word.charAt(i+k);
			char postWord = word.charAt(j-k);
			if(preWord!=postWord)
			{
				calLength = 0;
				break;
			}
		}
		return calLength;
	}
}
