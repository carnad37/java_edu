package ex190115;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int score = 91;
		
		if(score>=90) {
			System.out.println("점수가 90보다 높습니다.");
			System.out.println("등급은 A입니다.");
			esc();
			return;
		}
		//if(score<90)
			System.out.println("점수가 90보다 작습니다.");
		 	System.out.println("등급은 B입니다.");
		
		 	
		esc();
	}
	
	public static void esc() {
		
		System.out.println("종료");
		
	}
	
}
