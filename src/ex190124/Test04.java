package ex190124;

public class Test04 {
	
	public static void main(String[] args) {
		
		int[]a = new int[3];
		
		int i = 0, val = 0;
		for(i=0;i<3;i++)
		{
			val = i+1;
			a[i] = val;
		}
		for(i=0;i<3;i++)
			
		{
			System.out.println("a["+i+"] = "+a[i]);
		}
		
	}

}
