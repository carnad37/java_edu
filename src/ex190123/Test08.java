package ex190123;
import java.util.Scanner;
public class Test08 {

	public static void main(String[] args)
	{
		
		//�����Է�.
		//Ȧ���� ����.
		//¦���� �ٽ� �ݺ�
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do
		{
			System.out.print("���ڸ� �Է��ϼ���: ");
			num = sc.nextInt();
		}
		while(num%2==0);
		System.out.println("����");
	}
	
}
