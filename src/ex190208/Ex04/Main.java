package ex190208.Ex04;

public class Main {		
	public static void main(String[] args) {
		
		String num = "010";
		PhoneInterface pi1 = new PhoneCallImpl2();
		PhoneInterface pi2 = new PhoneCallImpl();
		
		pi1.call(num);
		pi1.disConnectCall();
		pi2.call(num);
		pi2.disConnectCall();
		
	}
}
