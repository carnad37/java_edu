package ex190208.Ex05;

public class SettopRemoteControlImpl implements SettopRemoteControl {
	
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
		System.out.println("���� TV ����:"+volume);
	}
	public void viewVod(String name)
	{
		System.out.println(name+"�� ��û�մϴ�.");
	}

}
