package work.array2;

import java.util.Scanner;

public class Work14 {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Work14 w14 = new Work14();
		String inputWord;
		
		while(true)
		{
			inputWord = w14.setStringWord(scan);
			if(inputWord.equals("exit"))
			{
				break;
			}
			char[] wordArray = w14.setCharArray(inputWord);
			w14.checkParenthesis(wordArray);
			System.out.println("");
		}

		scan.close();
		
		
	}
	public String setStringWord(Scanner scan)
	{
		String word = null;
		System.out.print("괄호가 포함된 문장을 입력해주세요(exit를 입력하면 종료됩니다) : ");
		word = scan.nextLine();
		return word;
	}
	
	//pFlag를 체크해주는 메소드
	//String을 char[]로 만들어주는 메소드
	//pNum
	
	public char[] setCharArray(String word)
	{
		int aLength = word.length();
		char[] charArray = new char[aLength];

		for(int i=0;i<aLength;i++)
		{
			charArray[i]=word.charAt(i);
		}
		return charArray;
	}
	
	public boolean checkParenthesis(char[] charArray)
	{
		int pNum = 0;
		boolean fristCount = false;

		for(char value : charArray)
		{
			if(value==40)
			{
				pNum++;
			}
			else if(value==41)
			{

				pNum--;
			}
			if(!fristCount)
			{
				if(value==41)
				{
					System.out.println("error : 괄호가 먼저 닫혔다.");
					return fristCount;
				}
				fristCount = true;
			}
			
		}
		if(pNum==0)
		{
			System.out.println("correct");
		}
		else if(pNum>0)
		{
			System.out.println("error : 괄호를 덜 닫았다.");
			System.out.println("닫지 않은 괄호 수 : "+pNum);
			fristCount = false;
		}
		else
		{
			System.out.println("error : 열리지 않은 괄호까지 닫혔다.");
			System.out.println("불필요하게 닫은 괄호 수 : "+pNum);
			fristCount = false;
		}
		return fristCount;
	}
}
