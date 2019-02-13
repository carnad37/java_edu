package ex190213.RunnableImplEx;

public class RunnableImpl implements Runnable {
	int count = 0;
	boolean exitFlag = false;
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		while(true)
		{
			try
			{
				if(count==5)
				{
					break;
				}
				count++;
				Thread.sleep(1000);
				if(exitFlag)
				{
					break;
				}
				//sleep는 InterruptedException을 설정해줘야지만 사용가능.
			}
			catch(InterruptedException e)
			{
				System.out.println("new Thread interruptedException");
				break;
			}		
			System.out.println("alive()");
		}
	}
}
