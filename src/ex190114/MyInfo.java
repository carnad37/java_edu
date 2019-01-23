package ex190114;

import java.util.Scanner;

public class MyInfo {
	
	public static void main(String[] args) {
		
		int citizenNumber = 0;
		int resNumber = 0;
		String name = null;

		resNumber = setCitizenNumber(citizenNumber);
		System.out.println("주민등록번호="+resNumber);
		name=getMyname(citizenNumber);
		System.out.println("이름="+name);

		
		
	}
	
	public static int setCitizenNumber(int citizenNumber) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("주민등록번호를 입력해주세요: ");
		citizenNumber=sc.nextInt();
		return citizenNumber;
		
		
	}
	
	public static String getMyname(int citizenNumber) {
		
		String myName=getTyping();
		return myName;
		
	}
	
	public static String getTyping()
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("이름을 입력해주세요: ");
		String myName=sc.next();
		return myName;
	}
	
}
