package work.array;

import java.util.Scanner;

public class Work5 {

	public static void main(String[] args) {
		
		//Ȧ����° ��, ¦����° ��.
		Work5 w5 = new Work5();
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		for(int i=0;i<10;i++)
		{
			System.out.print("���ڸ� �Է����ּ���: ");
			int inputNum = sc.nextInt();
			num[i]=inputNum;
		}
		
		w5.printSumNumber(num);
		
		
	}
	public void printSumNumber(int[] num)
	{
		int sum1=0, sum2=0;
		for(int i=0;i<10;i++)
		{
			
			if(i%2==0)
			{
				sum1+=num[i];
			}
			else
			{
				sum2+=num[i];
			}
			
		}
		System.out.println("¦����° �Է��� ���� "+sum2);
		System.out.println("Ȧ����° �Է��� ���� "+sum1);

	}

	
}
