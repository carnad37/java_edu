package ex190215.StreamEx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class SubjectScoreCalculator2
{

	public static void main(String[] args) {
		
		SubjectScoreCalculator2 ssCal = new SubjectScoreCalculator2();
			
		String path = "D:\\HHS\\강의자료\\자바\\알고리즘\\00_실습\\";
		String fileName = "subject_score.txt";
		
		
		List<List<String>> scoreList = ssCal.fileOpen(path, fileName);
		
		
				
	}
	

	public List<List<String>> fileOpen(String path, String fileName)
	{
		List<List<String>> scoreList = new ArrayList<List<String>>();
		
		String fullpath = path+fileName;
		
		File file = null;
		BufferedReader bfReader = null;
		
		try
		{
			file = new File(fullpath);
			bfReader = new BufferedReader(new FileReader(file));
			
			String line = "";
			while(line!=bfReader.readLine())
			{
				List<String> unitScoreList = new ArrayList<String>();
				StringTokenizer lineToken = new StringTokenizer(line, " ");
				while(lineToken.hasMoreTokens())
				{
					String data = lineToken.nextToken();
					unitScoreList.add(data);
				}
				scoreList.add(unitScoreList);
			}
		}
		catch(IOException e)
		{
			System.out.println("IOException이 발생");
		}
		finally
		{
			try
			{
				bfReader.close();
			}
			catch(IOException e)
			{
				System.out.println("IOException이 발생");
			}
		}
		return scoreMap;		
	}
	
	public List<Integer> printAvg(List<List<String>> scoreList)
	{

		
		
	}
	
	public List<Integer> printRank()
	{
		
	}
	
	public void printSubjectAvgAndName()
	{
		
	}
	
}
