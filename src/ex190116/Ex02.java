package ex190116;

public class Ex02 {

	public static void main(String[] args)
	{
		int score = 95;
		String grade = null;
		
		if(score>=90)
		{
			//System.out.println("������ 100~90 �Դϴ�.");
			//System.out.println("����� A �Դϴ�.");
			grade = "A";
		}
		else if(score>=80)
		{
			//System.out.println("������ 90~80 �Դϴ�.");
			//System.out.println("����� B �Դϴ�.");
			grade = "B";
		}
		else if(score>=70)
		{
			//System.out.println("������ 80~70 �Դϴ�.");
			//System.out.println("����� C �Դϴ�.");
			grade = "C";
		}
		else
		{
			System.out.println("������ 70�� �̸��Դϴ�.");
			System.out.println("����� D �Դϴ�.");
			return;
		}
		System.out.println(((score%10)*10));
	}	
}
