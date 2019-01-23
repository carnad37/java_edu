package ex190118;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;

		int i = 0;
		String numType = null;
		
		for(i = 1; i == 1;)
		{
			System.out.print("정수를 입력해주세요: ");
			num = sc.nextInt();
			if(num>0)
			{	
				System.out.println("positive intteger");
			}
			else if(num<0)
			{
				System.out.println("negative number");
			}
			else
			{
				i = 0;
				//return;
			}
		}
	}	
}
