package ex190116;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է����ּ���: ");
		String str = sc.next();
		
		String s = str.equals("m")?"m":"w";
		System.out.println(s);
	}
	
}
