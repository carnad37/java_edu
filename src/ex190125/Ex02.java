package ex190125;

public class Ex02 {

	//for-each��
	//for(int k(n�� ��ҵ��� �ϳ��� ����) : n(�迭����))
	//{
	//	�ڵ� ��
	//}

	
	
	public static void main(String[] args) {
		
		int[]n = {1,2,3,4,5};
		int sum = 0;
		for(int k:n)
		{
			sum+=k;
		}
		System.out.println(sum);
		
	}
}
