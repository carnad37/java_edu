package ex190213.ThreadEx;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("main thread start");
		
		ThreadClass th = new ThreadClass();
		
		th.start();
		//start()는 Thread를 시작하는 메소드.
		//run()을 읽어온다.
		int count = 0;
		while(true)
		{
			if(count==5)
			{
//				th.interrupt();
				//대상이 되는 객체의 메소드에 InterruptedExpecption을 일으킨다.
				th.exitFlag = true;
			}
//			System.out.println(count);
			count++;
			try
			{
			Thread.sleep(1000);
			
			//sleep는 static메소드라 Thread.를 붙여줌으로써 불러올 수 있다.
			}
			catch(InterruptedException e)
			{
				
			}
			System.out.println("main alive()");
		}
		
	}

}
