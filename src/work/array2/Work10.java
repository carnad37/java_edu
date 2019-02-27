package work.array2;

public class Work10 {

	public static void main(String[] args) {
		
		int[][] numBox = new int[5][5];
		int[] num = {1,0,1,0,1};
		numBox[0]=num;
		Work10 w10 = new Work10();
		
		boolean div = true;
		int check;
		for(int i=1;i<5;i++)
		{
			if(div)
			{
				check = 1;
			}
			else
			{
				check = 0;
				
			}
			div=!div;
			while(check<5)
			{
				numBox[i][check] = w10.setSumNumber(numBox, i, check);
				check+=2;
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
	}
	
	public int setSumNumber(int[][] numBox, int i, int j)
	{
		int sum = 0;
		int num01=j-1,num02=j+1;
		if(num01<0)
		{
			num01=0;
		}
		else if(num02>4)
		{
			num02=4;
		}
		sum+=numBox[i-1][num01]+numBox[i-1][num02];
		return sum;
	}
	
}
