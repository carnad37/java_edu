package researchProgram_Object;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReserchSetting 
{
	//1.아직 상세등록이 완료되지않은 데이터를 등록한다.
	//1-1.(Data의 key값과 DB의 설문명 List를 비교)
	//1-2.(DB의 최대 질문수 값과 Data의 size가 같은지 비교).
	//2.기존의 데이터를 불러와 수정한다.
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
		System.out.println("설문조사 시스템 입력");
		while(true)
		{
			System.out.println("=======================================");
			System.out.println("1. 미등록 설문조사 질답 입력");
			System.out.println("2. 설문조사 내용 일람");
			System.out.println("3. 기존 설문조사 정보 수정");
			System.out.println("4. 뒤로가기");
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
			int targetQuestionNumber = targetResearch.getQuestionNumber();	//최대 질문수
			
			int answerStartNumber = 1;
			UnitQA listQA = makeQA(targetQuestionNumber, answerStartNumber, mainPath);	//	
			targetResearch.setQA(listQA);
			
			FileDataManager setValue = new FileDataManager();
			setValue.saveResearchData(targetResearch, mainPath);
		}
		else
		{
			System.out.println("미등록 설문조사가 없습니다");
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
		//수정하고싶은 설문 선택.
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
			System.out.println("수정하고싶은 질문 번호를 입력해주세요.");
			selectQuestionNumber = MainSystem.selectInputSystem(1, targetQuestionNumber);
			selectQuestionNumber--;
			listQA = targetResearch.getListQA();
			targetResearch.printUnitQA(listQA, selectQuestionNumber);
			System.out.println("선택하신 질문이 맞으십니까?");
			boolean answer = MainSystem.setAnswer();
			if(answer==YES)
			{
				break;
			}
		}
		while(true)
		{
			System.out.println("=======================================");
			System.out.println("1.답변 추가하기");
			System.out.println("2.기존의 질문, 답변 수정하기");
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
			System.out.println("수정을 끝내시겠습니까?");
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
		System.out.println("추가할 답변을 입력해주세요");
		FileDataManager setValue = new FileDataManager();
		
		List<String> currentAnswer = listQA.getAnswer(selectQuestionNumber);
		
		int answerStartNumber = currentAnswer.size()+1;
		makeAnswer(answerStartNumber, currentAnswer, setValue);
		
		listQA.setAnswer(selectQuestionNumber, currentAnswer);
	}
	
	private void resetData(String mainPath, int selectQuestionNumber, UnitQA listQA)
	{
		System.out.println("수정하시고 싶은 내역을 선택해주세요.");
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
			System.out.println("새로운 내용을 입력해주세요.");
			System.out.print(">");
			newData = MainSystem.scan.nextLine();
			boolean wordCheck = MainSystem.banBlank(newData);
			if(wordCheck==ERROR)
			{
				continue;
			}
			break;
		}
		//1이면 question.
		//1이상이면 answer로.
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
		System.out.println("질문과 답변 등록을 시작합니다.");
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
			System.out.println("※"+index+"번째 질문을 입력해주세요.");
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
			System.out.println(startNum+"번째 답변을 입력해주세요.");
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
				System.out.println("답변을 더 추가하시겠습니까?");
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
