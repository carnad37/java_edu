package ex190111;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
		int x= 3;
		int remainder =0;
		int num =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϰ� ���͸� ġ����: ");
		num= sc.nextInt();
		
		remainder = num % x;
		System.out.println("remainder=" + remainder);
		
	}
}
