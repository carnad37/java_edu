package ex190122;

public class Uppernum {
	
	//�Ҽ������
		public double upNum(double a)
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
		
		public double upControl(double value,int targetNumber)
		{
			//1.���ϰ� ���� �ڸ�����ŭ 100�� 10�� �����Ѵ�. 1�̸� 100, 2�� 1000.
			//2.������ ������ ���� 10���� ����. �� ���� a�� ���Ѵ�.int x�� ����.
			//3.a�� ���� ���� ���Ѵ�.int y�� ����.
			//4.y-x*10�� ���� ����̵Ǵ� �Ҽ������� ���Ѵ�
			int cal = 100;
			for(int i=1;i<targetNumber;i++)
			{
				cal = cal*10;
			}
			int x = (int)(value*(cal/10));
			int y = (int)(value*cal);
			int result = y-(x*10);
			if(result >= 5)
			{
				result = 10;
			}
			else
			{
				result = 0;
			}
			double ret = (double)((x*10)+result)/cal;
					
			return ret;
		}

}
