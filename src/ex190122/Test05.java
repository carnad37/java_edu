package ex190122;

public class Test05 {
	
	public static void main(String[] args) {
		
		//1000�� ���� ������ 7%�� �����Ͽ��� ��쿡 �� �� ���� 2�谡 �Ǵ����� ����Ͽ�����. 
		//��, ���ڴ� ������ ���Ǹ� ���������� ����Ѵ�. ��, ���ڰ� �ų� ���ݿ� ��������.

		//�⺻���� 1000����.
		//������ 7%. �� 107%.
		
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
