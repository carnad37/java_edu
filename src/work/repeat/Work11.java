package work.repeat;

import java.util.Scanner;

public class Work11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		String space = " ";
		int i = 0;
		int j = 0;
		int k = 0;
		for(i=1;i<(num+1);i++)
		{
			for(j=(num*2);j>i*2;j--)
			{
				System.out.print(space);
			}
			for(k=0;k<i;k++)
			{
				System.out.print(k+1+" ");
			}
			System.out.println("");
		}
	}

}
