package ex190213.Test01;

public class RunnableSleep implements Runnable {
	
	int i = 0, count = 0;
	String star = "*";
	@Override
	public void run()
	{

		while(true)
		{
			try
			{
				Thread.sleep(2000);
				count++;
//				System.out.println(count);
				for(i=0;i<count;i++)
				{
					System.out.print(star);
				}
				System.out.println("");
			}
			catch(InterruptedException e)
			{
				
			}

		}
		
	}

}
