package work.array2;

import java.util.Scanner;

public class Work05 {

	public static void main(String[] args) {
		
		Work05 w5 = new Work05();
		
		int[][] jeagiClass = new int[4][3];
		
		w5.setJeagiScore(jeagiClass);
		System.out.println("");
		w5.printClassScore(jeagiClass);
	}
	
	
	public void setJeagiScore(int[][] jeagiClass)
	{
		String[] preData;
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<jeagiClass.length;i++)
		{
			System.out.print((i+1)+" class? : ");
			String setData = scan.nextLine();
			preData = setData.split(" ");
			for(int j=0;j<jeagiClass[i].length;j++)
			{
				jeagiClass[i][j]= Integer.parseInt(preData[j]);
			}
		}
		scan.close();
		
	}
	public void printClassScore(int[][] jeagiClass)
	{
		for(int i=0;i<jeagiClass.length;i++)
		{
			int sum=0;
			for(int j:jeagiClass[i])
			{
				sum+=j;
			}
			System.out.println((i+1)+" class : "+sum);
		}
	}
}
