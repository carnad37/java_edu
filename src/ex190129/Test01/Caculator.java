package ex190129.Test01;

public class Caculator {
	
	int res = 0;
	double divRes = 0;
	
	public int plus(int x, int y)
	{
		System.out.println("입력값 확인 : x="+x+", y="+y);
		res = x+y;
		return res;
	}
	public int minus(int x, int y)
	{
		System.out.println("입력값 확인 : x="+x+", y="+y);
		res = x-y;
		return res;
	}
	public int mul(int x, int y)
	{
		System.out.println("입력값 확인 : x="+x+", y="+y);
		res = x*y;
		return res;
	}
	public double divide(int x, int y)
	{
		System.out.println("입력값 확인 : x="+x+", y="+y);
		divRes = (double)x/y;
		return divRes;
	}
	
}
