package ex190215.StreamEx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

class Student
{
	
	
	
	
}


public class SubjectScoreCalculator
{

	public static void main(String[] args) {
		
		SubjectScoreCalculator ssCal = new SubjectScoreCalculator();
			
		String path = "D:\\HHS\\강의자료\\자바\\알고리즘\\00_실습\\";
		String fileName = "subject_score.txt";
		
		
		Map<String, List<Integer>> scoreMap = ssCal.fileOpen(path, fileName);
		
		
				
	}
	

	public Map<String, List<Integer>> fileOpen(String path, String fileName)
	{
		Map<String, List<Integer>> scoreMap = new HashMap<String, List<Integer>>();
		List<Integer> scoreList = new ArrayList<Integer>();
		
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
				StringTokenizer lineToken = new StringTokenizer(line, " ");
				String name = lineToken.nextToken();
				while(lineToken.hasMoreTokens())
				{
					String stringSocre = lineToken.nextToken();
					int score = Integer.parseInt(stringSocre);
					scoreList.add(score);
				}
				scoreMap.put(name, scoreList);
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
	
	public void printAvg(Map<String, List<Integer>> scoreMap)
	{
		Set<String> nameSet = scoreMap.keySet();
		for(String name : nameSet)
		{
			List<Integer> scoreList = scoreMap.get(name);
			int sum = sumScore(scoreList);
			int subjectNumber = scoreList.size();
			double avg = (double)sum/subjectNumber;
			System.out.println(name+"의 평균 점수는 "+avg+"점 이다.");
		}
	}
	
//	public void roundNumber(double number)
//	{
//		
//		number%1 = 
//		
//	}
	
	public List<String> printRank(Map<String, List<Integer>> scoreMap)
	{
		Set<String> nameSet = scoreMap.keySet();
		String[] nameArray = (String[])nameSet.toArray();
		int[] scoreArray = new int[nameArray.length];
		
		for(int i=0;i<nameArray.length;i++)
		{
			String name = nameArray[i];
			List<Integer> scoreList = scoreMap.get(name);
			int sum = sumScore(scoreList);
			scoreArray[i] = sum;
		}
		
		for(int i=0;i)

	}
	
	public int sumScore(List<Integer> scoreList)
	{
		int sumScore = 0;
		for(int score : scoreList)
		{
			sumScore+=score;
		}
		return sumScore;
	}
	
}
