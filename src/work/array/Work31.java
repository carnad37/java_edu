package work.array;

import java.util.Scanner;

public class Work31
{

	public static void main(String[] args)
	{
		//������ ���ϱ�
		//�������� �ڽ��� ������� ���� �ڽ��� �Ǵ� ��.
		//������� int[]�� ���ϰ�, ���� ���ΰ� ���� ���� ã�´�.
		Work31 w31 = new Work31();

		Scanner scan = new Scanner(System.in);
		System.out.print("�ڿ����� �Է����ּ���(6�̻��̾���Ѵ�) : ");
		int num = scan.nextInt();
		w31.setDivNumberArray(num);
		
		
	}
	
	public void setDivNumberArray(int num)
	{
		int[] numArray = new int[100];


		for(int i=1;i<=num;i++)
		{
			int sum = 0;
			int divNum=1;
			int arrayIndex=0;
			while(true)
			{
				if(divNum>(i/2)||divNum==i)
				{
					break;
				}
				if(i%divNum==0)
				{
					numArray[arrayIndex]=divNum;
					arrayIndex++;
				}		
				divNum++;
			}
			for(int j=0;j<arrayIndex;j++)
			{
				sum+=numArray[j];
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
	}			
}

