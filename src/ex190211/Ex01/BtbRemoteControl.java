package ex190211.Ex01;

public class BtbRemoteControl {
	
	public static void main(String[] args) {
		
		SmartRemoteControlImpl scr = new SmartRemoteControlImpl();
		//implements�Ҷ� �������� ��ü��. �������� �Ұ���.
		scr.turnOn();
		scr.turnOff();
		scr.setVolume(5);
		scr.search("www.google.com");
		scr.viewVod("Tor");

	}

}
