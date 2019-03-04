package work.array2;

import java.util.Scanner;
import work.array2.ArrayMethod;

public class Work15 {
	
	//동전 거슬러주기.
	public static void main(String[] args) {
		
		Work15 w15 = new Work15();
		int[] cCoin = {1,2,5};
		Scanner scan = new Scanner(System.in);
		System.out.print("가지고있는 소지금을 입력해주세요 : ");
		int hMoney=scan.nextInt();
		scan.close();
		for(int i=1;i<4;i++)
		{
			w15.setMoneyCalculate(hMoney, i, cCoin);
		}

	
	}
	
	public void setMoneyCalculate(int hMoney, int coinTarget, int[] cCoin)
	{
		int[] pocket = new int[3];
		ArrayMethod am = new ArrayMethod();
		
		int arrayLength = cCoin.length-coinTarget;
		for(int i=arrayLength;i>=0;i--)
		{
			int value = hMoney/cCoin[i];
			hMoney = hMoney%cCoin[i];
			pocket[i] = value;
		}
		String result="1coin";
		if(coinTarget<3)
		{
			result += "\t2coin";
		}
		if(coinTarget<2)
		{
			result += "\t3coin";
		}
		System.out.println(result);
		am.printArray(pocket);
		
	}


}
