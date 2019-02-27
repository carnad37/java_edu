package work.array2;

public class Work09 {
	
	public static void main(String[] args) {
		
		int[][] numArray = {{3,5,9},{2,11,5},{8,30,10},{22,5,1}};
		int sum = 0;
		for(int i=0;i<numArray.length;i++)
		{
			for(int j=0;j<numArray[i].length;j++)
			{
				System.out.print(numArray[i][j]+"\t");
				sum+=numArray[i][j];
			}
			System.out.println("");
		}		
		System.out.println(sum);
	}

}
