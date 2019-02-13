package ex190213.SynchronizedEx01;

public class User1 extends Thread{
	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator)
	{
		this.setName("User1");
		this.calculator = calculator;
		
	}
	
	public void run()
	{
		System.out.println("start run()");
		calculator.setMemory(100);
	}

}
