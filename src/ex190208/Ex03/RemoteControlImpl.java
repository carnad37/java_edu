package ex190208.Ex03;

public class RemoteControlImpl implements RemoteControl {

	public void turnOn()
	{
		System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
	}

	public void turnOff(){
		System.out.println("TV¸¦ ²ü´Ï´Ù.");
	}

	public void setVolume(int volume) {
		System.out.println("ÇöÀç TV º¼·ý: "+volume);
	}

}
