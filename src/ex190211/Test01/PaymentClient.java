package ex190211.Test01;

import java.util.Scanner;

public class PaymentClient {

	//paymentInterface
	//Spay, Kpay
	//paymentInterface에 대한 두개의 구현클래스.
	//PayManager
	
	public static void main(String[] args) {
		
		//넣어줘야하는 값은 bankcode, accountNum, money, num
		int bankcode = 2;
		int money = 1000;
		int num = 10;		
		int accountNum = 12345;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("어떤 카드를 사용하시겠습니까?");
		System.out.println("1.Kpay");
		System.out.println("2.Spay");
		System.out.print(">");
		bankcode = sc.nextInt();
				
		PayManager pm = new PayManager(bankcode);
		//PayManager에서 Kpay와 Spay의 객체를 생성해주기 때문에,
		//PayManager하나 호출해도 충분.
		//생성자를 통해 사용할 카드 하나의 객체만 생성한다.
		
		pm.buy(bankcode, money, num);
		pm.checkBalance(bankcode, accountNum);
		
		
	}
	
}
