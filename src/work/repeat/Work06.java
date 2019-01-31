package work.repeat;

import java.util.Scanner;

public class Work06 {

	public static void main(String[] args) {
		
//		//A는 int로 캐스팅시 65.
//		char a = 'B';
//		int num = (int)a;
//		System.out.println(num);
//		
		Scanner sc = new Scanner(System.in);
		//65,66,67
		//68,69
		//70
		//이런식의 출력
		System.out.print("자연수를 입력해주세요: ");
		int num = sc.nextInt();
		int i = 0, count = 0;
		int alpha = 65;
		char cAlpha;
		for(i=0;i<num;i++)
		{
			//총 3행 시행된다
			count = num-i;
			while(count>0)
			{
				cAlpha = (char)alpha;
				System.out.print(cAlpha);
				alpha++;
				count--;
			}
			System.out.println("");
		}
	}
	
}
