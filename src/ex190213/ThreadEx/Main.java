package ex190213.ThreadEx;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("main thread start");
		
		ThreadClass th = new ThreadClass();
		
		th.start();
		//start()�� Thread�� �����ϴ� �޼ҵ�.
		//run()�� �о�´�.
		int count = 0;
		while(true)
		{
			if(count==5)
			{
//				th.interrupt();
				//����� �Ǵ� ��ü�� �޼ҵ忡 InterruptedExpecption�� ����Ų��.
				th.exitFlag = true;
			}
//			System.out.println(count);
			count++;
			try
			{
			Thread.sleep(1000);
			
			//sleep�� static�޼ҵ�� Thread.�� �ٿ������ν� �ҷ��� �� �ִ�.
			}
			catch(InterruptedException e)
			{
				
			}
			System.out.println("main alive()");
		}
		
	}

}
