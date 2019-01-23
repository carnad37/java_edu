package ex190121;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		//0~100까지의 값을 입력해주다가 범위를 벗어나면
		//그전까지의 점수의 합계와 평균을 출력하는 프로그램을 작성하시오.
		int inputNum = 0, sum = 0, count = 0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		
		for(;;)
		{
			System.out.print("정수를 입력해주세요: ");
			inputNum = sc.nextInt();
			//종료
			if((inputNum>100)||(inputNum<0))
			{
				
				System.out.println("sum = "+sum);
				System.out.println("avg = "+avg);
				break;
				
			}
			//합계
			sum = sum + inputNum;

			//평균
			count++;
			avg = (double)sum/count;
			
		}
		
	}
	
}
