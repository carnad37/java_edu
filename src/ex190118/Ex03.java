package ex190118;

public class Ex03 {

	public static void main(String[] args) {
		
		//for������ float�� �����������. �Ҽ������� �ٸ� ���� ������� ���� �ֱ⿡ ������ ����� �ִ�.
		int i = 0;
		int sum = 0;
		for(i = 1; i<11; i++)
		{
			if(i % 3 == 0)
			{
				sum = sum + i;				
			}
			
		}
		System.out.println("if sum : "+sum);
		
		sum = 0;
		for(i = 0; i<11; i = i+3)
		{
			sum = sum + i;
		}
		System.out.println("for sum : "+sum);
	}
	
}
