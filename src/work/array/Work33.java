package work.array;

import java.util.Scanner;

public class Work33 {
	
	public static void main(String[] args) {
		
		//1���� 10���� �ڿ����� ���� ������ ���ϸ� ������ �����ϴ� (������ ��).
		//1^2 + 2^2 + ... + 10^2 = 385 1���� 10�� ���� ���� ������
		//�� ����� �����ϸ� ������ �����ϴ� (���� ����).
		//(1 + 2 + ... + 10)^2 = 55^2 = 3025
		//���� 1���� 10���� �ڿ����� ���� "���� ����"�� "������ ��" �� ���̴�
		//3025 - 385 = 2640 �� �˴ϴ�.
		//�׷��� 1���� 100���� �ڿ����� ���� "���� ����"�� "������ ��"�� ���̴� ���Դϱ�?

		Scanner scan = new Scanner(System.in);
		System.out.print("�ڿ����� �Է����ּ��� : ");
		int inputNum = scan.nextInt();
		int[] squreArray = new int[inputNum];

		//���� �� ������.
		//������ �迭�� �ڰ�, ������ �迭������ �������ش�.
		Work33 w33 = new Work33();
		int sumSq = squareNubmer(w33.sumNum(inputNum));
		System.out.println(w33.sumNum(inputNum));
		int sumNumSq=0;
		for(int i=0;i<inputNum;i++)
		{
			squreArray[i]=squareNubmer(i+1);
			sumNumSq+=squreArray[i];
		}
		int result =sumSq-sumNumSq;
		System.out.println(result);
		
	}
	
	public int sumNum(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		return sum;
	}
	

	public static int squareNubmer(int num)
	{
		int res = num*num;
		return res;
	}
}
