package ex190122;

import java.util.Scanner;

public class Test06 {
	
	public static void main(String[] args) {
		
		//5���� ���� �Է� �޾Ƽ� 5���� �ּҰ��� ����ϼ���
		//���� ���Եɶ����� �������� ũ�⸦ ���ؼ� �� ������츸 �����.
		Scanner sc = new Scanner(System.in);
		
		int i = 0, num = 0, min = 0;
		
		for(;i<5;i++)
		{
			System.out.print("������ �Է����ּ���: ");
			num = sc.nextInt();
			//ù°�� min���
			if(i==0)
			{
				min = num;
			}
			//�ι�° �������� ��.
			if(min>num)
			{
				min = num;
			}
		}
		System.out.println("min : "+min);
		
		
	}

}
