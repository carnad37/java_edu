package work.array;

import java.util.Scanner;

public class Work25 {
	
	public static void main(String[] args) {
		
		//어떠한 문자열을 입력받았을 때 공백을 제외한 글자수만을 리턴하는 코드를 작성하시오.
		
		char[] charArray;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력해주세요 : ");
		String word = scan.nextLine();
		
		charArray = new char[word.length()];
		for(int i=0;i<word.length();i++)
		{
			
			charArray[i] = word.charAt(i);
			
		}
		
		int count = 0;
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i]==' ')
			{
				count++;
			}
		}
		int result = charArray.length-count;
		System.out.println(result);
		
	}

}
