package ex190118;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ���: ");
		String nameType = sc.next();
		/*
		switch(nameType)
		{
			case "����":
				System.out.println("3�� �ްԽǷ� ������.");
				break;
			case "����":
				System.out.println("2�� ȸ�ǽǷ� ������.");
				break;
			case "���":
				System.out.println("�׳� �ű⼭ ��ٸ�����.");
				break;
			default:
				System.out.println("������ �߸� �ԷµǾ����ϴ�.");
		}
		*/
		if(nameType.equals("����"))
		{
			System.out.println("3�� �ްԽǷ� ������.");
		}
		else if(nameType.equals("����"))
		{
			System.out.println("2�� ȸ�ǽǷ� ������.");
		}
		else if(nameType.equals("����"))
		{
			System.out.println("�׳� �ű⼭ ��ٸ�����.");
		}
		
	}
	
}
