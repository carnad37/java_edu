package work.array2;

import java.util.Scanner;

public class Work22 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�ڿ����� �Է����ּ��� : ");
		int num = scan.nextInt();
		scan.close();
		Work22 w22 = new Work22();
		int result = w22.setCanNumber(num);
		System.out.println(result);

	}
	public int setCanNumber(int num)
	{
		int value = num/2;
		int result = 0;
		for(int i=0;i<=value;i++)	//i : �ݺ� Ƚ��
		{
			int volume = num-i; 	//j : ����� ���� �ѷ�
			result += factorial(volume)/factorial(i)/factorial(volume-i);			
		}
		
		return result;
	}
	public int factorial(int num)
	{
		int value = 1;
		for(int i=1;i<=num;i++)
		{
			value*=i;
		}
		return value;
	}
}
