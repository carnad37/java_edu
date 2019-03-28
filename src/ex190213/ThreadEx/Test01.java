package ex190213.ThreadEx;

class RunnableImpl implements Runnable {
	
	private int sleepCount = 0;
	
	public void run() {
		while (true) {
			try {
				Thread.sleep(2000);
				sleepCount++;
				for (int i = 0; i < sleepCount; i++) {
					System.out.print("#");
				}
				System.out.println();
			}
			catch (InterruptedException e) {
				System.out.println(e);
				break;
			}
		}
	}
}

class ThreadExtend extends Thread {
	
	private int sleepCount = 0;
	
		public void run() {
			while (true) {
				try {
					Thread.sleep(1000);
					sleepCount++;
					for (int i = 0; i < sleepCount; i++) {
						System.out.print("*");
					}
					System.out.println();
				}
				catch (InterruptedException e) {
					System.out.println(e);
					break;
			}
		}
	}
}

public class Test01 {

	public static void main(String[] args) {
		ThreadExtend th1 = new ThreadExtend();
		Thread th2 = new Thread(new RunnableImpl());
		th1.start();
		th2.start();
		try {
			Thread.sleep(100000);
			th1.interrupt();
			th2.interrupt();
		}
		catch (InterruptedException e) {
			
		}
	}
	
}
