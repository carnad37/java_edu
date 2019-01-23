package ex190121;

import java.util.Scanner;

public class Test06 {
	
	public static void main(String[] args) {
		
		//10이하의 값을 입력받아서, 그 수만큼을 과목으로 하여 각각의 점수를 입력받는다.
		//평균을 구해 80이상이면 pass, 미만이면 fail을 출력하도록한다.
		
		Scanner sc = new Scanner(System.in);
		int i = 0, subNum = 0, score = 0, sum = 0, avg = 0;
		System.out.print("총 몇과목인지 입력해주세요: ");
		subNum = sc.nextInt();
		
		for(i = 1; i <= subNum; i++)
		{
			System.out.print(i+"번째 과목의 점수를 입력해주세요: ");
			score = sc.nextInt();
			sum = sum + score;
		}
		avg = sum/subNum;
		System.out.println("avg : "+avg);
		if(avg>=80)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
