package work.algorithm;

public class Main {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		int ret=0;
		int x=1;
		int y=2;
		ret = cal.plus(x,y);
		System.out.println(ret);
		x=4;
		y=2;
		ret = cal.minus(x,y);
		System.out.println(ret);
		x=3;
		y=3;	
		ret = cal.mul(x,y);
		System.out.println(ret);
		x=10;
		y=4;
		ret = cal.divide(x,y);
		System.out.println(ret);
		
		
	}
	
}
