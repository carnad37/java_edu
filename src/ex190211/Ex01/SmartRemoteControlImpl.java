package ex190211.Ex01;

public class SmartRemoteControlImpl implements RemoteControl, SmartRemoteControl{
	//다중

	public void turnOn()
	{
		System.out.println("TV를 켭니다.");
	}
	public void turnOff()
	{
		System.out.println("TV를 끕니다.");
	}
	public void setVolume(int volume)
	{
		System.out.println("현재 TV 볼륨: "+volume);
	}
	public void search(String url)
	{
		System.out.println(url+"을 검색합니다.");
	}
	public void viewVod(String name)
	{
		System.out.println(name+"을 시청합니다.");
	}
}
