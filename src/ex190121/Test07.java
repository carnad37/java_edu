package ex190121;

import java.util.Scanner;

public class Test07 {
	
	public static void main(String[] args) {
		
		//정수를 입력받아서, 1부터 입력받은 수 사이의 5의 배수의 합을 구하시오.
		Scanner sc = new Scanner(System.in);
		int sum = 0, i = 1, num = 0;
		System.out.print("5이상의 정수를 입력해주세요: ");
		num = sc.nextInt();
		if(num>=5)
		{
			for(;i <= num;i++)
			{
				if(i%5 ==0)
				{
					sum += i;
				}
			}
			System.out.println(sum);
			return;
		}
		System.out.println("5미만의 값을 입력하셨습니다."+"\n"+"시스템을 종료합니다.");
	}
}
