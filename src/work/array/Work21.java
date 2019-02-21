package work.array;

import java.util.Scanner;

public class Work21 {
	
	public static void main(String[] args) {
		
		//10���� ���� �ڿ��� �߿��� 3�Ǵ� 5�� ����� 3,5,6,9 �̰� �̰��� ��� ���ϸ� 23�Դϴ�. 1000���� ���� �ڿ��� �߿��� 3�Ǵ� 5�� ����� ��� ���ϸ� ���ϱ��?
		//369=1
		//5=1
		//
	
		Work21 w21 = new Work21();
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ���: ");
		int inputNum = scan.nextInt();
		int[] numArray = w21.setNumArray(inputNum);
		w21.printSumNumArray(numArray);
		
		
	}
	public int[] setNumArray(int num)
	{
		int div3,div5,div15,count=0;
		div3 = (num-1)/3;
		div5 = (num-1)/5;
		div15 = (num-1)/15;
		int divNumber = div3+div5-div15;
//		System.out.println(divNumber);
		int[] numArray = new int[divNumber];
		for(int i=0;i<num-1;i++)
		{
			if(((i+1)%3==0)||((i+1)%5==0))
			{
//				System.out.println(i+1);
				numArray[count]=i+1;
				count++;
			}
		}
		return numArray;
	}
	
	public void printSumNumArray(int[] numArray)
	{
		int sum = 0;
		for(int i=0;i<numArray.length;i++)
		{
			sum+=numArray[i];
		}
		System.out.println("�� ���� "+sum+"�̴�.");
	}
}
