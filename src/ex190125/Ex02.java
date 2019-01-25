package ex190125;

public class Ex02 {

	//for-each문
	//for(int k(n의 요소들을 하나씩 대입) : n(배열변수))
	//{
	//	코드 블럭
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
