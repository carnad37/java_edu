package ex190211.Ex01;

public class SmartRemoteControlImpl implements RemoteControl, SmartRemoteControl{
	//����

	public void turnOn()
	{
		System.out.println("TV�� �մϴ�.");
	}
	public void turnOff()
	{
		System.out.println("TV�� ���ϴ�.");
	}
	public void setVolume(int volume)
	{
		System.out.println("���� TV ����: "+volume);
	}
	public void search(String url)
	{
		System.out.println(url+"�� �˻��մϴ�.");
	}
	public void viewVod(String name)
	{
		System.out.println(name+"�� ��û�մϴ�.");
	}
}
