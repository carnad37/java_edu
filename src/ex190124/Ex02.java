package ex190124;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] c = new int[3];
		int[] d = new int[3];
		
		int a = 0;
		
		a = 5;
		c[0] = 5;
		
		System.out.println(c[0]);
		System.out.println(a);
		
		a = 10;
		c[1] = 10;
		
		System.out.println(c[1]);
		System.out.println(a);
	
		a = 15;
		c[2] = 15;
		
		System.out.println(c[2]);
		System.out.println(a);
		
		int i = 0;

		for(i=1; i<4; i++)
		{
			c[(i-1)]=i*5;
			a=i*5;

		}
		for(i=0;i<3;i++)
		{
			System.out.println("c["+i+"] = "+c[i]);
		}

	}
	
}
