package work.repeat;

import java.util.Scanner;

public class Work06 {

	public static void main(String[] args) {
		
//		//A�� int�� ĳ���ý� 65.
//		char a = 'B';
//		int num = (int)a;
//		System.out.println(num);
//		
		Scanner sc = new Scanner(System.in);
		//65,66,67
		//68,69
		//70
		//�̷����� ���
		System.out.print("�ڿ����� �Է����ּ���: ");
		int num = sc.nextInt();
		int i = 0, count = 0;
		int alpha = 65;
		char cAlpha;
		for(i=0;i<num;i++)
		{
			//�� 3�� ����ȴ�
			count = num-i;
			while(count>0)
			{
				cAlpha = (char)alpha;
				System.out.print(cAlpha);
				alpha++;
				count--;
			}
			System.out.println("");
		}
	}
	
}
