package ex190122;

import java.util.Scanner;

public class Test08 {
	
	public static void main(String[] args) {
		
		//n을 입력받아 n-1줄 n행의 표를 만들어라.
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		int i = 1, j = 1;
		//for문을 두번돌림.
		//내부의 for문은 좌로 (행(n-1), 열(n))중에 열을 표시
		for(i = 1; i < (num);i++)
		{
			for(j = 1;j <(num+1);j++)
			{
				//
				System.out.print("("+i+", "+j+")"+"\t");
			}
			System.out.println("");
			
		}
		
		
	}

}
