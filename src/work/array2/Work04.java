package work.array2;

public class Work04 {

	public static void main(String[] args) {

		int[][] example = {{5,8,10,6,4},{11,20,1,13,2},{7,9,14,22,3}};
		
		for(int i=0;i<example.length;i++)
		{
			for(int j=0;j<example[i].length;j++)
			{
				System.out.print(example[i][j]+"\t");
			}
			System.out.println("");
		}
		
	}
	
}
