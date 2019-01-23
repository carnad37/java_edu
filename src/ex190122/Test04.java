package ex190122;

public class Test04 {

	public static void main(String[] args) {
		
		//화씨 온도 0도부터 100도까지
		//10도 간격으로 섭씨온도 환산 출력.
		
		//화씨온도는 i로 100까지 돌림
		//i++가 아니라 i+10
		int ftem = 10;
		double ctem = 0;
		
		//c=(f-32)/1.8
		for(ftem = 10; ftem < 101; ftem+=10)
		{
			//화씨 출력
			System.out.println("F : "+ftem);
			//화씨 섭씨로 변환
			ctem = (double)(ftem-30)/1.8; 
			//ctem = upNum(ctem);
			//섭씨 출력
			System.out.println("C : "+ctem);
		}
		
	}
	
	//소수점계산
	public static double upNum(double a)
	{
		double preA = 0;
		int cut = (int)(a*10);
		int ab = 0;
		//3.14일시에
		preA = a*100;
		//a=314
		cut = cut*10;
		//cut = 310
		int result = (int)(preA-cut);
		//result의값은 반올림값
		//절대값만들기
		if(result < 0)
		{
			result = result*(-1);
			ab = 1;
		}
		if(result >= 5)
		{
			result = 10;
		}
		else
		{
			result = 0;
		}
		//320또는 310출력.
		if(ab == 1)
		{
			result = result*(-1);
		}
		result = cut + result;
		preA = (double)result/100;
				
		return preA;
	}
	
	
}
