package ex190129.Test03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MyInfo mi = new MyInfo();
		
		String fName = null;
		String adress = null;
		int cYear = 0;
		
		System.out.print("family Name을 입력해주세요: ");
		fName = sc.next();
		fName = mi.getMyName(fName);
		System.out.println("풀네임 : "+fName+"\n");
		
		System.out.print("현재 연도를 입력해주세요: ");
		cYear = sc.nextInt();
		cYear = mi.getMyAge(cYear);
		System.out.println("현재나이 : "+cYear+"\n");
		
		adress = mi.getMyAddress();
		System.out.println("주소 : "+adress);
		
	}
	
}
