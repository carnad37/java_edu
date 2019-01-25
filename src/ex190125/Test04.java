package ex190125;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//두반 번호를 입력받아서 두반의 평균의 합을 출력.
		int i = 0,num = 0;
		double avg = 0;
		double classArray[] = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		for(i=0;i<2;i++)
		{
			System.out.print("반을 입력해주세요: ");
			num = sc.nextInt()-1;
			avg += classArray[num];
		}
		System.out.println("두반의 평균점수의 합은 "+avg+"이다.");
		
		
		
	}
	public static double upNum(double a)
	{
		double preA = 0;
		int cut = (int)(a*10);
		int ab = 0;
		//3.14일시에
		preA = a*100;
		//a=314
		cut = cut*10;
		//cut = 310
		int result = (int)(preA-cut);
		//result의값은 반올림값
		//절대값만들기
		if(result < 0)
		{
			result = result*(-1);
			ab = 1;
		}
		if(result >= 5)
		{
			result = 10;
		}
		else
		{
			result = 0;
		}
		//320또는 310출력.
		if(ab == 1)
		{
			result = result*(-1);
		}
		result = cut + result;
		preA = (double)result/100;
				
		return preA;
	}
			
}
