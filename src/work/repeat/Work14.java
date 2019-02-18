package work.repeat;

import java.util.Scanner;

public class Work14 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		int i=0,j=0;
		String shap = "#",space = " ",sum = "";
		for(i=0;i<(num*2)-1;i++)
		{
			if(i>=num)
			{
				for(j=0;j<num;j++)
				{
					if(j>(i-num))
					{
						System.out.print(shap);
					}
					else
					{
						System.out.print(space);
					}
				}
				System.out.println("");
			}
			else
			{
				sum+=shap;
				System.out.println(sum);
			}
		}
		
	}

}