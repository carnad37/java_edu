package ex190122;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) 
	{
		//���� for�� ¥����.
		
		//�Է¹��� ������ 1���� Ȧ���� ���ذ���.
		//���� n�� �Ѿ�� �ߴ�.
		//�׶����� ������ Ȧ���� ����, ���� ���.
		
		//�Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ���: ");
		int num = sc.nextInt();
		int i = 1, sum = 0, count = 0;
		//sum���� num�� ���������� �ջ��� �ݺ�.
		while(sum <= num)
		{
			sum = sum+i;
			//System.out.println("i:"+i);
			//System.out.println("preSum:"+sum);
			i += 2;
			count++;
		}
		//���� i���� ����.
		sum = sum-(i-2);
		//���� count��.
		count = count-1;
		System.out.println("Sum : "+sum);
		System.out.println("Count : "+count);
		
	}
	
	
}
