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
		System.out.print("문자열을 입력해주세요 : ");
		String inputNum = sc.nextLine();
		
		for(int i=0;i<inputNum.length();i++)
		{
			char check = inputNum.charAt(i);
			int intCheck = check;
			if((intCheck<numStart)||(intCheck>numEnd))
			{
				System.out.println((i+1)+"번째 자리는 숫자가 아닙니다.");
				numberChecker = false;
			}
		}
		if(!numberChecker)
		{
			System.out.println("※숫자 외에 문자가 섞여있습니다※");
		}
		else
		{
			System.out.println("※숫자로 된 문자열입니다※");
		}
	}

}
