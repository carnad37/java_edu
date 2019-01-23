package ex190115;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String str = null;
		String app = "apple";
		
		System.out.print("문자를 입력해주세요: ");
		str = sc.next();
		
		//String str = "apple";
		
		
		if(str.equals(app)){
			System.out.println("입력된 문자는 apple입니다.");
		}else {
			System.out.println("입력된 문자는 apple이 아닙니다.");
		}
		
		System.out.println("프로그램 종료");
	
	}
}
