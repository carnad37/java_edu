package ex190123;

public class Test03 {

	public static void main(String[] args) {
		
		//1���� 10������ ���� 3�� ����� ��
		int i = 1, sum = 0;
		
		while(i<11)
		{			
			if(i%3==0)
			{
				sum+=i;
			}
			i++;
		}
		System.out.println("3�� ����� �� : "+sum);
	}
	
}
