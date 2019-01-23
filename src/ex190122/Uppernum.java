package ex190122;

public class Uppernum {
	
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
