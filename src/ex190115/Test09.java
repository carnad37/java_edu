package ex190115;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num01 = 0, num02 = 0;
		int numMinus = 0;
		
		System.out.println("ù��° ���� �Է��ϼ���.");
		num01 = sc.nextInt();
		System.out.println("�ι��� ���� �Է��ϼ���.");
		num02 = sc.nextInt();
		
		if(num01>num02) {
			
			numMinus = num01 - num02;
			
		}else {
			
			numMinus = num02 - num01;
		}
		
		System.out.println(numMinus);
		
	}
	
}
