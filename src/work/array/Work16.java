package work.array;

import java.util.Scanner;

public class Work16 {

	public static void main(String[] args) {
		
		Work16 w16 = new Work16();
		int[] inputNum = new int[3];
		int sum = 1;
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.print("숫자를 입력해주세요 : ");
			sum*=scan.nextInt();
		}
		String word = String.valueOf(sum);
		char[] charArray = new char[word.length()];
		for(int i=0;i<word.length();i++)
		{
			charArray[i]=word.charAt(i);
		}
		
		w16.printCountNumber(charArray);
		
	}
	
	public void printCountNumber(char[] charArray)
	{

		int[] countNumber = new int[10];
		int charToInt;
		for(int i=0;i<charArray.length;i++)
		{
			charToInt = charArray[i]-48;
			countNumber[charToInt]++;
		}
		for(int i=0;i<countNumber.length;i++)
		{
			System.out.println(i+" : "+countNumber[i]+"개");
		}
	}
}
