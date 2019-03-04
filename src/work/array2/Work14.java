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
		System.out.print("��ȣ�� ���Ե� ������ �Է����ּ���(exit�� �Է��ϸ� ����˴ϴ�) : ");
		word = scan.nextLine();
		return word;
	}
	
	//pFlag�� üũ���ִ� �޼ҵ�
	//String�� char[]�� ������ִ� �޼ҵ�
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
					System.out.println("error : ��ȣ�� ���� ������.");
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
			System.out.println("error : ��ȣ�� �� �ݾҴ�.");
			System.out.println("���� ���� ��ȣ �� : "+pNum);
			fristCount = false;
		}
		else
		{
			System.out.println("error : ������ ���� ��ȣ���� ������.");
			System.out.println("���ʿ��ϰ� ���� ��ȣ �� : "+pNum);
			fristCount = false;
		}
		return fristCount;
	}
}
