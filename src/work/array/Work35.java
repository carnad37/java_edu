package work.array;

import java.util.Scanner;

class SetData
{
	int[] setArray;
	int compare;
	SetData(int number, int compare)
	{
		setArray = new int[number];
		this.compare = compare;
	}
	
}

public class Work35 {

	
	public static void main(String[] args) {
		
		/*
		
		2진법이란, 어떤 자연수를 0과 1로만 나타내는 것이다.
		예를 들어 73은 64(2^6)+8(2^3)+1(2^0)이기 때문에 1001001으로 표현한다.
		어떤 숫자를 입력받았을 때 그 숫자를 2진법으로 출력하는 프로그램을 작성하시오.
		(Integer.toBinaryString() 사용금지)
		
		*/
		
		//1.입력된 수보다 큰 2의 제곱을 구한다.
		//2.위에서 구한 수를 2로 나누고 입력된수에서 뺀다.
		//3.하나씩 내려가면서 빼주고, 체크한다.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int inputNum = scan.nextInt();
		Work35 w35 = new Work35();
		SetData stD = w35.setBinaryNumber(inputNum);
		String result = w35.setStringNumber(stD, inputNum);
		scan.close();
		
		System.out.println("2진법으로 변환하면, "+result+"이다.");
	}
	public SetData setBinaryNumber(int inputNum)
	{
		int compare = 1;
		int count = 1;
		while(true)
		{
			if(inputNum<compare)
			{
				break;
			}
			count++;
			compare*=2;
		}
		compare/=2;
		count--;
		SetData stD = new SetData(count,compare);
		return stD;
	}
	public String setStringNumber(SetData stD, int num)
	{
		int count = 0;
		while(true)
		{
			if(num==0)
			{
				break;
			}
			if(num>=stD.compare)
			{
				num-=stD.compare;
				stD.setArray[count]=1;
			}	
			stD.compare/=2;
			count++;
		}
		String sumWord = "";
		for(int i=0;i<stD.setArray.length;i++)
		{
			sumWord += String.valueOf(stD.setArray[i]);
		}
		return sumWord;
	}
}
