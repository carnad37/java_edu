package ex190123;

public class Ex04 {

	public static void main(String[] args) {
		
		//Label���¹�
		//�����̻��� �ݺ������� �ѹ��� ����������, ���.
		//���������� ���� �ݺ����տ� (�󺧸�): for(or while) �� �Է�
		//break (�󺧸�);���� ������ ��������.
		exit:	for(int i=2;i<10;i++)
		{
			for(int j=1;j<10;j++)
			{
				//��� ���� �ٲٰ������ i�� j�� ��ġ �ٲٱ�
				System.out.print(i+" * "+j+" = " +(i*j));
				System.out.print('\t');
				if(i==4&&j==4)
				{
					break exit;
				}
			}
			System.out.println();
		}
		
		
	}
	
}
