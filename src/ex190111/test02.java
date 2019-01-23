package ex190111;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		
		//시간, 분 변수
		int count = 60, sec = 0, min = 0;
		
		//스캐너 불러옴
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 입력해주시고 엔터를 쳐주세요: ");
		sec = sc.nextInt();
		
		//분,초 연산
		min=sec/count; //분계산
		sec=sec%count; //초계산
		
		//출력
		System.out.println("입력된 초를 환산하면,\n"+min+"분 "+sec+"초 입니다.");
		
	}	
}
