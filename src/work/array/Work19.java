package work.array;

import java.util.Scanner;

public class Work19 {

	public static void main(String[] args) {
		
		//�ڿ����� ���� �޾Ƽ� ������ �� �ڸ����� ����ϼ��� 
		int[] numArray;

		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		int inputNum = scan.nextInt();
		
		//���� 10�� ��� x�� ������.
		int multi10 = 1, count = 1;
		while(true)
		{
			int result=inputNum/multi10;
			if(result<10)
			{
				break;
			}
			multi10*=10;
			count++;
		}
		numArray = new int[count];
		//���� multi10���� inputNum�� ������ �������� inputNum�� �ٽ� ����.
		for(int i=0;i<count;i++)
		{
			int result = inputNum/multi10;
			numArray[i]=result;
			inputNum=inputNum%multi10;
			multi10=multi10/10;
		}
		//���
		int sum = 0;
		for(int i=0;i<numArray.length;i++)
		{
			System.out.print(numArray[i]);
			if(i!=numArray.length-1)
			{
				System.out.print("+");
			}
			sum+=numArray[i];
		}
		System.out.print("="+sum);
	}
	
}
