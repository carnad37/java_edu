package ex190114;

public class Test02 {

	public static void main(String[] args) {
		
		int x = 4, y = 2;
		
		add(x,y);
		sub(x,y);
		mul(x,y);
		div(x,y);
		
	
	}
	//add 累己
	public static void add(int a, int b) {
		
		double res=0;		
		res=(double)a+b;
		System.out.println("add="+res);		
	}
	
	//sub 累己
	public static void sub(int a, int b) {
		
		double res = 0;		
		res = (double)a-b;
		System.out.println("sub="+res);
		
	}	
	//mul 累己
	public static void mul(int a, int b) {
		
		double res = 0;
		res = (double)a*b;
		System.out.println("mul="+res);
		
	}	
	//div 累己
	public static void div(int a, int b) {
		
		double res = 0;
		res = (double)a/b;
		System.out.println("div="+res);
	}
}