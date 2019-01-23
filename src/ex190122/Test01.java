package ex190122;

import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args)
	{
		
		//한개의 자연수를 입력받아 그 배수를 10개 출력하는 프로그램을 작성
		
		Scanner sc = new Scanner(System.in);
		
		int inputNum = 0, i = 0, div = 0;
		System.out.print("정수를 입력해주세요: ");
		inputNum = sc.nextInt();
		
		for(i = 1; i < 11; i++)
		{
			
			//i*inputNum이 div에 저장
			div = i*inputNum;
			System.out.print(div+" ");
			
		}
		
		
	}

}
