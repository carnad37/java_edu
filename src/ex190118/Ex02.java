package ex190118;

public class Ex02 {

	public static void main(String[] args) {
		
		/*
		 	if(���ǽ�;)
		 	{
		 		���๮;
		  	}
			for(�ʱ�ȭ��; ���ǽ�; ������;)
			{
				���๮;
			}
		 �ʱ�ȭ ���� ó�� ���࿡�� �� �ѹ��� ����.
		 ���ǽ��� true�� ��� ���� �ݺ�.
		 ���ǽ��� ������ ���� ����.		 		 
		 */
		int sum = 0;
		int count = 0;
		int i = 0;
		for(i = 0 ; i < 11; i++)	//i�� 0�� �����ص� sum���� ��ȭ�� ������, 0ȸ���� ����Ǹ鼭 ī���ʹ� 1�� �þ��. 1�� �־���� �ʿ���� ������ ������ ���� ���� �ִ�.
		{
			sum = sum + i;
			count = count + 1;
		}
		System.out.println("sum : "+sum);
		System.out.println("count : "+count);
	}
}
