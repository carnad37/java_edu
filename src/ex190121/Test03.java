package ex190121;

import java.util.Scanner;

public class Test03 {
	
	public static void main(String[] args) {
		
		int inputNum = 0;
		String korea = "Seoul", usa = "Washington", japan = "Tokyo", china = "Beijing";
		Scanner sc = new Scanner(System.in);
		//�������
		//������ ���ڸ� �Է¹޾� ������ ������ ���
		//���� ���� ���� �Է¹����� none�� �Բ� ����.
		
		for(;;)
		{
			System.out.println("1.korea"+"\n"+"2.USA"+"\n"+"3.Japan"+"\n"+"4.China");
			System.out.print("number? ");
			inputNum = sc.nextInt();
			if(inputNum == 1)
			{
				System.out.println(korea+"\n");
			}
			else if(inputNum == 2)
			{
				System.out.println(usa+"\n");
			}
			else if(inputNum == 3)
			{
				System.out.println(japan+"\n");
			}
			else if(inputNum == 4)
			{
				System.out.println(china+"\n");
			}
			else
			{
				System.out.println("none");
				break;
			}
		}
		
	}

}
