package ex190123;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		//100������ �ΰ��� �����Է�
		//���� ������ ū������ ���
		
		Scanner sc = new Scanner(System.in);
		int max = 0, min = 0, num01 = 0, num02 = 0, i = 1;
		System.out.print("ù��° ������ �Է����ּ���: ");
		num01 = sc.nextInt();
		System.out.print("�ι�° ������ �Է����ּ���: ");
		num02 = sc.nextInt();
		//ū���� ������ �к�.
		if(num01>num02)
		{
			max = num01;
			min = num02;
		}
		else
		{
			max = num02;
			min = num01;
		}
		max++;
		while(min<max)
		{
			//��½���
			System.out.println(min);
			min++;
		}
	}
	
}
