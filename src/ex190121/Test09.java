package ex190121;

import java.util.Scanner;

public class Test09 {
	
	public static void main(String[] args) {
		
		//�μ��� �Է¹޾� �� ������ 3�� 5�� ����� �հ� ����� ����϶�.
		Scanner sc = new Scanner(System.in);
		
		int i = 0, num01 = 0, num02 = 0, min =0, max =0 , sum = 0, count = 0, avg= 0;
		
		System.out.print("ù��° ���ڸ� �Է����ּ���: ");
		num01 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է����ּ���: ");
		num02 = sc.nextInt();
		if(num01 > num02)
		{
			min = num02;
			max = num01;
		}
		else
		{
			min = num01;
			max = num02;
		}
		for(i = min;i<=max;i++)
		{
			if((i%3==0)||(i%5==0))
			{
				sum += i;
				count++;
			}
		}
		avg = sum/count;
		System.out.println("sum :"+sum);
		System.out.println("avg :"+avg);
	}

}
