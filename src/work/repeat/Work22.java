package work.repeat;

import java.util.Scanner;

public class Work22 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		int num = sc.nextInt();
		int x = 1, sum = 0, ret, controlNum, count=1,i;
		//���ڰ� �ִ� ���ڸ����� Ȯ���Ѵ�.
		while(true)
		{
			ret = num/x;
			if(ret<10)
			{
				break;
			}
			x=x*10;
			count++;
		}
		//���ڸ� ������ ���ϱ�.
		for(i=0;i<count;i++)
		{
			ret = num/x;
			sum+=ret;
			controlNum=x*ret;
			num-=controlNum;
			x=x/10;
			
		}
		System.out.println(sum);
	}
	

}
