package ex190122;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		//������. �� �Էµ� ��������.
		//�Էµȼ��� ���� ����.
		Scanner sc = new Scanner(System.in);
		
		int i = 0, j = 0;
		int min = 0, max = 0, mul = 0;
		
		System.out.println("�������� ���۹����� �Է����ּ���: ");
		int num01 = sc.nextInt();
		System.out.println("�������� ������ ������ �Է����ּ���: ");
		int num02 = sc.nextInt();
		
		//�μ��� ũ�� ��.
		if(num01>num02)
		{
			min = num02;
			max = num01;
		}
		else
		{
			max = num02;
			min = num01;
		}			
			
		for(i=1;i<10;i++)
		{
			for(j=min; j<(max+1);j++)
			{
				mul = i*j;
				System.out.println(i+" * "+j+" = "+mul);
			}
				
		}
		
		
	}
	
}
