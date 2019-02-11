package ex190211.Test01;

public class PayManager {
	final private static int KPAYCODE = 1;
	final private static int SPAYCODE = 2;
	private int buyResult = 0;
	private int checkResult = 0;
	PaymentInterface pif = null;
	PayManager(int bankcode)
	{
		System.out.println("PayManager의 생성자 호출");

		switch(bankcode) {
		case KPAYCODE:
			pif = new Kpay();
			System.out.println("kPay의 객체 생성");
			break;
		case SPAYCODE:
			pif = new Spay();
			System.out.println("sPay의 객체 생성");
			break;			
		}
//		if(bankcode==KPAYCODE)
//		{
//			pif = new Kpay();
//			System.out.println("kPay의 객체 생성");
//		}
//		else if(bankcode==SPAYCODE)
//		{
//			pif = new Spay();
//			System.out.println("sPay의 객체 생성");
//		}
		//payManager의 객체 생성과 동시에 생성되게함.
	}
	
	//int bankcode를 통해 객체를 선택.
	public int buy(int bankcode, int money, int num)
	{
		this.buyResult = pif.pay(money);
		return this.buyResult;
	}
	
	public int checkBalance(int bankcode, int accountNum)
	{
		this.checkResult = pif.checkBalance(accountNum);
		return this.checkResult;
	}
	
	
}
