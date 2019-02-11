package ex190211.Ex01;

public class BtbRemoteControl {
	
	public static void main(String[] args) {
		
		SmartRemoteControlImpl scr = new SmartRemoteControlImpl();
		//implements할때 다중으로 대체함. 업스케일 불가능.
		scr.turnOn();
		scr.turnOff();
		scr.setVolume(5);
		scr.search("www.google.com");
		scr.viewVod("Tor");

	}

}
