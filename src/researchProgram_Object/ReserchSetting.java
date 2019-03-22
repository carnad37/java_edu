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
			UnitQA listQA = makeQA(targetQuestionNumber, answerStartNumber, mainPath);	//	
			targetResearch.setQA(listQA);
			
			FileDataManager setValue = new FileDataManager();
			setValue.saveResearchData(targetResearch, mainPath);
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
			UnitQA currentQA = currentResearch.getListQA();
			boolean checkRegister;
			if(currentQA==null)
			{
				checkRegister=ERROR;
			}
			else
			{
				checkRegister=PASS;
			}
			
			if(checkRegister==selectType)
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
		UnitQA targetQA = targetResearch.getListQA();
		int targetQuestionNumber = targetResearch.getQuestionNumber();
		for(int i=0;i<targetQuestionNumber;i++)
		{
			targetResearch.printQuestion(targetQA, i);
		}
		System.out.println("=======================================");
		
		UnitQA listQA = null;
		int selectQuestionNumber = 0;
		
		while(true)
		{
			System.out.println("�����ϰ���� ���� ��ȣ�� �Է����ּ���.");
			selectQuestionNumber = MainSystem.selectInputSystem(1, targetQuestionNumber);
			selectQuestionNumber--;
			listQA = targetResearch.getListQA();
			targetResearch.printUnitQA(listQA, selectQuestionNumber);
			System.out.println("�����Ͻ� ������ �����ʴϱ�?");
			boolean answer = MainSystem.setAnswer();
			if(answer==YES)
			{
				break;
			}
		}
		while(true)
		{
			System.out.println("=======================================");
			System.out.println("1.�亯 �߰��ϱ�");
			System.out.println("2.������ ����, �亯 �����ϱ�");
			System.out.println("=======================================");
			int selectMethod = MainSystem.selectInputSystem(1, 2);
			if(selectMethod==1)
			{
				addData(mainPath, selectQuestionNumber, listQA);
			}
			else if(selectMethod==2)
			{
				resetData(mainPath, selectQuestionNumber, listQA);
			}
			System.out.println("������ �����ðڽ��ϱ�?");
			FileDataManager setValue = new FileDataManager();
			
			setValue.saveAllResearchData(researchDB, rawRegiserTitle, mainPath);
			
			boolean answer = MainSystem.setAnswer();
			if(answer==YES)
			{
				break;
			}
		}
	}	

	private void addData(String mainPath, int selectQuestionNumber, UnitQA listQA)
	{
		System.out.println("�߰��� �亯�� �Է����ּ���");
		FileDataManager setValue = new FileDataManager();
		
		List<String> currentAnswer = listQA.getAnswer(selectQuestionNumber);
		
		int answerStartNumber = currentAnswer.size()+1;
		makeAnswer(answerStartNumber, currentAnswer, setValue);
		
		listQA.setAnswer(selectQuestionNumber, currentAnswer);
	}
	
	private void resetData(String mainPath, int selectQuestionNumber, UnitQA listQA)
	{
		System.out.println("�����Ͻð� ���� ������ �������ּ���.");
		String question = listQA.getQuestion(selectQuestionNumber);
		System.out.println("1."+question);
		List<String> currentAnswer = listQA.getAnswer(selectQuestionNumber);
		for(int i=1;i<currentAnswer.size();i++)
		{
			int number = i+1;
			String data = currentAnswer.get(i);
			System.out.println(number+"."+data);
		}
		int selectSize = currentAnswer.size();
		int select = MainSystem.selectInputSystem(1, selectSize);
		select--;
		
		String newData = null;
		while(true)
		{
			System.out.println("���ο� ������ �Է����ּ���.");
			System.out.print(">");
			newData = MainSystem.scan.nextLine();
			boolean wordCheck = MainSystem.banBlank(newData);
			if(wordCheck==ERROR)
			{
				continue;
			}
			break;
		}
		//1�̸� question.
		//1�̻��̸� answer��.
		if(select==QUESTION_TITLE)
		{
			listQA.setQuestion(selectQuestionNumber, newData);
		}
		else
		{
			select--;
			currentAnswer.set(select, newData);
			listQA.setAnswer(selectQuestionNumber,currentAnswer);
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
	
	
	public UnitQA makeQA(int questionNumber, int startNumber, String mainPath)
	{
		UnitQA unitQA = new UnitQA();
		System.out.println("=======================================");
		System.out.println("������ �亯 ����� �����մϴ�.");
		System.out.println("=======================================");
		FileDataManager setValue = new FileDataManager();
		for(int i=1;i<=questionNumber;i++)
		{
			String newQuestion = makeQuestion(i,setValue);
			unitQA.addQuestion(newQuestion);
			
			List<String> newAnswer = new ArrayList<String>();
			makeAnswer(startNumber, newAnswer,setValue);
			unitQA.addAnswer(newAnswer);
		}
		return unitQA;
	}
	
	private String makeQuestion(int index, FileDataManager setValue)
	{
		System.out.println("=======================================");
		while(true)
		{
			System.out.println("��"+index+"��° ������ �Է����ּ���.");
			System.out.print(">");
			String question = MainSystem.scan.nextLine();
			boolean wordCheck = MainSystem.banBlank(question);
			if(wordCheck==ERROR)
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
			if(wordCheck==ERROR)
			{
				continue;
			}
			answer.add(newAnswer);
			if(startNum>1)
			{
				System.out.println("�亯�� �� �߰��Ͻðڽ��ϱ�?");
				boolean select = MainSystem.setAnswer();
				if(select==NO)
				{
					return;
				}
			}			
			startNum++;
		}
	}
}
