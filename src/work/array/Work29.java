package work.array;

import java.util.Scanner;

public class Work29 {
	
	public static void main(String[] args) {
		
		Work29 w29 = new Work29();
		
		//지정된 범위안에 숫자를 구성하는 숫자의 갯수의 합을 구하는 프로그램을 작성하라.
		//2번 입력받는다.
		//사이 숫자들을 거슬러 올라가면서 입력받은 숫자를 분해하여 0부터 9까지의 int 배열에 위치에 맞게 집어넣는다.
		//분해는 charAt도 가능하고 10의 배수로 나누면서 해도 가능.
		//다만 범위내 반복이므로 10의 배수를 이용하는게 좋다.(안그러면 int->String->int를 반복해줘야함)
		int[] countNumber = new int[10];
		int num01 = w29.inputNumber();
		int num02 = w29.inputNumber();
		int max=0,min=0;
		if(num01>num02)
		{
			max=num01;
			min=num02;
		}
		else
		{
			min=num01;
			max=num02;
		}
		for(int i=min;i<=max;i++)
		{
			w29.setcountNumberArray(countNumber,i);
		}
		w29.printArray(countNumber);
		
		
	}
	public int inputNumber()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int inputNum = scan.nextInt();
		return inputNum;
		
	}

	
	
	
	//x가 10의 몇배수로 나누면 10이하가 되는지 확인하는 메소드
	public int returnMul10(int num)
	{
		int mul10 = 1,result = 0;
		while(true)
		{
			result = num/mul10;
			if(result<10)
			{
				break;
			}
			mul10 *= 10;
		}
		return mul10;
	}
	//
	
	public void setcountNumberArray(int[] countNumber, int target)
	{
		Work29 w29 = new Work29();
		int mul10 = w29.returnMul10(target);
		int result = 0;
		for(int i=mul10;i>0;i/=10)
		{
			result=target/i;
			countNumber[result]++;
			target=target%i;
		}
//		while(true)
//		{
//			result=target/mul10;
//			if(result<1)
//			{
//				break;
//			}
//			countNumber[result]=result;
//			target=target%mul10;
//			mul10/=10;
//		}
	}
	
	public void printArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println(i +" : "+array[i]+"개");
		}
	}

}
