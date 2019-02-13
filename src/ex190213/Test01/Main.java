package ex190213.Test01;

public class Main {
	
	public static void main(String[] args) {
		
//		ThreadSleep ts = new ThreadSleep();
		
		RunnableSleep rs = new RunnableSleep();
		Thread ts = new Thread(rs);
		
		ts.start();
		
	}

}
