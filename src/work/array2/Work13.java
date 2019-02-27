package work.array2;

import java.util.Scanner;

public class Work13 {
	
	public static void main(String[] args) {
		
		char[][] charArray = new char[3][];
		Work13 w13 = new Work13();
		Scanner scan = new Scanner(System.in);
		
		w13.setCharArray(scan, charArray);
		w13.changeLargeToSmall(charArray);
		
		for(int i=0;i<charArray.length;i++)
		{
			for(int j=0;j<charArray[i].length;j++)
			{
				System.out.print(charArray[i][j]);
			}
			System.out.println("");
		}
	}
	
	public void setCharArray(Scanner scan, char[][] targetArray)
	{
		char[] res;
		for(int i=0;i<targetArray.length;i++)
		{
			String word = scan.nextLine();
			res = stringToChar(word);
			targetArray[i]=res;
		}		
	}
	
	public char[] stringToChar(String word)
	{
		char[] resArray=new char[word.length()];
		for(int i=0;i<word.length();i++)
		{
			resArray[i]=word.charAt(i);
		}		
		return resArray;
	}
	
	public void changeLargeToSmall(char[][] targetArray)
	{
		for(int i=0;i<targetArray.length;i++)
		{
			for(int j=0;j<targetArray[i].length;j++)
			{
				int check = targetArray[i][j];
				if(check!=32)
				{
					check+=32;
				}
				targetArray[i][j] = (char)check;
			}
		}
	}
}
