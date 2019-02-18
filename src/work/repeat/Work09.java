package work.repeat;

import java.util.Scanner;

public class Work09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String star = "*";
		
		
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		int i = 0;
		int j = 0;
		
		for(i=0;i<num;i++) 
		{
			for(j=0;j<(i+1);j++)
			{
				System.out.print(star);
			}
			
			System.out.println("");
		}
		for(i=1;i<num;i++)
		{
			for(j=num;j>i;j--)
			{
				System.out.print(star);
			}
			System.out.println("");
		}
		
//		for(i=0;i<(num*2)-1;i++)
//		{
//			for(j=0;j<num;j++)
//			{
//				if(i>num)
//				{
//					System.out.print(star);
//				}
//				else
//				{
//					System.out.println(space);
//				}
//			}
//		}
		
	}
	
}
