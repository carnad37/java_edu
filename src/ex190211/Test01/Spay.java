package ex190211.Test01;

public class Spay implements PaymentInterface {

	@Override
	public int pay(int money) {
		System.out.println("Spay의 pay()호출.");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int checkBalance(int accountNum) {
		System.out.println("Spay의 checkBalance()호출.");
		// TODO Auto-generated method stub
		return 0;
	}

}
