package work.repeat;

import java.util.Scanner;

public class Work13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cNum = 1;
		int i=0,j=0,k=0;
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		for(i=0;i<num;i++)
		{
			for(j=0;j<2*i;j++)
			{
				System.out.print(" ");
			}
			for(k=num;k>i;k--)
			{
				System.out.print(cNum+" ");
				cNum++;
			}
			System.out.println("");
		}
				
	}
	
}
