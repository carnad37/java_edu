package ex190118;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("(100������ ����)");
		System.out.print("ù��° ������ �Է����ּ���: ");
		int num01 = sc.nextInt();
		System.out.print("�ι�° ������ �Է����ּ���: ");
		int num02 = sc.nextInt();
		//100�̻�� ���α׷�����.
		if((num01>100)||(num02>100))
		{
			System.out.println("100�̻��� ���� �Է��ϼ̽��ϴ�.");
			return;
		}
		//���� outPut();����.
		if(num01>num02)
		{
			outPut(num02, num01);
		}
		else
		{
			outPut(num01, num02);
		}
		/*

		int i = 0;
		int sum = 0;
		int min = 0;
		int max = 0;
		if(num01>num02)
		{
		min = num02;
		max = num01;
		}
		else
		{
		min = num01;
		max = num02;
		}
		for(i = min; i <= max; i++)
		{
			System.out.println(i);
		}
		
		 */
	}
	public static void outPut(int a, int b)
	{
		int i = 0;
		int j = 0;
		for(i = a; i <= b; i++)
		{
			for(j = 1; j < 6; j++)
			{
				System.out.print(i+"   ");
			}
			System.out.println("");
		}
		return;
	}
	
}
