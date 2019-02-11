package ex190208.Ex05;

public class RemotecontrolClinent {

	public static void main(String[] args) {

		SettopRemoteControl brc = new SettopRemoteControlImpl();
		brc.turnOn();
		brc.turnOff();
		brc.setVolume(5);
		brc.viewVod("Tor");
		
	}

}