package ex190117;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args)
	{
		
		//두개의 실수를 입력받아 모두 4.0 이상이면 A, 3.0이상이면 B, 아니면 C라고 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력해주세요: ");
		double num01 = sc.nextDouble();
		
		System.out.println("두번째 수를 입력해주세요: ");
		double num02 = sc.nextDouble();
		
		if((num01 > 4.0) & (num02 > 4.0))
		{
			System.out.println("A");
		}
		else if((num01 > 3.0) & (num02 > 3.0))
		{
			System.out.println("B");
		}
		else
		{
			System.out.println("C");
		}
		
	}
	
}
