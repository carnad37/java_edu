package ex190121;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		//0~100������ ���� �Է����ִٰ� ������ �����
		//���������� ������ �հ�� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int inputNum = 0, sum = 0, count = 0;
		double avg = 0;
		Scanner sc = new Scanner(System.in);
		
		for(;;)
		{
			System.out.print("������ �Է����ּ���: ");
			inputNum = sc.nextInt();
			//����
			if((inputNum>100)||(inputNum<0))
			{
				
				System.out.println("sum = "+sum);
				System.out.println("avg = "+avg);
				break;
				
			}
			//�հ�
			sum = sum + inputNum;

			//���
			count++;
			avg = (double)sum/count;
			
		}
		
	}
	
}
