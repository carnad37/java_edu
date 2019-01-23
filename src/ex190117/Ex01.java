package ex190117;

public class Ex01 {

	public static void main(String[] args) 
	{
		int score = (int)(Math.random()*20)+81;
		System.out.println("점수: "+score);
		String grade = null;
		
		if(score>=90)
		{
			if(score>=95)
			{
				grade = "A+";
			}
			else
			{
				grade = "A";
			}
		}
		else if(score>=80)
		{
			if(score>=85)
			{
				grade = "B+";
			}
			else
			{
				grade = "B";
			}
		}

		System.out.println("학점: "+grade);
	}
}