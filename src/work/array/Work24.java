package work.array;

import java.util.Scanner;

public class Work24 {
	
	public static void main(String[] args) {
		
		//양의 정수만 입력으로 받고 그 수의 자릿수를 출력해보자. 

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int num = scan.nextInt();
		int x=1,count=0;
		
		while(true)
		{
			int result = num/x;
			if(result<1)
			{
				break;
			}
			x*=10;
			count++;
		}
		
		System.out.println(count+"자리수");
	}

}
