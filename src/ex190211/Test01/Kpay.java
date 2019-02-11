package ex190211.Test01;

public class Kpay implements PaymentInterface {

	@Override
	public int pay(int money) {
		System.out.println("Kpay의 pay()호출.");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int checkBalance(int accountNum) {
		System.out.println("Kpay의 checkBalance()호출.");
		// TODO Auto-generated method stub
		return 0;
	}

}
