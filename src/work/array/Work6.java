package work.array;

import java.util.Scanner;

public class Work6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[100];
		for(int i=0;i<100;i++)
		{
			System.out.print("숫자를 입력해주세요: ");
			int inputNum = sc.nextInt();
			if(inputNum==-1)
			{
				//i-1,i-2,i-3
				for(int j=3;j>=0;j--)
				{
					System.out.print(num[i-j]+" ");
				}
				break;
			}
			num[i]=inputNum;
		}
		
		
	}

}
