package work.repeat;

import java.util.Scanner;

public class Work02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�ڿ����� �Է����ּ���: ");
		int num = sc.nextInt();
		String star = "*";
		String line = "";
		
		for(int i = 0; i<num; i++)
		{
			line +=star;
			System.out.println(line);
		}
			
	}	
}
