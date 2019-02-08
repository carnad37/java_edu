package ex190208.Ex02;

public interface RemoteControl {

	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//전부 추상메소드들이다. abstract가 생략되어있음
	void turnOn();
	void trunOff();
	void setVolume(int volume);
	
}
