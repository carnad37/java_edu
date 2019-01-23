package ex190117;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요: ");
		int inputNum = sc.nextInt();
		String numType = "zero";
		
		if(inputNum>0)
		{
			numType = "plus";
		}
		else if(inputNum<0)
		{
			numType = "minus";
		}
		System.out.println(numType);
	}
}
