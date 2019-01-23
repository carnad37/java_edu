package ex190116;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요: ");
		int age = sc.nextInt();
		String ageType = null;
		
		if(age>60)
		{
			ageType = "노인";			
		}
		else if(age>30)
		{
			ageType = "장년층";
		}
		else if(age>18)
		{
			ageType = "젊은이";
		}
		else if(age>7)
		{
			if(age>16)
			{
				ageType="고등학생";
			}
			else if(age>13)
			{
				ageType="중학생";
			}
			else
			{
				ageType = "초등학생";
			}
		}
		else
		{
			ageType = "어린이";
		}
		System.out.println(ageType);
	}
	
}