package work.repeat;

import java.util.Scanner;

public class Work23 {
	
	public static void main(String[] args) {
		
		char start = '0';
		char end = '9';
		int numStart = start;
		int numEnd = end;
		boolean numberChecker = true;

		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է����ּ��� : ");
		String inputNum = sc.nextLine();
		
		for(int i=0;i<inputNum.length();i++)
		{
			char check = inputNum.charAt(i);
			int intCheck = check;
			if((intCheck<numStart)||(intCheck>numEnd))
			{
				System.out.println((i+1)+"��° �ڸ��� ���ڰ� �ƴմϴ�.");
				numberChecker = false;
			}
		}
		if(!numberChecker)
		{
			System.out.println("�ؼ��� �ܿ� ���ڰ� �����ֽ��ϴ١�");
		}
		else
		{
			System.out.println("�ؼ��ڷ� �� ���ڿ��Դϴ١�");
		}
	}

}
