package ex190115;

import java.util.Scanner;

public class Tset04 {

	public static void main(String[] args) {
		
		int inputNum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��� �ּ���: ");
		inputNum = sc.nextInt();
		int resNum = inputNum % 3;
		
		if(resNum == 0){
			System.out.println("�Էµ� ���ڴ� 3�� ����Դϴ�.");			
		}else{			
			System.out.println("�Էµ� ���ڴ� 3�� ����� �ƴմϴ�.");
		}
		
		System.out.println("���α׷� ����");
		
		
	}
	
}
