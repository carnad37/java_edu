package work.array;

import java.util.Scanner;

public class Work24 {
	
	public static void main(String[] args) {
		
		//���� ������ �Է����� �ް� �� ���� �ڸ����� ����غ���. 

		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		int num = scan.nextInt();
		int x=1,count=0;
		
		while(true)
		{
			int result = num/x;
			if(result<1)
			{
				break;
			}
			x*=10;
			count++;
		}
		
		System.out.println(count+"�ڸ���");
	}

}
