package work.repeat;
import java.util.Scanner;

public class Work03 {
	
	public static void main(String[] args) {
		
		//i�� �Է¹޾� 3,2,1,1,2,3������ ���
		//���ڿ��� �߰��µ��� ������ ����.
		//ù��°�� �����ϴ� �ݺ���. 3,2,1������ Ƚ�����
		//�ι�°�� ���� �״�� ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ���: ");
		int num = sc.nextInt();
		int i = 0, j = 0;
		String star = "*";
		//���� �����ϴ� ��
		for(j=num;j>0;j--)
		{
			for(i=0;i<j;i++)
			{
				System.out.print(star);
			}
			System.out.println("");
		}
		for(j=0;j<num;j++)
		{
			for(i=0;i<j+1;i++)
			{
				System.out.print(star);
			}
			System.out.println("");
		}
	
	}

}
