package ex190117;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게를 입력해주세요: ");
		double weight = sc.nextDouble();
		String grade = null;
		
		if(weight>88.45)
		{
			grade = "Heavy weight";
		}
		else if(weight>72.57)
		{
			grade = "Cruiserweight";
		}
		else if(weight>61.23)
		{
			grade = "Middleweight";
		}
		else if(weight>50.80)
		{
			grade = "Lightweight";
		}
		else
		{
			grade = "Flyweight";
		}
		System.out.println(grade);
	}
	
}
