package work.array;

import java.util.Scanner;

public class Work20 {
	
	public static void main(String[] args) {
		
		//�ִ����� ���ϱ�.
		//�� ��� �迭�� �����, �� �迭���� ���Ѵ�.
		//�� ���� ����� ã�´�. ���ÿ� ����� ã������ ��츦 Ȯ���Ѵ�.
		
		int[] numArray = new int[2];
		Scanner scan = new Scanner(System.in);
		
		int minNumber=0, maxDiv=0;
		
		for(int i=0;i<2;i++)
		{
			System.out.print("���ڸ� �Է����ּ���");
			numArray[i] = scan.nextInt();
		}
		if(numArray[0]>numArray[1])
		{
			minNumber = numArray[1];
		}
		else
		{
			minNumber = numArray[0];
		}
		for(int j=minNumber;j>0;j--)
		{
			if((numArray[1]%j==0)&&(numArray[0]%j==0))
			{
				maxDiv = j;
				break;
			}
		}
		System.out.println(maxDiv);
		
		
	}
//	public int[] setDivNumberArray(int num)
//	{
//		int[] DivNumberArray;
//		for(int i=2;i<num;i++)
//		{
//			
//		}
//	}

}
