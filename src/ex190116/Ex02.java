package ex190116;

public class Ex02 {

	public static void main(String[] args)
	{
		int score = 95;
		String grade = null;
		
		if(score>=90)
		{
			//System.out.println("점수가 100~90 입니다.");
			//System.out.println("등급은 A 입니다.");
			grade = "A";
		}
		else if(score>=80)
		{
			//System.out.println("점수가 90~80 입니다.");
			//System.out.println("등급은 B 입니다.");
			grade = "B";
		}
		else if(score>=70)
		{
			//System.out.println("점수가 80~70 입니다.");
			//System.out.println("등급은 C 입니다.");
			grade = "C";
		}
		else
		{
			System.out.println("점수가 70점 미만입니다.");
			System.out.println("등급은 D 입니다.");
			return;
		}
		System.out.println(((score%10)*10));
	}	
}
