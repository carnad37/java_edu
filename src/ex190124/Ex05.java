package ex190124;

public class Ex05 {

	public static void main(String[] args) {
		//scores�迭�� ������ �Է�
		int[] scores = {83, 90, 87};
		//������ ������ ���
		System.out.println("scores[0] : "+scores[0]);
		System.out.println("scores[1] : "+scores[1]);
		System.out.println("scores[2] : "+scores[2]);
		//�ݺ����� ���� ������ ������ ���� ���
		int sum = 0, i = 0;
		for(i=0;i<3;i++)
		{
			sum+=scores[i];
		}
		//���հ� ����� ���
		System.out.println("����: "+sum);
		double avg =(double)sum/3;
		System.out.println("���: "+avg);
	}
	
}
