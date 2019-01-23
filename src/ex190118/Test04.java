package ex190118;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("(100이하의 정수)");
		System.out.print("첫번째 정수를 입력해주세요: ");
		int num01 = sc.nextInt();
		System.out.print("두번째 정수를 입력해주세요: ");
		int num02 = sc.nextInt();
		//100이상시 프로그램종료.
		if((num01>100)||(num02>100))
		{
			System.out.println("100이상의 값을 입력하셨습니다.");
			return;
		}
		//비교후 outPut();실행.
		if(num01>num02)
		{
			outPut(num02, num01);
		}
		else
		{
			outPut(num01, num02);
		}
		/*

		int i = 0;
		int sum = 0;
		int min = 0;
		int max = 0;
		if(num01>num02)
		{
		min = num02;
		max = num01;
		}
		else
		{
		min = num01;
		max = num02;
		}
		for(i = min; i <= max; i++)
		{
			System.out.println(i);
		}
		
		 */
	}
	public static void outPut(int a, int b)
	{
		int i = 0;
		int j = 0;
		for(i = a; i <= b; i++)
		{
			for(j = 1; j < 6; j++)
			{
				System.out.print(i+"   ");
			}
			System.out.println("");
		}
		return;
	}
	
}
