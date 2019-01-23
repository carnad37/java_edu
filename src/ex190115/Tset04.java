package ex190115;

import java.util.Scanner;

public class Tset04 {

	public static void main(String[] args) {
		
		int inputNum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해 주세요: ");
		inputNum = sc.nextInt();
		int resNum = inputNum % 3;
		
		if(resNum == 0){
			System.out.println("입력된 숫자는 3의 배수입니다.");			
		}else{			
			System.out.println("입력된 숫자는 3의 배수가 아닙니다.");
		}
		
		System.out.println("프로그램 종료");
		
		
	}
	
}
