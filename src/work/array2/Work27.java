package work.array2;

import java.util.Scanner;

public class Work27 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		int number = scan.nextInt();
		
	}
	public void setFourNumber(int number)
	{
		int fourDiv = 4;
		int count = 1;
		while(true)
		{
			if(number<fourDiv)
			{
				break;
			}
			fourDiv*=4;
			count*=10;
		}
		fourDiv /= 4;
		int result = 0;
		int value = 0;
		while(true)
		{
			value = number/fourDiv;
			result = result + (value*count);
//			fourDiv = 
		}
	}
}
