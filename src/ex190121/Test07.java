package ex190121;

import java.util.Scanner;

public class Test07 {
	
	public static void main(String[] args) {
		
		//������ �Է¹޾Ƽ�, 1���� �Է¹��� �� ������ 5�� ����� ���� ���Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		int sum = 0, i = 1, num = 0;
		System.out.print("5�̻��� ������ �Է����ּ���: ");
		num = sc.nextInt();
		if(num>=5)
		{
			for(;i <= num;i++)
			{
				if(i%5 ==0)
				{
					sum += i;
				}
			}
			System.out.println(sum);
			return;
		}
		System.out.println("5�̸��� ���� �Է��ϼ̽��ϴ�."+"\n"+"�ý����� �����մϴ�.");
	}
}
