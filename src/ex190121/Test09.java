package ex190121;

import java.util.Scanner;

public class Test09 {
	
	public static void main(String[] args) {
		
		//두수를 입력받아 그 사이의 3과 5의 배수의 합과 평균을 출력하라.
		Scanner sc = new Scanner(System.in);
		
		int i = 0, num01 = 0, num02 = 0, min =0, max =0 , sum = 0, count = 0, avg= 0;
		
		System.out.print("첫번째 숫자를 입력해주세요: ");
		num01 = sc.nextInt();
		System.out.print("두번째 숫자를 입력해주세요: ");
		num02 = sc.nextInt();
		if(num01 > num02)
		{
			min = num02;
			max = num01;
		}
		else
		{
			min = num01;
			max = num02;
		}
		for(i = min;i<=max;i++)
		{
			if((i%3==0)||(i%5==0))
			{
				sum += i;
				count++;
			}
		}
		avg = sum/count;
		System.out.println("sum :"+sum);
		System.out.println("avg :"+avg);
	}

}
