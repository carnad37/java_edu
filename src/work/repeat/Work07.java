package work.repeat;

import java.util.Scanner;

public class Work07 {

	public static void main(String[] args) {
		
		int al = 65;
		int nu = 1;
		char alpha;
		//반복문은 space의 반복문과 *반복문 2개가 필요
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		for(int i=1;i<num+1;i++)
		{
			//이걸로 총 3번 반복됨.
			//인수는 i=0이 주어짐
			//내부에서 인수 k를 만들 필요가 있음.
						//먼저 스페이스문. 스페이스는 0->1->2순으로 생성됨.
//			for(int j=0; j<(num-i); j++)	//첫시행은 건너뛰어짐
//			{
//				System.out.print(nu+"\t");
//				nu++;
//			}
//			for(int k=0;k<=i;k++)
//			{
//				alpha = (char)al;
//				System.out.print(alpha+"\t");
//				al++;
//			}
			for(int j=num+1; j>0; j--)
			{
				if(j<=i)
				{
					alpha = (char)al;
					System.out.print(alpha+"\t");
					al++;
				}
				else
				{
					System.out.print(nu+"\t");
					nu++;
				}
			}
			System.out.println("");
		}
	}
		
}
	
