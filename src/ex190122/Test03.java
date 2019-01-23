package ex190122;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		//1부터 100사이의 정수를 입력받아
		//배수들을 출력하다가
		//100이 넘어가면 종료.
		//또는 10의 배수에서 종료.
		
		Scanner sc = new Scanner(System.in);
		int num = 0, i = 0, mul = 0;
				//입력
		System.out.print("1부터 100사이의 정수를 입력해주세요: ");
		num = sc.nextInt();
		
		
		for(i = 1; i < 11; i++)
		{
			
		
			//배수계산
			mul = num*i;
			
			//100 이상일시 종료
			if(mul > 100)
			{
				break;
			}
			
			System.out.print(mul+" ");
			
		}
		
		
	}
	
}
