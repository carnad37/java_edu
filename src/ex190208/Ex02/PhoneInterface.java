package ex190208.Ex02;

public interface PhoneInterface {

	//둘다 추상 메소드. 
	//상수랑 구분이 안갈수 있기에 상수는 전부 대문자로.
	int call(String num);
	int disConnectCall();
	
}