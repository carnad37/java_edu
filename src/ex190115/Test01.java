package ex190115;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("���ڸ� �Է����ּ���: ");
		num = sc.nextInt();
		int resNum = num % 3;
		
		if(resNum==0) {
			
			System.out.println("�Էµ� ���ڴ� 3�� ����Դϴ�.");
			//esc(resNum);
			//return;
		}
		
		if(resNum!=0) {
			
			System.out.println("�Էµ� ���ڴ� 3�� ����� �ƴմϴ�.");
			
		}
		
		//System.out.println("�Էµ� ���ڴ� 3�� ����� �ƴմϴ�.");
		//esc(resNum);
		System.out.println("���α׷� ����");
		
		
	}
	/*
	public static int esc(int num) {
		
		num=0;
		System.out.println("���α׷�����");
		return num;
	}
	*/
}
