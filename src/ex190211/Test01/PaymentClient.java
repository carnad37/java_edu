package ex190211.Test01;

import java.util.Scanner;

public class PaymentClient {

	//paymentInterface
	//Spay, Kpay
	//paymentInterface�� ���� �ΰ��� ����Ŭ����.
	//PayManager
	
	public static void main(String[] args) {
		
		//�־�����ϴ� ���� bankcode, accountNum, money, num
		int bankcode = 2;
		int money = 1000;
		int num = 10;		
		int accountNum = 12345;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("� ī�带 ����Ͻðڽ��ϱ�?");
		System.out.println("1.Kpay");
		System.out.println("2.Spay");
		System.out.print(">");
		bankcode = sc.nextInt();
				
		PayManager pm = new PayManager(bankcode);
		//PayManager���� Kpay�� Spay�� ��ü�� �������ֱ� ������,
		//PayManager�ϳ� ȣ���ص� ���.
		//�����ڸ� ���� ����� ī�� �ϳ��� ��ü�� �����Ѵ�.
		
		pm.buy(bankcode, money, num);
		pm.checkBalance(bankcode, accountNum);
		
		
	}
	
}
