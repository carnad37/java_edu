package ex190125;

public class Ex01 {

	public static void main(String[] args)
	{
		
		//�迭�� �⺻ ����Ÿ�Դ� ��밡��.
		//�迭����
		//�迭����.length;->int����
		int[]score = {83,90,87};

		int sum = 0;
		
		//�Ϲ� for��
//		for(int i = 0; i<score.length;i++)
//		{
//			sum += score[i];
//		}
		
		//for-each������ ��ȯ	
		for(int k : score)	//�迭�� ��Ұ��� ���Թ��� ������ �ݵ�� ()������ ����.
		{
			sum += k;
		}
		
		System.out.println("���� : "+sum);
		double avg = (double)sum/score.length;
		System.out.println("��� : "+avg);
		
	}
	
}
