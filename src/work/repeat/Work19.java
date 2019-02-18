package work.repeat;

public class Work19 {
	
	public static void main(String[] args) {
		
		int x,y,ret;
		//2x+4y=10
		for(x=0;x<11;x++)
		{
			for(y=0;y<11;y++)
			{
				ret = x+(2*y);
				if(ret==5)
				{
					System.out.println("x가 "+x+"이고, y가 "+y+"일때.");
				}
			}
		}
		
	}

}
