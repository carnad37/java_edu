package ex190125;

import java.util.Scanner;

public class Test06 {
		
	public static void main(String[] args) {
		
		//10���� ������ �Է�.
		//100�̸��� ���� ���� ū��.
		//100�̻��� ���� ���� ������.
		//�ΰ� ���.
		//1�̻� 10000�̸�. �� ������ ������ 100�� �Է�.
		
		Scanner sc = new Scanner(System.in);
		int i = 0, num = 0, max = 0, min = 0;
		int[]iArr = new int[10];
		
		//�Է¹��� for��
		for(i=0;i<iArr.length;i++)
		{
			System.out.println((i+1)+"��° ���ڸ� �Է����ּ���: ");
			num = sc.nextInt();
			if((num<1)||(num>10000))
			{
				num = 100;
			}
			iArr[i]=num;
		}
		//�迭 ������ �˻�
		for(i=0;i<iArr.length;i++)
		{
			//100�̻����� �̸����� ����
			if(iArr[i]<100)
			{
				//100�̸��� ���߿��� ���� ū�� ã��.
				if(i>0)//������
				{
					if(iArr[i]>iArr[i-1])
					{
						max = iArr[i];
					}
				}
				else
				{
					max = iArr[i];
				}
			}
			else
			{
				//100�̻��� ���߿��� ���� ���� �� ã��.
				if(i>0)//������
				{
					if(iArr[i-1]>iArr[i])
					{
						min = iArr[i];
					}
					else
					{
						min = iArr[i];
					}
				}				
			}			
		}
		//�� ���
		System.out.println("100�̸����� ���� ū ���� "+max+"�̴�.");
		System.out.println("100�̻󿡼� ���� ���� ���� "+min+"�̴�.");
	}
}
