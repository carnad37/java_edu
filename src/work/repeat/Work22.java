package work.repeat;

import java.util.Scanner;

public class Work22 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		int x = 1, sum = 0, ret, controlNum, count=1,i;
		//숫자가 최대 몇자리인지 확인한다.
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
		//각자리 역으로 합하기.
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
