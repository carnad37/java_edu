package ex190123;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		//100이하의 두개의 정수입력
		//작은 수부터 큰수까지 출력
		
		Scanner sc = new Scanner(System.in);
		int max = 0, min = 0, num01 = 0, num02 = 0, i = 1;
		System.out.print("첫번째 정수를 입력해주세요: ");
		num01 = sc.nextInt();
		System.out.print("두번째 정수를 입력해주세요: ");
		num02 = sc.nextInt();
		//큰수와 작은수 분별.
		if(num01>num02)
		{
			max = num01;
			min = num02;
		}
		else
		{
			max = num02;
			min = num01;
		}
		max++;
		while(min<max)
		{
			//출력시작
			System.out.println(min);
			min++;
		}
	}
	
}
