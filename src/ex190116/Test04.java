package ex190116;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int num01 = 0, num02 = 0;
		int min = 0;
		
		System.out.print("첫번째 수를 입력해주세요: ");
		num01 = sc.nextInt();
		
		System.out.print("두번째 수를 입력해주세요: ");
		num02 = sc.nextInt();
		
		min = (num01>num02)? num02 : num01;
		System.out.println(min);
	}
	
}
