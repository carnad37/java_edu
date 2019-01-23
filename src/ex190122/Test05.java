package ex190122;

public class Test05 {
	
	public static void main(String[] args) {
		
		//1000만 원을 연이율 7%로 저금하였을 경우에 몇 년 만에 2배가 되는지를 계산하여보자. 
		//단, 이자는 연말에 계산되며 복리식으로 계산한다. 즉, 이자가 매년 원금에 합쳐진다.

		//기본값은 1000만원.
		//연마다 7%. 즉 107%.
		
		int preMoney = 1000;
		int year = 0;
		double postMoney = 0;
		while ((postMoney) < (preMoney*2))
		{
			
			postMoney = (double)preMoney*107;
			postMoney = postMoney/100;
			preMoney = (int)postMoney;
			//System.out.println(postMoney);
			year++;
		}
		System.out.println("year : "+year);
		
	}

}
