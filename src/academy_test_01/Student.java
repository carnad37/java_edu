package academy_test_01;

import java.util.List;

public class Student
{

	String name;
	int sumScore;
	double avgScore;
	List<Integer> scoreList;
	
	public Student(String pName, List<Integer> pScoreList)
	{
		name = pName;
		scoreList = pScoreList;
		sumScore();
		avgScore();
	}	

	private void sumScore()
	{
		for(int score : scoreList)
		{
			sumScore+=score;
		}
	}
	
	private void avgScore()
	{
		int subjectNumber = scoreList.size();
		avgScore = (double)sumScore/subjectNumber;
		avgScore *= 10;
		avgScore = Math.round(avgScore);
		avgScore /= 10;
	}
		
	public String getName()
	{
		return name;
	}
	
	public int getTargetScore(int subjectNumber)
	{
		return scoreList.get(subjectNumber);
	}
	
	public int getSubjectNumber()
	{
		return scoreList.size();
	}
	
	public int getSubjectOne()
	{
		return scoreList.get(0);
	}
	
	public int getSubjectTwo()
	{
		return scoreList.get(1);
	}
	
	public int getSubjectThree()
	{
		return scoreList.get(2);
	}
	
	public int getSubjectFour()
	{
		return scoreList.get(3);
	}
	
	public int getSubjectFive()
	{
		return scoreList.get(4);
	}
	
	public int getSubjectSix()
	{
		return scoreList.get(5);
	}
	
	public int getSubjectSeven()
	{
		return scoreList.get(6);
	}	
	
	public double getAvgScore()
	{
		return avgScore;
	}
	
	public int getSumScore()
	{
		return sumScore;
	}
	
}
