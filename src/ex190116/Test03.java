package ex190116;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int inputNum = 0;
		String str = null;
		
		System.out.print("정수를 입력해주세요: ");
		inputNum = sc.nextInt();
		
		str = (inputNum<0) ? "minus" : "plus";
		
		
	}
	
}
