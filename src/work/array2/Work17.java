package work.array2;

import java.util.Scanner;

public class Work17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Work17 w17 = new Work17();
		System.out.print("문장을 입력해주세요 : ");
		String word = scan.nextLine();
		String reWord = w17.setRemakeWord(word);
		scan.close();
		System.out.println(reWord);
	}
	public String setRemakeWord(String word)
	{
		String[] wordArray = word.split(" ");
		String newWord = "";
		for(int i=0;i<wordArray.length;i++)
		{
			for(int j=0; j<wordArray[i].length(); j++)
			{
				char charWord = wordArray[i].charAt(j);
				int check = (int)charWord;
				if(j==0)
				{
					if(check<123&&check>96)
					{
						check -= 32;
						charWord = (char)check;
					}
				}
				else if(check>64&&check<91)
				{
					check += 32;
					charWord = (char)check;
				}
				newWord+=String.valueOf(charWord);				
			}
			newWord+=" ";
		}		
		return newWord;
	}
}
