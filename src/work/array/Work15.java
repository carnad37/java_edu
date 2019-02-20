package work.array;

import java.util.Scanner;

public class Work15 {

	public static void main(String[] args) {
		
		Work15 w15 = new Work15();
		char[] charArray;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("영어 문장을 입력해주세요 : ");
		String word = scan.nextLine();
		charArray = new char[word.length()];
		for(int i=0;i<word.length();i++)
		{
			charArray[i]=word.charAt(i);
		}
		w15.countWord(charArray);
	}
	
	public void countWord(char[] charArray)
	{
		int count = 1;
		
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i]==' ')
			{
				count++;
			}
			
		}
		System.out.println(count);
	}
	
}
