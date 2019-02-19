package ex190122;

public class Uppernum {
	
	//소수점계산
		public double upNum(double a)
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
		
		public double upControl(double value,int targetNumber)
		{
			//1.구하고 싶은 자리수만큼 100에 10을 제곱한다. 1이면 100, 2면 1000.
			//2.위에서 구해진 수를 10으로 나눠. 그 수로 a에 곱한다.int x에 저장.
			//3.a에 구한 수를 곱한다.int y에 저장.
			//4.y-x*10를 통해 대상이되는 소수점수를 구한다
			int cal = 100;
			for(int i=1;i<targetNumber;i++)
			{
				cal = cal*10;
			}
			int x = (int)(value*(cal/10));
			int y = (int)(value*cal);
			int result = y-(x*10);
			if(result >= 5)
			{
				result = 10;
			}
			else
			{
				result = 0;
			}
			double ret = (double)((x*10)+result)/cal;
					
			return ret;
		}

}
