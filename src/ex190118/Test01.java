package ex190118;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �Է����ּ���: ");
		String charToString = sc.next();
		char grade = charToString.charAt(0);
		
		//string.charAt(int index)�� string�� char�� ���氡��.
		
	/*
		switch(grade)
		{
			case 'A':
				System.out.println(grade+"�� ��� 90�� �̻��Դϴ�.");
				break;
			case 'B':
				System.out.println(grade+"�� ��� 80�� �̻��Դϴ�.");
				break;
			case 'C':
				System.out.println(grade+"�� ��� 70�� �̻��Դϴ�.");
				break;
			case 'D':
				System.out.println(grade+"�� ��� 70�� �����Դϴ�.");
				break;		
		}
	*/
		if(grade == 'A')
		{
			System.out.println(grade+"�� ��� 90�� �̻��Դϴ�.");
		}
		else if(grade == 'B')
		{
			System.out.println(grade+"�� ��� 80�� �̻��Դϴ�.");
		}
		else if(grade == 'C')
		{
			System.out.println(grade+"�� ��� 70�� �̻��Դϴ�.");
		}
		else if(grade == 'D')
		{
			System.out.println(grade+"�� ��� 70�� �����Դϴ�.");
		}
		
	}
	
}
