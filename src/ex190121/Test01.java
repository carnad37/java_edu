package ex190121;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		int inputNum = 0, solNum = 0, dubNum = 0;
		
		Scanner sc = new Scanner(System.in);
		//�Է��� �ݺ��ؾ��Ѵ�.
		for(;;)
		{
			System.out.print("������ �Է����ּ���: ");
			inputNum = sc.nextInt();
			if(inputNum == 0)
			{
				
				System.out.println("odd : "+solNum);
				System.out.println("even : "+dubNum);
				
				//i = 1;
				break;
				
			}
			if(inputNum%2 == 0)
			{
				
				dubNum++;
				
			}
			else	//if else(inputNum%2=1)
			{
				solNum++;
			}
		}
	}
}
