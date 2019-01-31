package work.repeat;

import java.util.Scanner;

public class Work04 {
	
	public static void main(String[] args) {
		//값이 2개 필요.
		//space의 출력과 *의 출력이 필요
		String star = "*";
		String space = " ";
		//반복문은 space의 반복문과 *반복문 2개가 필요
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		for(int i = 0;i<num;i++)
		{
			//이걸로 총 3번 반복됨.
			//인수는 i=0이 주어짐
			//내부에서 인수 k를 만들 필요가 있음.
						//먼저 스페이스문. 스페이스는 0->1->2순으로 생성됨.
			for(int j = 0; j<i; j++)	//첫시행은 건너뛰어짐
			{
				System.out.print(space);
			}
			for(int k = num-i;k>0;k--)
			{
				System.out.print(star);
			}
			System.out.println("");
		}
	}

}
