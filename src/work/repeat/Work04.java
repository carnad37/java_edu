package work.repeat;

import java.util.Scanner;

public class Work04 {
	
	public static void main(String[] args) {
		//���� 2�� �ʿ�.
		//space�� ��°� *�� ����� �ʿ�
		String star = "*";
		String space = " ";
		//�ݺ����� space�� �ݺ����� *�ݺ��� 2���� �ʿ�
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ���: ");
		int num = sc.nextInt();
		for(int i = 0;i<num;i++)
		{
			//�̰ɷ� �� 3�� �ݺ���.
			//�μ��� i=0�� �־���
			//���ο��� �μ� k�� ���� �ʿ䰡 ����.
						//���� �����̽���. �����̽��� 0->1->2������ ������.
			for(int j = 0; j<i; j++)	//ù������ �ǳʶپ���
			{
				System.out.print(space);
			}
			for(int k = num-i;k>0;k--)
			{
				System.out.print(star);
			}
			System.out.println("");
		}
	}

}
