package ex190122;

public class Test04 {

	public static void main(String[] args) {
		
		//ȭ�� �µ� 0������ 100������
		//10�� �������� �����µ� ȯ�� ���.
		
		//ȭ���µ��� i�� 100���� ����
		//i++�� �ƴ϶� i+10
		int ftem = 10;
		double ctem = 0;
		
		//c=(f-32)/1.8
		for(ftem = 10; ftem < 101; ftem+=10)
		{
			//ȭ�� ���
			System.out.println("F : "+ftem);
			//ȭ�� ������ ��ȯ
			ctem = (double)(ftem-30)/1.8; 
			//ctem = upNum(ctem);
			//���� ���
			System.out.println("C : "+ctem);
		}
		
	}
	
	//�Ҽ������
	public static double upNum(double a)
	{
		double preA = 0;
		int cut = (int)(a*10);
		int ab = 0;
		//3.14�Ͻÿ�
		preA = a*100;
		//a=314
		cut = cut*10;
		//cut = 310
		int result = (int)(preA-cut);
		//result�ǰ��� �ݿø���
		//���밪�����
		if(result < 0)
		{
			result = result*(-1);
			ab = 1;
		}
		if(result >= 5)
		{
			result = 10;
		}
		else
		{
			result = 0;
		}
		//320�Ǵ� 310���.
		if(ab == 1)
		{
			result = result*(-1);
		}
		result = cut + result;
		preA = (double)result/100;
				
		return preA;
	}
	
	
}
