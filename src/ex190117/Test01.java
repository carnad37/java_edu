package ex190117;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳(대문자)를 입력해주세요: ");
		String inputEng = sc.nextLine();
		
		if(inputEng.equals("A"))
		{
			System.out.println("Excellent");			
		}
		else if(inputEng.equals("B"))
		{
			System.out.println("Good");
		}
		else if(inputEng.equals("C"))
		{
			System.out.println("Usually");
		}
		else if(inputEng.equals("D"))
		{
			System.out.println("Effort");
		}
		else if(inputEng.equals("E"))
		{
			System.out.println("Failure");
		}
		else
		{
			System.out.println("error");
		}
		
	}
	
}
