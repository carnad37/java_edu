package work.array2;

public class Work03 {
	
	public static void main(String[] args) {
		
		int[][] numberBox = new int[5][5];
		
		int num = 1;
		boolean cycle = true;
		
		for(int i=0;i<numberBox.length;i++)
		{
			if(cycle)
			{
				for(int j=0;j<numberBox.length;j++)
				{
					numberBox[i][j]=num;
					num++;
				}
				cycle=false;
			}
			else
			{
				for(int j=numberBox.length-1;j>=0;j--)
				{
					numberBox[i][j]=num;
					num++;
				}
				cycle=true;
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
