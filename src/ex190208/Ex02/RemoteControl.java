package ex190208.Ex02;

public interface RemoteControl {

	//���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//���� �߻�޼ҵ���̴�. abstract�� �����Ǿ�����
	void turnOn();
	void trunOff();
	void setVolume(int volume);
	
}
