package ex190122;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		//1���� 100������ ������ �Է¹޾�
		//������� ����ϴٰ�
		//100�� �Ѿ�� ����.
		//�Ǵ� 10�� ������� ����.
		
		Scanner sc = new Scanner(System.in);
		int num = 0, i = 0, mul = 0;
				//�Է�
		System.out.print("1���� 100������ ������ �Է����ּ���: ");
		num = sc.nextInt();
		
		
		for(i = 1; i < 11; i++)
		{
			
		
			//������
			mul = num*i;
			
			//100 �̻��Ͻ� ����
			if(mul > 100)
			{
				break;
			}
			
			System.out.print(mul+" ");
			
		}
		
		
	}
	
}
