package work.array;

import java.util.Scanner;

public class Work12 {
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주사위를 몇번 굴리시겠습니까?");
		
		
		
	}
	
	public int[] randomDice(int tryNumber)
	{
		int[] diceArray = new int[tryNumber];
		int result=0,count=0;
		while(true)
		{
			result = (int)(Math.random()*10);
			if((result>0)&&(result<7))
			{
				switch(result)
				{
					case 1:
						
				}
				
				diceArray[count]=result;
				count++;
			}
			if(count==tryNumber)
			{
				break;
			}
		}
		
		return diceArray;
	}
	

}


