package ex190116;

public class Ex01 {

	public static void main(String[] args)
	{
		
		//조건식?피연산자02:피연산자03
		//조건식이 true면 피연산자 02로
		//조건식이 false면 피연산자 03으로
		
		int score = 95;
		char grade = (score>90) ? 'A' : 'B';
		
		if(score>90)
		{
			grade='A';
		}
		else
		{
			grade='B';
		}
		
		System.out.println(grade);
		
	}
	
}
