package ex190129.Test03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MyInfo mi = new MyInfo();
		
		String fName = null;
		String adress = null;
		int cYear = 0;
		
		System.out.print("family Name�� �Է����ּ���: ");
		fName = sc.next();
		fName = mi.getMyName(fName);
		System.out.println("Ǯ���� : "+fName+"\n");
		
		System.out.print("���� ������ �Է����ּ���: ");
		cYear = sc.nextInt();
		cYear = mi.getMyAge(cYear);
		System.out.println("���糪�� : "+cYear+"\n");
		
		adress = mi.getMyAddress();
		System.out.println("�ּ� : "+adress);
		
	}
	
}
