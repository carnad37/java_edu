package ex190125;

import java.util.Scanner;

public class Test06 {
		
	public static void main(String[] args) {
		
		//10개의 정수를 입력.
		//100미만의 수중 가장 큰수.
		//100이상의 수중 가장 작은수.
		//두개 출력.
		//1이상 10000미만. 이 범위를 넘으면 100을 입력.
		
		Scanner sc = new Scanner(System.in);
		int i = 0, num = 0, max = 0, min = 0;
		int[]iArr = new int[10];
		
		//입력받을 for문
		for(i=0;i<iArr.length;i++)
		{
			System.out.println((i+1)+"번째 숫자를 입력해주세요: ");
			num = sc.nextInt();
			if((num<1)||(num>10000))
			{
				num = 100;
			}
			iArr[i]=num;
		}
		//배열 내에서 검색
		for(i=0;i<iArr.length;i++)
		{
			//100이상인지 미만인지 구분
			if(iArr[i]<100)
			{
				//100미만의 수중에서 가장 큰수 찾기.
				if(i>0)//실제식
				{
					if(iArr[i]>iArr[i-1])
					{
						max = iArr[i];
					}
				}
				else
				{
					max = iArr[i];
				}
			}
			else
			{
				//100이상의 수중에서 가장 작은 수 찾기.
				if(i>0)//실제식
				{
					if(iArr[i-1]>iArr[i])
					{
						min = iArr[i];
					}
					else
					{
						min = iArr[i];
					}
				}				
			}			
		}
		//수 출력
		System.out.println("100미만에서 가장 큰 수는 "+max+"이다.");
		System.out.println("100이상에서 가장 작은 수는 "+min+"이다.");
	}
}
