package ex190118;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("100������ ������ �Է����ּ���: ");
		int num = sc.nextInt();
		int i = 0;
		int sum = 0;
		for(i = 1; i <= num; i++)
		{
			//System.out.println("i : "+i);
			sum = sum + i;
		}
		System.out.println("Sum : "+sum);
	}
	
}