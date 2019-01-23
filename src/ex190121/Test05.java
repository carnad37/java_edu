package ex190121;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int base = 0, height = 0, area = 0;
		String select = null;
		
		for(;;)
		{
			System.out.print("Base = ");
			base = sc.nextInt();
			System.out.print("Height = ");
			height = sc.nextInt();
			area = base*height/2;
			System.out.println("Triangle width = "+area);
			System.out.print("Continue? ");
			select = sc.next();
			if(!(select.equals("Y")||select.equals("y")))
			{
				break;
			}
		}
	}
}
