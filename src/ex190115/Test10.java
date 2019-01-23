package ex190115;

import java.util.Scanner;

public class Test10{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		String numType = "zero";
		
		int inputNum = 0;
		System.out.print("정수를 입력해주세요: ");
		inputNum = sc.nextInt();
		
		//if(inputNum>0) {
		//	System.out.println("plus");
		//}
		//if(inputNum==0) {
		//	System.out.println("zero");
		//}
		//if(inputNum<0) {
		//	System.out.println("minus");
		//}
		//1.0인지 확인
		//2.음수인지 확인
		//3.양수인지 확인
		
		if(inputNum>0)
		{
			numType = "plus";
		}
		if(inputNum<0)
		{
			numType = "minus";
		}
		System.out.println(numType);
		
	}
	
}
