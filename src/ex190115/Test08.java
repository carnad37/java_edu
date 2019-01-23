package ex190115;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//3개의 값을 입력받는다.
		int num01 = 0, num02 = 0, num03 = 0;
		int min = 0;
		System.out.println("첫번째 값을 입력하세요");
		num01 = sc.nextInt();
		System.out.println("두번째 값을 입력하세요");
		num02 = sc.nextInt();
		System.out.println("세번째 값을 입력하세요");
		num03 = sc.nextInt();
		//경우의 수를 파악.
		//1-2비교.
		//큰수와 작은수가 나뉨.
		//1의 경우는 01이 작은 경우
		//2의 경우는 02가 작은 경우
		//각각의 경우와 03을 비교하여 03보다 작은 경우를 출력. 나머지는 버린다.
		/*
		if(num01>num02) {
			//02가 작은 경우
			if(num02>num03) {
				//03이 작은 경우
				System.out.println(num03);
			}else {
				//02가 작은경우
				System.out.println(num02);
			}
		}else {
			//01이 작거나 같은 경우
			if(num01>num03) {
				//03이 작은 경우
				System.out.println(num03);
			}else {
				//01이 작은 경우
				System.out.println(num01);
			}
		}
		*/
		
		if(num01>num02){
			min=num02;
		}else{
			min=num01;
		}
		if(num03<min){
			min=num03;
		}
		
		System.out.println(min);		 
		 	
	}
	
}
