package ex190121;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		//10개의 정수를 입력받아 짝수와 홀수를 구분.
		//각각의 갯수(odd, even)을 출력.
		Scanner sc = new Scanner(System.in);
		int i = 0, odd = 0, even = 0, num = 0;
		for(i=1;i<11;i++)
		{
			System.out.print(i+"번째 정수를 입력해주세요: ");
			num = sc.nextInt();
			if(num%2 == 0)
			{
				odd++;
			}
			else
			{
				even++;
			}
		}
		System.out.println("even : "+even+"\n"+"odd : "+odd);
	}
	
}
