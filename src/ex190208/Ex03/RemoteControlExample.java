package ex190208.Ex03;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		
		RemoteControl rc;
		rc = new RemoteControlImpl();
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(1);
		
		
	}

}
