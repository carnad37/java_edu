package work.repeat;

import java.util.Scanner;

public class Work07 {

	public static void main(String[] args) {
		
		int al = 65;
		int nu = 1;
		char alpha;
		//�ݺ����� space�� �ݺ����� *�ݺ��� 2���� �ʿ�
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ���: ");
		int num = sc.nextInt();
		for(int i=1;i<num+1;i++)
		{
			//�̰ɷ� �� 3�� �ݺ���.
			//�μ��� i=0�� �־���
			//���ο��� �μ� k�� ���� �ʿ䰡 ����.
						//���� �����̽���. �����̽��� 0->1->2������ ������.
//			for(int j=0; j<(num-i); j++)	//ù������ �ǳʶپ���
//			{
//				System.out.print(nu+"\t");
//				nu++;
//			}
//			for(int k=0;k<=i;k++)
//			{
//				alpha = (char)al;
//				System.out.print(alpha+"\t");
//				al++;
//			}
			for(int j=num+1; j>0; j--)
			{
				if(j<=i)
				{
					alpha = (char)al;
					System.out.print(alpha+"\t");
					al++;
				}
				else
				{
					System.out.print(nu+"\t");
					nu++;
				}
			}
			System.out.println("");
		}
	}
		
}
	
