package work.array;

import java.util.Scanner;

public class Work2 {

	public static void main(String[] args) {
		
		
		Work2 w2 = new Work2();
		//10���� ������ �Է¹޾� �迭�� ����.
		//¦���� - ��, Ȧ���� -���
		//���ض�
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int sum1=0,sum2,avg;
		for(int i=0;i<10;i++)
		{
			System.out.print("���ڸ� �Է����ּ���: ");
			int inputNum = sc.nextInt();
			num[i]=inputNum;
		}
		double[] ret= w2.controlCal(num);
		System.out.println(ret[0]);
		System.out.println(ret[1]);

	}
	
	public double[] controlCal(int[] setNum)
	{
		double[] num = new double[2];
		int sum1=0, sum2=0;
		double avg = 0;
		for(int i=0;i<10;i++)
		{
			if(i%2==0)	//Ȧ���� ���-���
			{
				sum1+=setNum[i];
			}
			else	
			{
				sum2+=setNum[i];
			}
					
		}
		avg = (double)sum1/5;
		num[0]=(double)sum2;
		num[1]=avg;
		return num;
	}
}
