package ex190121;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		//10���� ������ �Է¹޾� ¦���� Ȧ���� ����.
		//������ ����(odd, even)�� ���.
		Scanner sc = new Scanner(System.in);
		int i = 0, odd = 0, even = 0, num = 0;
		for(i=1;i<11;i++)
		{
			System.out.print(i+"��° ������ �Է����ּ���: ");
			num = sc.nextInt();
			if(num%2 == 0)
			{
				odd++;
			}
			else
			{
				even++;
			}
		}
		System.out.println("even : "+even+"\n"+"odd : "+odd);
	}
	
}
