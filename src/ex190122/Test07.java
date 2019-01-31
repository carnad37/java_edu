package ex190122;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) 
	{
		//좀다 for로 짜보기.
		
		//입력받은 수까지 1부터 홀수만 더해간다.
		//합이 n을 넘어가면 중단.
		//그때까지 대해진 홀수의 갯수, 합을 출력.
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		int i = 1, sum = 0, count = 0;
		//sum값이 num를 넘을때까지 합산을 반복.
		while(sum <= num)
		{
			sum = sum+i;
			//System.out.println("i:"+i);
			//System.out.println("preSum:"+sum);
			i += 2;
			count++;
		}
		//이전 i값을 빼줌.
		sum = sum-(i-2);
		//이전 count값.
		count = count-1;
		System.out.println("Sum : "+sum);
		System.out.println("Count : "+count);
		
	}
	
	
}
