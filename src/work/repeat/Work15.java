package work.repeat;

import java.util.Scanner;

public class Work15 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		int i = 0, j = 0;
		int beCount = 1, afCount = 1;
		//1,3,5
		for(i=0;i<num;i++)
		{
			for(j=0;j<num;j++)
			{
				if(i==0)
				{
					System.out.print(beCount+"\t");
					beCount += 2;
				}
				else if(num-((i*2)-1)<=j)
				{
					System.out.print(afCount+"\t");
					afCount += 2;
				}
				else
				{
//					System.out.print(beCount+"("+(num-(i*2)+1)+")"+"\t");
					System.out.print(beCount+"\t");
					beCount += 2;
				}
			}
			System.out.println("");
		}
	}

}
