package ex190118;

public class Ex02 {

	public static void main(String[] args) {
		
		/*
		 	if(조건식;)
		 	{
		 		실행문;
		  	}
			for(초기화식; 조건식; 증감식;)
			{
				실행문;
			}
		 초기화 식은 처음 수행에서 단 한번만 실행.
		 조건식이 true면 계속 실행 반복.
		 조건식의 변수의 증감 설정.		 		 
		 */
		int sum = 0;
		int count = 0;
		int i = 0;
		for(i = 0 ; i < 11; i++)	//i에 0을 대입해도 sum값엔 변화가 없지만, 0회차가 수행되면서 카운터는 1이 늘어난다. 1을 넣어줘야 필요없는 차수의 수행을 막을 수가 있다.
		{
			sum = sum + i;
			count = count + 1;
		}
		System.out.println("sum : "+sum);
		System.out.println("count : "+count);
	}
}
