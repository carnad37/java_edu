package ex190115;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("숫자를 입력해주세요: ");
		num = sc.nextInt();
		int resNum = num % 3;
		
		if(resNum==0) {
			
			System.out.println("입력된 숫자는 3의 배수입니다.");
			//esc(resNum);
			//return;
		}
		
		if(resNum!=0) {
			
			System.out.println("입력된 숫자는 3의 배수가 아닙니다.");
			
		}
		
		//System.out.println("입력된 숫자는 3의 배수가 아닙니다.");
		//esc(resNum);
		System.out.println("프로그램 종료");
		
		
	}
	/*
	public static int esc(int num) {
		
		num=0;
		System.out.println("프로그램종료");
		return num;
	}
	*/
}
