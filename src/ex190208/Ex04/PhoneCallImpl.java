package ex190208.Ex04;

public class PhoneCallImpl implements PhoneInterface {

	@Override
	public int call(String num) {
		System.out.println("PhoneCallImpl::call()");
		return 0;
	}

	@Override
	public int disConnectCall() {
		System.out.println("PhoneCallImpl::disConnectCall()");
		return 0;
	}

}
