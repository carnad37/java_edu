package ex190115;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		int inputNum = 0;
		inputNum=inputNumSys();
		
		if(inputNum == 0)
		{
			System.out.println("0�� �Է�");
		}
		
		System.out.println("���α׷� ����");
		
	}
	
	public static int inputNumSys()
	{
		
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ���: ");
		num = sc.nextInt();

		return num;
	}
	
	
}
