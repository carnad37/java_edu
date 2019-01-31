package work.repeat;

import java.util.Scanner;

public class Work08 {
	
	public static void main(String[] args) {
		//4/1
		//2/3
		//0/5
		String space = " ";
		String star = "*";
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		for(int i=0;i<num;i++)
		{
			for(int j=0; j<((num-i)*2)-2; j++)
			{
				System.out.print(space);
			}
			for(int k=0;k<((i+1)*2)-1;k++)
			{
				System.out.print(star);
			}
			System.out.println("");
		}
	}

}
