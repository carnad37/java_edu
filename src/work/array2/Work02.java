package work.array2;

public class Work02 {

	public static void main(String[] args) {
		
		int[][] numberBox = new int[5][5];
		
		int num = 1;
		
		for(int i=0;i<numberBox.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				numberBox[i][j]=num;
				num++;
			}
		}
		
		for(int i=0;i<numberBox.length;i++)
		{
			for(int j=0;j<numberBox[i].length;j++)
			{
				System.out.print(numberBox[i][j]+"\t");
			}
			System.out.println("");
		}		
		System.out.println("");
		
		for(int i=0;i<numberBox.length;i++)
		{
			for(int j=numberBox[i].length-1;j>=0;j--)
			{
				System.out.print(numberBox[i][j]+"\t");
			}
			System.out.println("");
		}		
		System.out.println("");
		
	}
	
}
