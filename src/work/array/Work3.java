package work.array;

import java.util.Scanner;

public class Work3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] str = new String[10];
		for(int i=0;i<10;i++)
		{
			System.out.print("���ڸ� �Է����ּ���: ");
			String inputStr = sc.nextLine();
			str[i]=inputStr;
		}
		for(int i=9;i>=0;i--)
		{
			System.out.print(str[i]+" ");
		}

		
		
	}

}
