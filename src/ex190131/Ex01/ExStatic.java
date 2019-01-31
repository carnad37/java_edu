package ex190131.Ex01;

public class ExStatic {
	
	static int number;
	
	
	static
	{
		Ex02 ex = new Ex02();
		number = 1+ex.num;
	}

}
