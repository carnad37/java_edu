package ex190118;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("등급을 입력해주세요: ");
		String charToString = sc.next();
		char grade = charToString.charAt(0);
		
		//string.charAt(int index)로 string을 char로 변경가능.
		
	/*
		switch(grade)
		{
			case 'A':
				System.out.println(grade+"일 경우 90점 이상입니다.");
				break;
			case 'B':
				System.out.println(grade+"일 경우 80점 이상입니다.");
				break;
			case 'C':
				System.out.println(grade+"일 경우 70점 이상입니다.");
				break;
			case 'D':
				System.out.println(grade+"일 경우 70점 이하입니다.");
				break;		
		}
	*/
		if(grade == 'A')
		{
			System.out.println(grade+"일 경우 90점 이상입니다.");
		}
		else if(grade == 'B')
		{
			System.out.println(grade+"일 경우 80점 이상입니다.");
		}
		else if(grade == 'C')
		{
			System.out.println(grade+"일 경우 70점 이상입니다.");
		}
		else if(grade == 'D')
		{
			System.out.println(grade+"일 경우 70점 이하입니다.");
		}
		
	}
	
}
