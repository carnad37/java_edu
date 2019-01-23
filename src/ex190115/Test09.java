package ex190115;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num01 = 0, num02 = 0;
		int numMinus = 0;
		
		System.out.println("첫번째 수를 입력하세요.");
		num01 = sc.nextInt();
		System.out.println("두번쨰 수를 입력하세요.");
		num02 = sc.nextInt();
		
		if(num01>num02) {
			
			numMinus = num01 - num02;
			
		}else {
			
			numMinus = num02 - num01;
		}
		
		System.out.println(numMinus);
		
	}
	
}
