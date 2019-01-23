package ex190117;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학점을 입력해주세요: ");
		double score = sc.nextDouble();
		String grade = null;
		
		if(score>4.0)
		{
			grade = "scholarship";
		}
		else if(score>3.0)
		{
			grade = "next semester";
		}
		else if(score>2.0)
		{
			grade = "seasonal semester";
		}
		else
		{
			grade = "retake";
		}
		
		System.out.println(grade);
	}
	
}
