package work.repeat;
import java.util.Scanner;

public class Work01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//��� ���� �Է¹޾� ���ڹڽ� �����
		//1234/2468/36912������ ��*�ప�̴�
		int num01;
		int num02;
		System.out.print("���� �Է��Ͻÿ�: ");
		num02 = sc.nextInt();
		System.out.print("���� �Է��Ͻÿ�: ");
		num01 = sc.nextInt();
		int mul = 0;
		
		for(int i=1;i<num02+1;i++)
		{
			for(int j=1;j<num01+1;j++)
			{
				mul = j*i;
				System.out.print(mul+"\t");
			}
			System.out.println("");
		}
		
	}
	
}
