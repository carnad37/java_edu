package ex190129.Test01;

public class Main {

	public static void main(String[] args)
	{
		Caculator cal = new Caculator();
		
		int res = 0, x= 0, y=0;
		double divRes = 0;
		
		x= 1;
		y= 2;
		res = cal.plus(x, y);
		System.out.println("cal.plus = "+res);
		
		x= 4;
		y= 2;
		res = cal.minus(x, y);
		System.out.println("cal.minus = "+res);
		
		x= 3;
		y= 3;
		res = cal.mul(x, y);
		System.out.println("cal.mul = "+res);
		
		x= 10;
		y= 4;
		divRes = cal.divide(x, y);
		System.out.println("cal.div = "+divRes);
	}

}
