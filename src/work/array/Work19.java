package work.array;

import java.util.Scanner;

public class Work19 {

	public static void main(String[] args) {
		
		//자연수를 전달 받아서 숫자의 각 자릿수의 출력하세요 
		int[] numArray;

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int inputNum = scan.nextInt();
		
		//먼저 10의 배수 x를 구하자.
		int multi10 = 1, count = 1;
		while(true)
		{
			int result=inputNum/multi10;
			if(result<10)
			{
				break;
			}
			multi10*=10;
			count++;
		}
		numArray = new int[count];
		//구한 multi10으로 inputNum을 나누고 나머지를 inputNum에 다시 저장.
		for(int i=0;i<count;i++)
		{
			int result = inputNum/multi10;
			numArray[i]=result;
			inputNum=inputNum%multi10;
			multi10=multi10/10;
		}
		//출력
		int sum = 0;
		for(int i=0;i<numArray.length;i++)
		{
			System.out.print(numArray[i]);
			if(i!=numArray.length-1)
			{
				System.out.print("+");
			}
			sum+=numArray[i];
		}
		System.out.print("="+sum);
	}
	
}
