package work.repeat;

import java.util.Scanner;

public class Work10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		String space = " ";
		String star = "*";
		
		for(int i = 0; i<num; i++)
		{
			//스페이스문
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
		for(int i = 0; i<num-1; i++)
		{
			for(int k=num-(i+2);k>0;k--)
			{
				System.out.print(space);
			}
			for(int j=0;j<((i+1)*2)+1;j++)
			{
				System.out.print(star);
			}
			System.out.println("");

		}
		
	}

}
