package ex190208.Ex05;

public class SettopRemoteControlImpl implements SettopRemoteControl {
	
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
		System.out.println("현재 TV 볼륨:"+volume);
	}
	public void viewVod(String name)
	{
		System.out.println(name+"을 시청합니다.");
	}

}
