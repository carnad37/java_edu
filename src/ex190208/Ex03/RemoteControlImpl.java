package ex190208.Ex03;

public class RemoteControlImpl implements RemoteControl {

	public void turnOn()
	{
		System.out.println("TV�� �մϴ�.");
	}

	public void turnOff(){
		System.out.println("TV�� ���ϴ�.");
	}

	public void setVolume(int volume) {
		System.out.println("���� TV ����: "+volume);
	}

}
