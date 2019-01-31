package work.repeat;

import java.util.Scanner;

public class Work05 {
	
	public static void main(String[] args) {
		
		//5,3,1순으로 출력
		//스페이스는 0,1,2순
		//별은 5,3,1순
		//입력은 행수
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
		
		
	}

}
