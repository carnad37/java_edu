package ex190122;

import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args)
	{
		
		//�Ѱ��� �ڿ����� �Է¹޾� �� ����� 10�� ����ϴ� ���α׷��� �ۼ�
		
		Scanner sc = new Scanner(System.in);
		
		int inputNum = 0, i = 0, div = 0;
		System.out.print("������ �Է����ּ���: ");
		inputNum = sc.nextInt();
		
		for(i = 1; i < 11; i++)
		{
			
			//i*inputNum�� div�� ����
			div = i*inputNum;
			System.out.print(div+" ");
			
		}
		
		
	}

}
