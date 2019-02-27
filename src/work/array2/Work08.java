package work.array2;

public class Work08 {

	public static void main(String[] args) {
		
		int[][] numBox = new int[5][5];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j!=0&&i!=0)
				{
					numBox[i][j]=numBox[i-1][j]+numBox[i][j-1];
				}
				else
				{
					numBox[i][j]=1;
				}
			}
		}
		for(int i=0;i<numBox.length;i++)
		{
			for(int j=0;j<numBox[i].length;j++)
			{
				System.out.print(numBox[i][j]+"\t");
			}
			System.out.println("");
		}		
		System.out.println("");
	}
	
}
