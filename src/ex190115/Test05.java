package ex190115;

import java.util.Scanner;

public class Test05 {
	
	public static void main(String[] args) {
		
		int numT = 0;
		int numW = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű�� �Է����ּ���: ");
		numT = sc.nextInt();
		System.out.print("�����Ը� �Է����ּ���: ");
		numW = sc.nextInt();
		
		int res = numW + 100 - numT;
		
		System.out.println(res);
		
		if(res>0) {
			
			System.out.println("Obesity");
			
		}
		
		
		
	}

}
