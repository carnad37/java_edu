package researchProgram_Object;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReserchSetting 
{
	//1.���� �󼼵���� �Ϸ�������� �����͸� ����Ѵ�.
	//1-1.(Data�� key���� DB�� ������ List�� ��)
	//1-2.(DB�� �ִ� ������ ���� Data�� size�� ������ ��).
	//2.������ �����͸� �ҷ��� �����Ѵ�.
	static final boolean PASS = MainSystem.PASS;
	static final boolean ERROR = MainSystem.ERROR;
	static final boolean REGISTER = PASS;
	static final boolean UNREGISTER = ERROR;
	static final boolean YES = MainSystem.YES;
	static final boolean NO = MainSystem.NO;
	static final boolean OFF = false;
	static final boolean ON = true;
	
	static final int QUESTION_TITLE = 0;
	
	public void setResearch(String mainPath, Map<String,Research> researchDB)
	{
		
		System.out.println("=======================================");
		System.out.println("�������� �ý��� �Է�");
		while(true)
		{
			System.out.println("=======================================");
			System.out.println("1. �̵�� �������� ���� �Է�");
			System.out.println("2. �������� ���� �϶�");
			System.out.println("3. ���� �������� ���� ����");
			System.out.println("4. �ڷΰ���");
			System.out.println("=======================================");
			int select = MainSystem.selectInputSystem(1,4);
			boolean exitFlag = distributeSevice(select, mainPath, researchDB);
			if(exitFlag==YES)
			{
				return;
			}
		}
	}
	
	private boolean distributeSevice(int select, String mainPath, Map<String,Research> researchDB)
	{
		switch(select)
		{
		case 1:
			researchRegisterSystem(mainPath, researchDB);
			break;
		case 2:
			researchPrintSystem(researchDB);
			break;
		case 3:
			changeResearchData(mainPath, researchDB);
			break;
		case 4: return true;
		}
		return false;
	}
	
	private void researchRegisterSystem(String mainPath, Map<String,Research> researchDB)
	{
		List<String> unRegisterData = setRegisterResearch(researchDB, UNREGISTER);
		boolean unRegisterEmpty = unRegisterData.isEmpty();
		if(!unRegisterEmpty)
		{
			Iterator<String> selectQuestion = unRegisterData.iterator();
			String targetTitle = MainSystem.setResearch(selectQuestion);
			
			Research targetResearch = researchDB.get(targetTitle);	
			int targetQuestionNumber = targetResearch.getQuestionNumber();	//�ִ� ������
			
			int answerStartNumber = 1;
			List<UnitQA> targetListQA = targetResearch.getListQA();
			makeQA(targetListQA, targetQuestionNumber, answerStartNumber, mainPath);	//	
			
			FileDataManager setValue = new FileDataManager();
			setValue.saveAllResearchData(researchDB, mainPath);
		}
		else
		{
			System.out.println("�̵�� �������簡 �����ϴ�");
		}			
	}
	
	private List<String> setRegisterResearch(Map<String,Research> researchDB, boolean selectType)
	{
		List<String> registerData = new ArrayList<String>();
		Set<String> dbKey = researchDB.keySet();
		for(String key : dbKey)
		{
			Research currentResearch = researchDB.get(key);
			List<UnitQA> currentQA = currentResearch.getListQA();
			boolean checkRegister;
			if(currentQA.isEmpty())
			{
				checkRegister=ERROR;
			}
			else
			{
				checkRegister=PASS;
			}
			
			if (checkRegister==selectType)
			{
				registerData.add(key);
			}
		}
		return registerData;
	}
	
	private void changeResearchData(String mainPath, Map<String,Research> researchDB)
	{
		List<String> rawRegiserTitle = setRegisterResearch(researchDB, REGISTER);		
		Iterator<String> registerTitle = rawRegiserTitle.iterator();
		
		String targetTitle = MainSystem.setResearch(registerTitle);
		Research targetResearch = researchDB.get(targetTitle);
		//�����ϰ���� ���� ����.
		System.out.println("=======================================");
		List<UnitQA> targetListQA = targetResearch.getListQA();
		int targetQuestionNumber = targetResearch.getQuestionNumber();
		for(int i=0;i<targetQuestionNumber;i++)
		{
			targetResearch.printQuestion(targetListQA, i);
		}
		System.out.println("=======================================");
		
		List<UnitQA> listQA = targetResearch.getListQA();
		int selectQuestionNumber = 0;
		
		boolean loopFlag = ON;
		while (loopFlag == ON)
		{
			System.out.println("�����ϰ���� ���� ��ȣ�� �Է����ּ���.");
			selectQuestionNumber = MainSystem.selectInputSystem(1, targetQuestionNumber);
			selectQuestionNumber--;
			targetResearch.printUnitQA(listQA, selectQuestionNumber);
			System.out.println("�����Ͻ� ������ �����ʴϱ�?");
			boolean answer = MainSystem.setAnswer();
			if(answer==YES)
			{
				loopFlag = OFF;
			}
		}
		
		loopFlag = ON;
		while (loopFlag == ON)
		{
			System.out.println("=======================================");
			System.out.println("1.�亯 �߰��ϱ�");
			System.out.println("2.������ ����, �亯 �����ϱ�");
			System.out.println("=======================================");
			int selectMethod = MainSystem.selectInputSystem(1, 2);
			if(selectMethod == 1)
			{
				addData(mainPath, selectQuestionNumber, listQA);
			}
			else if(selectMethod == 2)
			{
				resetData(mainPath, selectQuestionNumber, listQA);
			}
			System.out.println("������ �����ðڽ��ϱ�?");
			FileDataManager setValue = new FileDataManager();
			
			setValue.saveAllResearchData(researchDB, mainPath);
			
			boolean answer = MainSystem.setAnswer();
			if (answer == YES)
			{
				loopFlag = OFF;
			}
		}
	}	

	private void addData(String mainPath, int selectQuestionNumber, List<UnitQA> listQA)
	{
		System.out.println("�߰��� �亯�� �Է����ּ���");
		FileDataManager setValue = new FileDataManager();
		
		UnitQA unitQA = listQA.get(selectQuestionNumber);
		List<String> currentAnswer = unitQA.getAnswer();
		
		int answerStartNumber = currentAnswer.size()+1;
		makeAnswer(answerStartNumber, currentAnswer, setValue);
		
//		unitQA.setAnswer(selectQuestionNumber, currentAnswer);
	}
	
	private void resetData(String mainPath, int selectQuestionNumber, List<UnitQA> listQA)
	{
		System.out.println("�����Ͻð� ���� ������ �������ּ���.");
		UnitQA unitQA = listQA.get(selectQuestionNumber);

		String question = unitQA.getQuestion();
		System.out.println("1."+question);
		List<String> currentAnswer = unitQA.getAnswer();
		for (int i = 0; i<currentAnswer.size(); i++)
		{
			int number = i+2;	//+������(1��)+�ε���(+1)
			String data = currentAnswer.get(i);
			System.out.println(number+"."+data);
		}
		int selectSize = currentAnswer.size();
		int select = MainSystem.selectInputSystem(1, selectSize);
		select--;	//������(-1)
		
		String newData = null;
		while (true)
		{
			System.out.println("���ο� ������ �Է����ּ���.");
			System.out.print(">");
			newData = MainSystem.scan.nextLine();
			boolean wordCheck = MainSystem.banBlank(newData);
			if(wordCheck == ERROR)
			{
				continue;
			}
			break;
		}
		//1�̸� question.
		//1�̻��̸� answer��.
		if(select==QUESTION_TITLE)
		{
			unitQA.setQuestion(newData);
		}
		else
		{
			select--;	//�ε���(-1)
			currentAnswer.set(select, newData);
//			unitQA.setAnswer(selectQuestionNumber,currentAnswer);
		}
	}


	private void researchPrintSystem(Map<String,Research> researchDB)
	{
		List<String> rawRegiserTitle = setRegisterResearch(researchDB, REGISTER);
		
		Iterator<String> regiserTitle = rawRegiserTitle.iterator();
		String targetTitle = MainSystem.setResearch(regiserTitle);
		
		Research targetResearch = researchDB.get(targetTitle);
		targetResearch.printListQA();
	}
	
	
	public void makeQA(List<UnitQA> listQA, int questionNumber, int startNumber, String mainPath)
	{
		System.out.println("=======================================");
		System.out.println("������ �亯 ����� �����մϴ�.");
		System.out.println("=======================================");
		FileDataManager setValue = new FileDataManager();
		for(int i = 1; i <= questionNumber; i++)
		{
			String newQuestion = makeQuestion(i,setValue);
			
			List<String> newAnswer = new ArrayList<String>();
			makeAnswer(startNumber, newAnswer,setValue);
			UnitQA unitQA = new UnitQA(newQuestion, newAnswer);
			listQA.add(unitQA);
		}
	}
	
	private String makeQuestion(int index, FileDataManager setValue)
	{
		System.out.println("=======================================");
		while (true)
		{
			System.out.println("��" + index + "��° ������ �Է����ּ���.");
			System.out.print(">");
			String question = MainSystem.scan.nextLine();
			boolean wordCheck = MainSystem.banBlank(question);
			if(wordCheck == ERROR)
			{
				continue;
			}
			return question;
		}
	}
	
	private void makeAnswer(int startNum, List<String> answer, FileDataManager setValue)
	{
		while(true)
		{
			System.out.println(startNum+"��° �亯�� �Է����ּ���.");
			System.out.print(">");
			String newAnswer = MainSystem.scan.nextLine();
			boolean wordCheck = MainSystem.banBlank(newAnswer);
			if (wordCheck == ERROR)
			{
				continue;
			}
			answer.add(newAnswer);
			if (startNum>1)
			{
				System.out.println("�亯�� �� �߰��Ͻðڽ��ϱ�?");
				boolean select = MainSystem.setAnswer();
				if (select == NO)
				{
					return;
				}
			}			
			startNum++;
		}
	}
}
