package researchProgram_Object;

import java.util.List;

public class Research
{
	private String title;
	private String customer;
	private String subject;
	private String questionNumber;
	private String opendate;
	private String closedate;
	private UnitQA listQA = null;
	
	public Research(String pTitle, String pCustomer, String pSubject, String pQuestionNumber, String pOpendate, String pClosedate)
	{
		title = pTitle;
		customer = pCustomer;
		subject = pSubject;
		questionNumber = pQuestionNumber;
		opendate = pOpendate;
		closedate = pClosedate;
	}
	
	public void setQA(UnitQA unitQA)
	{
		this.listQA = unitQA;
	}
	
	public void printResearchSummary()
	{
		System.out.println("설문 조사명 : "+title);
		System.out.println("의뢰처 : "+customer);
		System.out.println("설문 분야 : "+subject);
		System.out.println("질문 갯수 : "+questionNumber);
		System.out.println("설문 시작일 : "+opendate);
		System.out.println("설문 종료일 : "+closedate);
	}
	
	public void printListQA()
	{
		if(listQA!=null)
		{
			int questionNumber = getQuestionNumber();
			for(int i=0;i<questionNumber;i++)
			{
				printUnitQA(listQA, i);
			}
			return;
		}
		System.out.println("시스템 오류 : 질문과 답변의 데이터가 없습니다.");
	}
	
	public void printQuestion(UnitQA listQA, int index)
	{
		int currentNumber = index+1;
		String question = listQA.getQuestion(index);
		System.out.println(currentNumber+"."+question);
	}
	
	public void printUnitQA(UnitQA listQA, int index)
	{
		printQuestion(listQA, index);
		List<String> currentAnswer = listQA.getAnswer(index);
		for(int j=0;j<currentAnswer.size();j++)
		{
			int answerNumber = j+1;
			System.out.println("\t"+answerNumber+"."+currentAnswer.get(j));
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
	
	public UnitQA getListQA()
	{
		return listQA;
	}

}
