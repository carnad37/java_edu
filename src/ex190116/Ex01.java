package ex190116;

public class Ex01 {

	public static void main(String[] args)
	{
		
		//���ǽ�?�ǿ�����02:�ǿ�����03
		//���ǽ��� true�� �ǿ����� 02��
		//���ǽ��� false�� �ǿ����� 03����
		
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
