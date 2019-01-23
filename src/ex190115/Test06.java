package ex190115;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		int years = 0, count = 0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요: ");
		years = sc.nextInt();
		
		if(years>=20) {
			
			System.out.println("adult");
			
		}else {
			
			count = 20-years;
			System.out.println(count+" years later");
		}
	}
	
}
