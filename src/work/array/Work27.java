package work.array;

import java.util.Scanner;

public class Work27 {
	
	//���ڸ� �Է¹ް� ���ڵ��� �ѹ��� ���Ǿ����� Ȯ���Ѵ�.
	
	public static void main(String[] args) {
		
		//String���� �Է¹ް� char[]�� ��´�.
		Work27 w27 = new Work27();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		String inputNum = scan.nextLine();
		
		int[] numArray = w27.setStringToChar(inputNum);
		w27.printCheckRepeatNumber(numArray);
		
				
	}
	
	public int[] setStringToChar(String str)
	{
		int[] intArray = new int[str.length()];
		for(int i=0;i<intArray.length;i++)
		{
			intArray[i]=str.charAt(i)-48;
		}
		return intArray;
	}
	
	public void printCheckRepeatNumber(int[] intArray)
	{
		//2���� ��ġ��
		//1.���ڵ��� 1�� �� ��->1�� 2���̻� ������ �ٷ� break�� false����
		//2.�� ���ھ� 0~9�� ��. count �ѵ�, �������ڸ� ���ϰ� count�� �����Ǵ��� Ȯ��.
		boolean numberRepeat = true;
		mainLoop:
		for(int i=0;i<9;i++)
		{
			int count=0;
			for(int j=0;j<intArray.length;j++)
			{
				int value = intArray[j];
				if(i==value)
				{
					count++;
				}

				if(count>1)
				{
					numberRepeat = false;
					break mainLoop;
				}
			}
		}
		System.out.println(numberRepeat);
	}	
}
