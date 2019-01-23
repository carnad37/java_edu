package ex190122;

import java.util.Scanner;

public class Test06 {
	
	public static void main(String[] args) {
		
		//5개의 값을 입력 받아서 5개중 최소값을 출력하세요
		//값이 대입될때마다 이전값과 크기를 비교해서 더 작을경우만 남긴다.
		Scanner sc = new Scanner(System.in);
		
		int i = 0, num = 0, min = 0;
		
		for(;i<5;i++)
		{
			System.out.print("정수를 입력해주세요: ");
			num = sc.nextInt();
			//첫째값 min등록
			if(i==0)
			{
				min = num;
			}
			//두번째 값부터의 비교.
			if(min>num)
			{
				min = num;
			}
		}
		System.out.println("min : "+min);
		
		
	}

}
