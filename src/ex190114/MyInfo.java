package ex190114;

import java.util.Scanner;

public class MyInfo {
	
	public static void main(String[] args) {
		
		int citizenNumber = 0;
		int resNumber = 0;
		String name = null;

		resNumber = setCitizenNumber(citizenNumber);
		System.out.println("�ֹε�Ϲ�ȣ="+resNumber);
		name=getMyname(citizenNumber);
		System.out.println("�̸�="+name);

		
		
	}
	
	public static int setCitizenNumber(int citizenNumber) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ�� �Է����ּ���: ");
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
		System.out.print("�̸��� �Է����ּ���: ");
		String myName=sc.next();
		return myName;
	}
	
}
