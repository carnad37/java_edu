package ex190115;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int score = 91;
		
		if(score>=90) {
			System.out.println("������ 90���� �����ϴ�.");
			System.out.println("����� A�Դϴ�.");
			esc();
			return;
		}
		//if(score<90)
			System.out.println("������ 90���� �۽��ϴ�.");
		 	System.out.println("����� B�Դϴ�.");
		
		 	
		esc();
	}
	
	public static void esc() {
		
		System.out.println("����");
		
	}
	
}
