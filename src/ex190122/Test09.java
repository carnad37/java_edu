package ex190122;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		//구구단. 단 입력된 수까지만.
		//입력된수는 열의 갯수.
		Scanner sc = new Scanner(System.in);
		
		int i = 0, j = 0;
		int min = 0, max = 0, mul = 0;
		
		System.out.println("구구단의 시작범위를 입력해주세요: ");
		int num01 = sc.nextInt();
		System.out.println("구구단이 끝나는 범위를 입력해주세요: ");
		int num02 = sc.nextInt();
		
		//두수의 크기 비교.
		if(num01>num02)
		{
			min = num02;
			max = num01;
		}
		else
		{
			max = num02;
			min = num01;
		}			
			
		for(i=1;i<10;i++)
		{
			for(j=min; j<(max+1);j++)
			{
				mul = i*j;
				System.out.println(i+" * "+j+" = "+mul);
			}
				
		}
		
		
	}
	
}
