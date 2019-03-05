package work.array2;

import java.util.Scanner;

public class Work21 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Work21 w21 = new Work21();
		System.out.print("자연수를 입력해주세요 : ");
		String word = scan.nextLine();
		scan.close();
		w21.hishyadChecker(word);
		
	}
	public void hishyadChecker(String word)
	{
		int[] wordArray = new int[word.length()];
		for(int i=0;i<word.length();i++)
		{
			wordArray[i]=(int)word.charAt(i)-48;
		}
		int sum = 0;
		for(int k:wordArray)
		{
			sum+=k;
		}
		int numerator = Integer.parseInt(word);
		boolean hishyadCheck = (numerator%sum==0);
		System.out.println(hishyadCheck);
	}
}
