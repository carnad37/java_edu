package ex190121;

import java.util.Scanner;

public class Test06 {
	
	public static void main(String[] args) {
		
		//10������ ���� �Է¹޾Ƽ�, �� ����ŭ�� �������� �Ͽ� ������ ������ �Է¹޴´�.
		//����� ���� 80�̻��̸� pass, �̸��̸� fail�� ����ϵ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		int i = 0, subNum = 0, score = 0, sum = 0, avg = 0;
		System.out.print("�� ��������� �Է����ּ���: ");
		subNum = sc.nextInt();
		
		for(i = 1; i <= subNum; i++)
		{
			System.out.print(i+"��° ������ ������ �Է����ּ���: ");
			score = sc.nextInt();
			sum = sum + score;
		}
		avg = sum/subNum;
		System.out.println("avg : "+avg);
		if(avg>=80)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
