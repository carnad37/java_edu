package ex190123;

public class Test06 {
	public static void main(String[] args) {
		//�ΰ��� �� ���̿��� ����� ���ض�(for��)
		int start = 3, end = 13, count =0, sum = 0, avg = 0;
		end++;
		for(;start<end;start++)
		{
			sum+=start;
			count++;
			//�Ǵ� ī��Ʈ�� end-start�� �ȴ�.
		}
		avg = sum/count;
		System.out.println("Avg : "+avg);
	}
}
