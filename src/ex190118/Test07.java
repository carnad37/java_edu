package ex190118;

import java.util.Scanner;

public class Test07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		double avg = 0;
		int count = 0;
		int i = 0;
		String numType = null;
		//소수점 2째자리까지 출력후에, *100을하고 5이상인지 확인후 같은 수를 빼주고 10을 더해준다.
		//그뒤 10을 나눠주면 반올림가능.
		for(i = 1; i == 1;)
		{
			System.out.print("정수를 입력해주세요: ");
			num = sc.nextInt();
			sum = sum + num;
			count = count + 1;
			if(num>=100)
			{
				System.out.println("Sum : "+sum);
				avg = (double)sum/count;
				System.out.println("Avg : "+avg);
				i = 0;
				//return;
			}
		}
		
	}

}
