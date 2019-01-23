package ex190121;

import java.util.Scanner;

public class Tset04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int inputNum = 0, count = 0;
		
		for(;;)
		{
			System.out.print("정수를 입력해주세요: ");
			inputNum = sc.nextInt();
			if(inputNum == 0)
			{
				System.out.println(count);
				break;
			}
			if((inputNum%3 != 0)&&(inputNum%5 != 0))
			{
				count++;
			}
			
		}
		
		
	}
	
}
