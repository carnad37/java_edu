package work.array;

import java.util.Scanner;

public class Work25 {
	
	public static void main(String[] args) {
		
		//��� ���ڿ��� �Է¹޾��� �� ������ ������ ���ڼ����� �����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		
		char[] charArray;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ��� : ");
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
