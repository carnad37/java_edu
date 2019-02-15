package ex190213.SynchronizedEx01;

public class Calculator {
	
	private int memory;
	
	public int getMemory()
	{
		return memory;
	}
//	public synchronized void setMemory(int memory)
	public void setMemory(int memory)
	{
		System.out.println("start setMomory()");
		this.memory = memory;
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println(Thread.currentThread().getName()+": "+this.memory);
		}
	}
}
