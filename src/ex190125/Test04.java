package ex190125;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//�ι� ��ȣ�� �Է¹޾Ƽ� �ι��� ����� ���� ���.
		int i = 0,num = 0;
		double avg = 0;
		double classArray[] = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		for(i=0;i<2;i++)
		{
			System.out.print("���� �Է����ּ���: ");
			num = sc.nextInt()-1;
			avg += classArray[num];
		}
		System.out.println("�ι��� ��������� ���� "+avg+"�̴�.");
		
		
		
	}
	public static double upNum(double a)
	{
		double preA = 0;
		int cut = (int)(a*10);
		int ab = 0;
		//3.14�Ͻÿ�
		preA = a*100;
		//a=314
		cut = cut*10;
		//cut = 310
		int result = (int)(preA-cut);
		//result�ǰ��� �ݿø���
		//���밪�����
		if(result < 0)
		{
			result = result*(-1);
			ab = 1;
		}
		if(result >= 5)
		{
			result = 10;
		}
		else
		{
			result = 0;
		}
		//320�Ǵ� 310���.
		if(ab == 1)
		{
			result = result*(-1);
		}
		result = cut + result;
		preA = (double)result/100;
				
		return preA;
	}
			
}
