package ex190115;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//3���� ���� �Է¹޴´�.
		int num01 = 0, num02 = 0, num03 = 0;
		int min = 0;
		System.out.println("ù��° ���� �Է��ϼ���");
		num01 = sc.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���");
		num02 = sc.nextInt();
		System.out.println("����° ���� �Է��ϼ���");
		num03 = sc.nextInt();
		//����� ���� �ľ�.
		//1-2��.
		//ū���� �������� ����.
		//1�� ���� 01�� ���� ���
		//2�� ���� 02�� ���� ���
		//������ ���� 03�� ���Ͽ� 03���� ���� ��츦 ���. �������� ������.
		/*
		if(num01>num02) {
			//02�� ���� ���
			if(num02>num03) {
				//03�� ���� ���
				System.out.println(num03);
			}else {
				//02�� �������
				System.out.println(num02);
			}
		}else {
			//01�� �۰ų� ���� ���
			if(num01>num03) {
				//03�� ���� ���
				System.out.println(num03);
			}else {
				//01�� ���� ���
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
