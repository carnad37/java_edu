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
	//add �ۼ�
	public static double add(int a, int b) {
		
		double res=0;		
		res=(double)a+b;
		return res;		
		
	}	
	//sub �ۼ�
	public static double sub(int a, int b) {
		
		double res = 0;		
		res = (double)a-b;
		return res;
		
	}	
	//mul �ۼ�
	public static double mul(int a, int b) {
		
		double res = 0;
		res = (double)a*b;
		return res;
		
	}	
	//div �ۼ�
	public static double div(int a, int b) {
		
		double res = 0;
		res = (double)a/b;
		return res;
	}
}