package ex190122;

public class Uppernum {
	
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
