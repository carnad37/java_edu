package ex190215.StreamEx;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;

public class CopyTextFile {
	
	public static void main(String[] args) {
		
		File fileR = null;
		File fileW = null;
		BufferedWriter buW = null;
		BufferedReader buR = null;
		try
		{
			fileR = new File("d:\\hhs2\\file\\phones_java.txt");
			fileW = new File("d:\\hhs2\\file\\new_java.txt");
			buW = new BufferedWriter(new FileWriter(fileW));
			buR = new BufferedReader(new FileReader(fileR));
			
			String line = "";
			while((line = buR.readLine())!=null)
			{
				buW.write(line);
				buW.newLine();
				
			}
			
		}
		catch(FileNotFoundException e)
		{
			
		}
		catch(IOException e)
		{
			
		}
		finally
		{
			try
			{
//				fw.close();
				buW.close();
				buR.close();
			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
		
	}
	
}
