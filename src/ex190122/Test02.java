package ex190122;

import java.util.Scanner;

public class Test02 {
	
	public static void main(String[] args)
	{
		
		//정수 20개를 입력.
		//그 합과 평균을 출력.
		//0이 입력되면 중간에 중단.
		//그때까지 입력된 수의 합과 평균.
		//소수는 버리고 정수만.
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0, avg = 0, i = 0;
		
		for(i = 1; i < 21; i++)
		{
			
			//입력
			System.out.print(i+"번째 정수를 입력해주세요: ");
			num = sc.nextInt();
			
			//종료
			if(num == 0)
			{
				i -= 1;
				break;				
			}
			
			sum = sum + num;
			
		}
			
		//합계산
		//평균계산
		avg = sum/i;

		System.out.println("Sum : "+sum);
		System.out.println("Avg : "+avg);
	}

}
