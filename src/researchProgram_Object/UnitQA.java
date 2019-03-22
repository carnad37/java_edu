package researchProgram_Object;

import java.util.ArrayList;
import java.util.List;

public class UnitQA
{

	private List<String> question = null;
	private List<List<String>> answer = null;
	
	public UnitQA()
	{
		question = new ArrayList<String>();
		answer = new ArrayList<List<String>>();
	}	
	
	public void addQuestion(String unitQuestion)
	{
		question.add(unitQuestion);
	}
	
	public void addAnswer(List<String> unitAnswer)
	{
		answer.add(unitAnswer);
	}
	
	public void removeQuestion(String unitQuestion)
	{
		question.add(unitQuestion);
	}
	
	public void removeAnswer(List<String> unitAnswer)
	{
		answer.add(unitAnswer);
	}
	
	public String getQuestion(int index)
	{
		return question.get(index);
	}
	
	public List<String> getAnswer(int index)
	{
		return answer.get(index);
	}
	
	public void setQuestion(int questionNumber, String unitQuestion)
	{
		question.set(questionNumber, unitQuestion);
	}
	
	public void setAnswer(int questionNumber, List<String> unitAnswer)
	{
		answer.set(questionNumber, unitAnswer);
	}	
	
	public int getAnswerNumber(int index)
	{
		List<String> targetAnswer = answer.get(index);
		return targetAnswer.size();
	}
}
