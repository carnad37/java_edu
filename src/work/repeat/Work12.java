package work.repeat;

import java.util.Scanner;

public class Work12 {

	public static void main(String[] args) {
		
		int al = 65;
		int sNum = 0;
		char ap;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ���: ");
		int num = sc.nextInt();
		
		int i=0,j=0,k=0;
		
		for(i=0;i<num;i++)
		{
			for(j=num;j>i;j--)
			{
				//char�� ĳ����
				ap = (char)al;
				System.out.print(ap+" ");
				al++;
			}
			for(k=0;k<i;k++)
			{
				System.out.print(sNum+" ");
				sNum++;
			}
			System.out.println("");
		}
		
	}
	
}
