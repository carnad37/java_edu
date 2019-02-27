package work.array;

import java.util.Scanner;

public class Work34 {

	public static void main(String[] args) {
		
		/*
		���� ��ȣ��, ��� �θ��� Ȳ�� �ٸ�� ������ ����� �� ��ȣ�ε�,
		���� ��� ���ĺ� A�� �Է����� ��,
		�� ���ĺ��� n�� �ڿ� ����(���⼭�� ���� �� �� 3���� �����Ͽ���)���ĺ��� ��µǴ� ���̴�.
		���� ��� �ٲٷ��� �ܾ 'CAT"��, n�� 5�� �����Ͽ��� �� "HFY"�� �Ǵ� ���̴�.
		��� ��ȣ�� ���� ����� n�� �Է����� �� ��ȣ�� ����� ����ϴ� ���α׷��� �ۼ��ض�.
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
		System.out.print("��ȣ�� ��ȯ�� �ܾ �Է����ּ��� : ");
		String word = scan.nextLine();
		char[] wordArray = new char[word.length()];
		System.out.print("��ȣ ��ȯ�� �̿�� ��ġ�� �Է����ּ��� : ");
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
