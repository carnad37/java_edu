package ex190122;

import java.util.Scanner;

public class Test08 {
	
	public static void main(String[] args) {
		
		//n�� �Է¹޾� n-1�� n���� ǥ�� ������.
		//�Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ���: ");
		int num = sc.nextInt();
		int i = 1, j = 1;
		//for���� �ι�����.
		//������ for���� �·� (��(n-1), ��(n))�߿� ���� ǥ��
		for(i = 1; i < (num);i++)
		{
			for(j = 1;j <(num+1);j++)
			{
				//
				System.out.print("("+i+", "+j+")"+"\t");
			}
			System.out.println("");
			
		}
		
		
	}

}
