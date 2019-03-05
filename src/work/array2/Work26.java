package work.array2;

import java.util.Scanner;

class TargetPointer
{
	
	public int maxPointer=0;	
	
	public void inputArray(char[] target, int pointer)
	{
		if(target[pointer]=='0')
		{
			target[pointer]='1';
		}
		else if(target[pointer]=='1')
		{
			target[pointer]='2';
		}
		else if(target[pointer]=='2')
		{
			target[pointer]='4';
		}
		else if(target[pointer]=='4')
		{
			target[pointer]='1';
			pointer++;
			if(this.maxPointer<pointer)
			{
				this.maxPointer=pointer;
			}
			inputArray(target, pointer);
		}		
	}
	public void changeArray(char[] target, int data)
	{
		String number = String.valueOf(data);
		for(int i=0; i<number.length();i++)
		{
			target[i] = number.charAt(number.length()-1-i);
		}
	}
	public int setIntData(char[] data, int maxPointer)
	{
		String number="";
		for(int i=maxPointer;i>=0;i--)
		{
			String reForm = String.valueOf(data[i]);
			number+=reForm;
		}
		int result = Integer.parseInt(number);
		return result;
	}
}


public class Work26 {

	public static void main(String[] args) {
		
		Scanner	scan = new Scanner(System.in);
		Work26 w26 = new Work26();
		
		System.out.print("숫자를 입력해주세요: ");
		int inputNum = scan.nextInt();
		scan.close();
		w26.printResult(inputNum);
		
	}
	public void printResult(int num)
	{
		int[] numArray = new int[num];
		numArray[0]=1;
		for(int i=1;i<num;i++)
		{
			numArray[i] = setArray(numArray[i-1]);
		}
		System.out.println(numArray[num-1]);
				
	}
	public int setArray(int index)
	{
		TargetPointer tp = new TargetPointer();//객체생성
		//이전에 값을 만들 char[]로 만든다.
		char[] charArray = new char[100];
		for(int i=0;i<100;i++)
		{
			charArray[i]='0';
		}
		tp.changeArray(charArray, index);
		tp.inputArray(charArray, 0);
		int result = tp.setIntData(charArray, tp.maxPointer);
		return result;
	}

	
	

}
