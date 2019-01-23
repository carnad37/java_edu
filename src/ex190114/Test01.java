package ex190114;

public class Test01 {

	public static void main(String[] args) {
		
		int x= 4;
		int y = 2;
		double res = 0;
		
		res=add(x,y);
		System.out.println("add="+res);

		res=sub(x,y);
		System.out.println("sub="+res);

		res=mul(x,y);
		System.out.println("mul="+res);

		res=div(x,y);
		System.out.println("div="+res);		
		
	}	
	//add 累己
	public static double add(int a, int b) {
		
		double res=0;		
		res=(double)a+b;
		return res;		
		
	}	
	//sub 累己
	public static double sub(int a, int b) {
		
		double res = 0;		
		res = (double)a-b;
		return res;
		
	}	
	//mul 累己
	public static double mul(int a, int b) {
		
		double res = 0;
		res = (double)a*b;
		return res;
		
	}	
	//div 累己
	public static double div(int a, int b) {
		
		double res = 0;
		res = (double)a/b;
		return res;
	}
}