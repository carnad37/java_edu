package ex190121;

import java.util.Scanner;

public class Test03 {
	
	public static void main(String[] args) {
		
		int inputNum = 0;
		String korea = "Seoul", usa = "Washington", japan = "Tokyo", china = "Beijing";
		Scanner sc = new Scanner(System.in);
		//목차등록
		//목차의 숫자를 입력받아 각각의 대응값 출력
		//목차 외의 수를 입력받을시 none과 함께 종료.
		
		for(;;)
		{
			System.out.println("1.korea"+"\n"+"2.USA"+"\n"+"3.Japan"+"\n"+"4.China");
			System.out.print("number? ");
			inputNum = sc.nextInt();
			if(inputNum == 1)
			{
				System.out.println(korea+"\n");
			}
			else if(inputNum == 2)
			{
				System.out.println(usa+"\n");
			}
			else if(inputNum == 3)
			{
				System.out.println(japan+"\n");
			}
			else if(inputNum == 4)
			{
				System.out.println(china+"\n");
			}
			else
			{
				System.out.println("none");
				break;
			}
		}
		
	}

}
