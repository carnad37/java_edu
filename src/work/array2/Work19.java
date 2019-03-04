package work.array2;

import java.util.Scanner;

public class Work19 {

	public static void main(String[] args) {
		
	//짝수는 대문자, 홀수는 소문자.	
		Work19 w19 = new Work19();
		Scanner scan = new Scanner(System.in);
		System.out.print("문장을 입력해주세요 : ");
		String word = scan.nextLine();
		scan.close();
		
		String newWord = w19.reSettingWord(word);
		System.out.println(newWord);
	}
	public String reSettingWord(String word)
	{
		String newWord = "";
		String[] wordArray = word.split(" ");
		for(String str : wordArray)
		{
			newWord+=wordChange(str);
			newWord+=" ";
		}
				
		return newWord;
	}
	public String wordChange(String word)
	{
		String newWord = "";
		for(int i=0;i<word.length();i++)
		{
			int index = i+1;
			char data = word.charAt(i);
			int dataInt = (int)data;
			if(index%2==0)
			{
				if(dataInt>64&&dataInt<91)
				{
					dataInt += 32;
				}
				data = (char)dataInt;
			}
			else
			{
				if(dataInt<123&&dataInt>96)
				{
					dataInt-=32;
				}
				data = (char)dataInt;
			}
			newWord+=String.valueOf(data);
		}
		return newWord;
	}
	
	
}
