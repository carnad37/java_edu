package ex190125;

import java.util.Scanner;

public class Test05 {
	
	public static void main(String[] args) {
		
		//10개의 정수를 입력.
		//가장 작은 수를 출력.
		//배열에 입력. 
		//입력->이전입력과 비교->min값에 입력...?
		Scanner sc = new Scanner(System.in);
		int i = 0, min = 0;
		int iArr[] = new int[10];
		
		for(i=0;i<iArr.length;i++)
		{
			//숫자를 입력한다.
			System.out.println((i+1)+"번째 정수를 입력해주세요: ");
			iArr[i] = sc.nextInt();
			//첫번째만 예외
			if(i==0)
			{	
				min = iArr[i];
			}
			else if(iArr[(i-1)]>iArr[i])
			{
				min = iArr[i];
			}
			
		}
		System.out.println("min : "+min);
		
	}

}
