package ex190122;

import java.util.Scanner;

public class Test02 {
	
	public static void main(String[] args)
	{
		
		//���� 20���� �Է�.
		//�� �հ� ����� ���.
		//0�� �ԷµǸ� �߰��� �ߴ�.
		//�׶����� �Էµ� ���� �հ� ���.
		//�Ҽ��� ������ ������.
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0, avg = 0, i = 0;
		
		for(i = 1; i < 21; i++)
		{
			
			//�Է�
			System.out.print(i+"��° ������ �Է����ּ���: ");
			num = sc.nextInt();
			
			//����
			if(num == 0)
			{
				i -= 1;
				break;				
			}
			
			sum = sum + num;
			
		}
			
		//�հ��
		//��հ��
		avg = sum/i;

		System.out.println("Sum : "+sum);
		System.out.println("Avg : "+avg);
	}

}
