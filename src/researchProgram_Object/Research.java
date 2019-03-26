package researchProgram_Object;

import java.util.ArrayList;
import java.util.List;

public class Research
{
	private String title;
	private String customer;
	private String subject;
	private String questionNumber;
	private String opendate;
	private String closedate;
	private List<UnitQA> listQA = null;
	
	public Research(String pTitle, String pCustomer, String pSubject, String pQuestionNumber, String pOpendate, String pClosedate)
	{
		title = pTitle;
		customer = pCustomer;
		subject = pSubject;
		questionNumber = pQuestionNumber;
		opendate = pOpendate;
		closedate = pClosedate;
		listQA = new ArrayList<UnitQA>();
	}
	
	public void addQA(UnitQA unitQA)
	{
		listQA.add(unitQA);
	}
	
	public void printResearchSummary()
	{
		System.out.println("���� ����� : "+title);
		System.out.println("�Ƿ�ó : "+customer);
		System.out.println("���� �о� : "+subject);
		System.out.println("���� ���� : "+questionNumber);
		System.out.println("���� ������ : "+opendate);
		System.out.println("���� ������ : "+closedate);
	}
	
	public void printListQA()
	{
		if(listQA.isEmpty())
		{
			System.out.println("�ý��� ���� : ������ �亯�� �����Ͱ� �����ϴ�.");
			return;
		}
		for(UnitQA unitQA : listQA)
		{
			String question = unitQA.getQuestion();
			System.out.println("���� : "+question);
			List<String> answer = unitQA.getAnswer();
			int answerNumber = 1;
			for(String unitAnswer : answer)
			{
				System.out.println("\t"+answerNumber+"."+unitAnswer);
				answerNumber++;
			}
		}
	}
	
	public void printQuestion(List<UnitQA> listQA, int index)
	{
		int currentNumber = index+1;
		UnitQA unitQA = listQA.get(index);
		String question = unitQA.getQuestion();
		System.out.println(currentNumber+"."+question);
	}	
	
	
	public void printUnitQA(List<UnitQA> listQA, int index)
	{
		printQuestion(listQA, index);
		UnitQA unitQA = listQA.get(index);
		List<String> currentAnswer = unitQA.getAnswer();
		for(int j=0;j<currentAnswer.size();j++)
		{
			int answerNumber = j+1;
			String unitAnswer = currentAnswer.get(j);
			System.out.println("\t"+answerNumber+"."+unitAnswer);
		}
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getCustomer()
	{
		return customer;
	}
	
	public String getSubject()
	{
		return subject;
	}
	
	public int getQuestionNumber()
	{
		int qNum = Integer.parseInt(questionNumber);
		return qNum;
	}
	
	public String getOpendate()
	{
		return opendate;
	}
	
	public String getClosedate()
	{
		return closedate;
	}
	
	public List<UnitQA> getListQA()
	{
		return listQA;
	}

}
