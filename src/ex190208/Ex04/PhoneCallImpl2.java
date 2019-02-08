package ex190208.Ex04;

public class PhoneCallImpl2 implements PhoneInterface {

	@Override
	public int call(String num) {
		System.out.println("PhoneCallImpl2::call()");
		return 0;
	}

	@Override
	public int disConnectCall() {
		System.out.println("PhoneCallImpl2::disConnectCall()");
		return 0;
	}

}
