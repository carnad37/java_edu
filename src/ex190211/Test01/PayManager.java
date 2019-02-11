package ex190211.Test01;

public class PayManager {
	final private static int KPAYCODE = 1;
	final private static int SPAYCODE = 2;
	private int buyResult = 0;
	private int checkResult = 0;
	PaymentInterface pif = null;
	PayManager(int bankcode)
	{
		System.out.println("PayManager�� ������ ȣ��");

		switch(bankcode) {
		case KPAYCODE:
			pif = new Kpay();
			System.out.println("kPay�� ��ü ����");
			break;
		case SPAYCODE:
			pif = new Spay();
			System.out.println("sPay�� ��ü ����");
			break;			
		}
//		if(bankcode==KPAYCODE)
//		{
//			pif = new Kpay();
//			System.out.println("kPay�� ��ü ����");
//		}
//		else if(bankcode==SPAYCODE)
//		{
//			pif = new Spay();
//			System.out.println("sPay�� ��ü ����");
//		}
		//payManager�� ��ü ������ ���ÿ� �����ǰ���.
	}
	
	//int bankcode�� ���� ��ü�� ����.
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
