package ex190213.ThreadEx;

public class ThreadClass extends Thread{
//ThreadŬ������ ��ӹ޾� ���� ����.
	boolean exitFlag = false;
	//�Ұ��� �ְ� ��ü���� ���� �����ؼ� ��������.
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
				//sleep�� InterruptedException�� ������������� ��밡��.
			}
			catch(InterruptedException e)
			{
//				System.out.println("new Thread interruptedException");
//				break;
			}		
			System.out.println("alive()");
		}
		
	}
	//�޼ҵ尡 ������ ���ÿ� �����尡 ����.
}
