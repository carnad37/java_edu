package ex190117;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args)
	{
		
		//�ΰ��� �Ǽ��� �Է¹޾� ��� 4.0 �̻��̸� A, 3.0�̻��̸� B, �ƴϸ� C��� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է����ּ���: ");
		double num01 = sc.nextDouble();
		
		System.out.println("�ι�° ���� �Է����ּ���: ");
		double num02 = sc.nextDouble();
		
		if((num01 > 4.0) & (num02 > 4.0))
		{
			System.out.println("A");
		}
		else if((num01 > 3.0) & (num02 > 3.0))
		{
			System.out.println("B");
		}
		else
		{
			System.out.println("C");
		}
		
	}
	
}
