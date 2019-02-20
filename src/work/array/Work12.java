package work.array;

import java.util.Scanner;

public class Work12 {
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Work12 w12 = new Work12();
		
		System.out.print("주사위를 몇번 굴리시겠습니까?");
		int tryNumber = scan.nextInt();
		int[] diceArray = w12.randomDice(tryNumber);
		w12.printDiceNumber(diceArray);
		
		
	}
	
	public int[] randomDice(int tryNumber)
	{
		int[] diceArray = new int[6];
		int result=0,count=0;
		while(true)
		{
			result = (int)(Math.random()*10);
			if((result>0)&&(result<7))
			{
				diceArray[result-1]++;
				count++;
			}
			if(count==tryNumber)
			{
				break;
			}
		}
		
		return diceArray;
	}
	
	public void printDiceNumber(int[] diceArray)
	{
		for(int i=0;i<6;i++)
		{
			
			System.out.println((i+1)+" : "+diceArray[i]);
			
		}
	}
	

}


