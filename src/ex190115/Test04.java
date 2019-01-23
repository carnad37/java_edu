package ex190115;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		num = sc.nextInt();
		
		System.out.println(num);
		if(num<0) {
			
			System.out.println("minus");
			
		}
				
		
	}
	
}
