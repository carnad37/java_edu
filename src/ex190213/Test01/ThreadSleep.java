package ex190213.Test01;

public class ThreadSleep extends Thread{
	int count = 0, i = 0;
	String star = "*";
	public void run()
	{
		while(true)
		{
			try
			{
				sleep(2000);
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
