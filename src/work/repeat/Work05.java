package work.repeat;

import java.util.Scanner;

public class Work05 {
	
	public static void main(String[] args) {
		
		//5,3,1������ ���
		//�����̽��� 0,1,2��
		//���� 5,3,1��
		//�Է��� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ���: ");
		int num = sc.nextInt();
		String space = " ";
		String star = "*";
		
		for(int i = 0; i<num; i++)
		{
			//�����̽���
			for(int j=0;j<i;j++)
			{
				System.out.print(space);
			}
			for(int k=(2*(num-i))-1;k>0;k--)
			{
				System.out.print(star);
			}
			System.out.println("");
		}
		
		
	}

}
