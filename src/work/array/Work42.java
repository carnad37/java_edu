package work.array;

import java.util.Scanner;

public class Work42 {
	
	
	public static void main(String[] args) {
		int[] alphabetCount = new int[26];

		//65���� 90������ �빮�� ���ĺ�
		Work42 w42 = new Work42();
		w42.wordInput(alphabetCount);
		w42.printAlphabetArray(alphabetCount, alphabetCount.length);
		
	}

	public void wordInput(int[] alphabetCount)
	{
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.print("���ĺ��� �Է����ּ��� : ");
			String input = scan.nextLine();
			char check = input.charAt(0);
			if(64<check&&check<91)
			{
				setAlphabetArray(check, alphabetCount);
			}
			else
			{
				break;
			}
		}
		scan.close();
	}
	
	public void setAlphabetArray(char check, int[] alphabetCount)
	{
		int index = (int)check-65;
		alphabetCount[index]++;
	}
	
	public void printAlphabetArray(int[] alphabetCount, int lenght)
	{
		for(int i=0;i<lenght;i++)
		{
			if((int)alphabetCount[i]!=0)
			{
				char name = (char)(i+65);
				System.out.println(name+" : "+alphabetCount[i]);
			}
		}
	}
	
}
