package work.array2;

public class Work01 {

	public static void main(String[] args) {
		
		int[][] numberBox = new int[5][5];
		int inputNumber = 1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				numberBox[j][i]=inputNumber;
				inputNumber++;
			}
		}
		//print
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(numberBox[j][i]+"\t");
			}
			System.out.println("");
		}		
		System.out.println("");

		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(numberBox[i][j]+"\t");
			}
			System.out.println("");
		}		
	}	
}
