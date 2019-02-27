package work.array;

import java.util.Scanner;

public class Work34 {

	public static void main(String[] args) {
		
		/*
		시저 암호는, 고대 로마의 황제 줄리어스 시저가 만들어 낸 암호인데,
		예를 들어 알파벳 A를 입력했을 때,
		그 알파벳의 n개 뒤에 오는(여기서는 예를 들 때 3으로 지정하였다)알파벳이 출력되는 것이다.
		예를 들어 바꾸려는 단어가 'CAT"고, n을 5로 지정하였을 때 "HFY"가 되는 것이다.
		어떠한 암호를 만들 문장과 n을 입력했을 때 암호를 만들어 출력하는 프로그램을 작성해라.
		*/
		char a = 'a';
		char z = 'z';
		char ar = 'A';
		char zr = 'Z';
		System.out.println((int)a);
		System.out.println((int)z);
		System.out.println((int)ar);
		System.out.println((int)zr);
		
		Work34 w34 = new Work34();
	
		Scanner scan = new Scanner(System.in);
		System.out.print("암호로 변환할 단어를 입력해주세요 : ");
		String word = scan.nextLine();
		char[] wordArray = new char[word.length()];
		System.out.print("암호 변환에 이용될 수치를 입력해주세요 : ");
		int pNum = scan.nextInt();
		scan.close();
		w34.setArray(word, wordArray);
		String password = w34.changeWord(wordArray, pNum);
		System.out.println(password);
		

		
	}
	public void setArray(String word, char[] charArray)
	{
		for(int i=0;i<word.length();i++)
		{
			charArray[i]=word.charAt(i);
		}
	}
	public String changeWord(char[] charArray, int pNum)
	{
		String sumWord="";
		for(int i=0;i<charArray.length;i++)
		{
			int result = charArray[i]+pNum;
			if(charArray[i]<91&&result>90)
			{
				result = 64+(result-90);
			}
			else if(charArray[i]<123&&result>122)
			{
				result = 96+(result-122);
			}
			char preWord = (char)result;
			sumWord += String.valueOf(preWord);
		}
		return sumWord;
	}
	
}
