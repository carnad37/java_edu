package work.array;

import java.util.Scanner;

public class Work04 {
	
	public static void main(String[] args) {
		
		Work04 w4 = new Work04();
		
		//5���� �Է¹ް�
		//ù��° ����° �ټ���° �Է¹��� ������ ���� ���
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int sum1=0,sum2,avg;
		for(int i=0;i<5;i++)
		{
			System.out.print("���ڸ� �Է����ּ���: ");
			int inputNum = sc.nextInt();
			num[i]=inputNum;
		}
		
		int sum = w4.printNumber(num);
		System.out.println(sum);
		//0,2,4
		
	}
	public int printNumber(int[] num)
	{
		int sum=0;
		for(int i=0;i<5;i++)
		{
			
			if(i%2==0)
			{
				sum+=num[i];
			}
			
		}
		return sum;
	}

}
