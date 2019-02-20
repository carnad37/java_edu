package work.array;

import java.util.Scanner;

public class Work18 {
	
	public static void main(String[] args) {
		
		Work18 w18 = new Work18();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("영어 단어를 입력해주세요 : ");
		String word = scan.nextLine();
		String middleWord = w18.getMiddle(word);
		System.out.println(middleWord);
		
	}
	
	public String getMiddle(String word)
	{
		String ret;
		char[] wordToChar = new char[word.length()];
		for(int i=0;i<(wordToChar.length/2)+1;i++)
		{
			wordToChar[i]=word.charAt(i);
		}
		if(word.length()%2==0)
		{
			String firstWord = String.valueOf(wordToChar[(word.length()/2)-1]);
			String secondWord = String.valueOf(wordToChar[(word.length()/2)]);
			ret = firstWord+secondWord;
		}
		else
		{
			String firstWord = String.valueOf(wordToChar[(word.length()/2)]);
			ret = firstWord;
		}
		return ret;
		
	}
}
