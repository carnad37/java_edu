package ex190118;

import java.util.Scanner;

public class Test07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		double avg = 0;
		int count = 0;
		int i = 0;
		String numType = null;
		//�Ҽ��� 2°�ڸ����� ����Ŀ�, *100���ϰ� 5�̻����� Ȯ���� ���� ���� ���ְ� 10�� �����ش�.
		//�׵� 10�� �����ָ� �ݿø�����.
		for(i = 1; i == 1;)
		{
			System.out.print("������ �Է����ּ���: ");
			num = sc.nextInt();
			sum = sum + num;
			count = count + 1;
			if(num>=100)
			{
				System.out.println("Sum : "+sum);
				avg = (double)sum/count;
				System.out.println("Avg : "+avg);
				i = 0;
				//return;
			}
		}
		
	}

}
