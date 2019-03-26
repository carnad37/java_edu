package academy_test_01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SubjectScoreCalculator
{
	
	//renige31@naver.com

	public static void main(String[] args) {
		
		SubjectScoreCalculator ssCal = new SubjectScoreCalculator();
			
		String path = "D:\\HHS\\강의자료\\자바\\알고리즘\\00_실습\\";
		String fileName = "subject_score.txt";
		
		List<Student> studentList = ssCal.fileOpen(path, fileName);
		
		ssCal.printAvg(studentList);
		
		ssCal.printRank(studentList);
		
		int subjectNumber = ssCal.getSubjectNumber(studentList);	
		
		ssCal.printSubjectAvgAndTop(studentList, subjectNumber);
		
				
	}
	
	public int getSubjectNumber(List<Student> studentList)
	{
		Student student = studentList.get(0);
		int subjectNum = student.getSubjectNumber();
		
		return subjectNum;
	}
	

	public List<Student> fileOpen(String path, String fileName)
	{
		List<Student> studentList = new ArrayList<Student>();
		
		String fullpath = path+fileName;
		
		File file = null;
		BufferedReader bfReader = null;
		
		try
		{
			file = new File(fullpath);
			bfReader = new BufferedReader(new FileReader(file));
			
			String line = "";
			while((line=bfReader.readLine())!=null)
			{
				List<Integer> scoreList = new ArrayList<Integer>();
				StringTokenizer lineToken = new StringTokenizer(line, " ");
				String name = lineToken.nextToken();
				while(lineToken.hasMoreTokens())
				{
					String stringSocre = lineToken.nextToken();
					int score = Integer.parseInt(stringSocre);
					scoreList.add(score);
				}
				Student student = new Student(name, scoreList);
				studentList.add(student);
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
		return studentList;		
	}
	
	public void printAvg(List<Student> studentList)
	{
		for(Student student : studentList)
		{
			String name = student.getName();
			double avgScore = student.avgScore;
			System.out.println(name+"의 평균점수는 "+avgScore+"이다.");
		}
	}

	
	public void printRank(List<Student> studentList)
	{
		for(int i=0;i<studentList.size()-1;i++)
		{
			Student preStudent = studentList.get(i);
			int preStuScore = preStudent.sumScore;
			
			for(int j=i+1;j<studentList.size();j++)
			{
				Student postStudent = studentList.get(j);
				int postStuScore = postStudent.sumScore;
				
				if(preStuScore<postStuScore)
				{
					Student saveSutdentData1 = preStudent;
					Student saveSutdentData2 = postStudent;
					studentList.set(i, saveSutdentData2);
					studentList.set(j, saveSutdentData1);
				}				
			}
		}
		for(int i=0;i<studentList.size();i++)
		{
			Student student = studentList.get(i);
			String name = student.getName();
			int rank = i+1;
			System.out.println(name+"의 등수는 "+rank+"등이다.");
		}
	}
	
	public void printSubjectAvgAndTop(List<Student> studentList, int subjectNumber)
	{
		for(int i=0;i<subjectNumber;i++)	//과목번호
		{
			List<String> maxScoreStudent = new ArrayList<String>();
			int targetSubjectNumber = i+1;

			int studentNumber = studentList.size();
			int sumScore = 0;
			int avgScore = 0;
			int maxScore = 0;
			
			Student fistStudent = studentList.get(0);
			int firstScore = fistStudent.getTargetScore(i);
			
			sumScore = firstScore;
			maxScore = firstScore;
			
			for(int j=1;j<studentList.size();j++)	//학생번호
			{
				Student student = studentList.get(j);
				int score = student.getTargetScore(i);
				sumScore += score;
				if(score>maxScore)
				{
				String name = student.getName();
				maxScoreStudent.add(name);
				maxScore = score;
			}			
			if(firstScore==maxScore)
			{
				String name = fistStudent.getName();
				maxScoreStudent.add(name);
			}

			avgScore = sumScore/studentNumber;
			
			System.out.println(targetSubjectNumber+"번째 과목의 평균은 "+avgScore+"이다.");
			System.out.print("최고 득점자는 ");
			
			for(String name : maxScoreStudent)
			{
				System.out.print("["+name+"] ");				
			}
			
			System.out.print("이다.");		
			System.out.println("");
			
			}
		}
	}	
}
