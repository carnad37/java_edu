package work.array;

import java.util.Scanner;

public class Work14 {
	
	public static void main(String[] args) {
		
		//���� ������ �Է¹޾Ƽ� ������ ���
		//������ ��µ� ���ڵ��� ���� ���� ���Ͽ���.
		
		Scanner sc = new Scanner(System.in);
		
		Work14 w14 = new Work14();
		int[] numArray;
		
		while(true)
		{
			System.out.print("������ �Է����ּ��� : ");
			String inputNumber = sc.nextLine();
			if(Integer.valueOf(inputNumber)==0)
			{
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			numArray = w14.makeStringToNumberArray(inputNumber);
			w14.reverseArrayPrint(numArray);
			w14.printArray(numArray);
			w14.printArraySum(numArray);
						
		}
	}
	public int[] makeStringToNumberArray(String word)
	{
		int[] numArray = new int[word.length()];
		for(int i=0;i<word.length();i++)
		{
			String pushNumber = String.valueOf(word.charAt(i));
			numArray[i]=Integer.parseInt(pushNumber);
		}
		return numArray;
	}
	public void reverseArrayPrint(int[] intArray)
	{
		int end = intArray.length/2; 
		for(int i=0;i<end;i++)
		{
			int value = intArray[i];
			intArray[i] = intArray[intArray.length-1-i];
			intArray[intArray.length-1-i] = value;
		}
	}
	public void printArray(int[] intArray)
	{
		for(int i=0;i<intArray.length;i++)
		{
			System.out.print(intArray[i]);
		}
		System.out.println("");
	}
	public void printArraySum(int[] intArray)
	{
		int sum = 0;
		for(int i=0;i<intArray.length;i++)
		{
			sum += intArray[i];
		}
		System.out.println(sum);
	}
	
}
