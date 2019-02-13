package ex190213.ThreadEx;

public class ThreadClass extends Thread{
//Thread클래스를 상속받아 직접 설정.
	boolean exitFlag = false;
	//불값을 주고 객체에서 값을 대입해서 조절가능.
	int count = 0;
	public void run()
	{
		while(true)
		{
			try
			{
//				if(count==5)
//				{
//					break;
//				}
				count++;
				sleep(1000);
				if(exitFlag)
				{
					break;
				}
				//sleep는 InterruptedException을 설정해줘야지만 사용가능.
			}
			catch(InterruptedException e)
			{
//				System.out.println("new Thread interruptedException");
//				break;
			}		
			System.out.println("alive()");
		}
		
	}
	//메소드가 끝남과 동시에 쓰레드가 닫힘.
}
