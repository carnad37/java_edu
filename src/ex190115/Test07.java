package ex190115;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String inputS = null;
		int age = 0;
		
		//�����Է�
		
		System.out.println("������ �Է����ּ���");
		inputS = sc.next();
		
		//���� �Է�
		
		System.out.println("���̸� �Է����ּ���");
		age = sc.nextInt();
		
		if(inputS.equals("M") ) {
			
			manAge(age);
			
		}else {
			
			womanAge(age);
			
		}
		
		
		/*
		if(inputS.equals("M")) {
			
			if(age>=18) {
				
				System.out.println("MAN");
				
			}else {
				
				System.out.println("BOY");
				
			}
			
		}else {
			
			if(age>=18) {
				
				System.out.println("WOMAN");
				
			}else {
				
				System.out.println("GIRL");
				
			}
						
		}
		*/
	}
	
	public static void manAge(int age) {
		
		if(age>=18) {
			
			System.out.println("MAN");
			
		}else {
			
			System.out.println("BOY");
			
		}
		
	}
	
	public static void womanAge(int age) {

		if(age>=18) {
			
			System.out.println("WOMAN");
			
		}else {
			
			System.out.println("GIRL");
	}
	
  }
}
