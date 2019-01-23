package ex190115;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		int inputNum = 0;
		inputNum=inputNumSys();
		
		if(inputNum == 0)
		{
			System.out.println("0이 입력");
		}
		
		System.out.println("프로그램 종료");
		
	}
	
	public static int inputNumSys()
	{
		
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		num = sc.nextInt();

		return num;
	}
	
	
}
