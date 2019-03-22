package researchProgram_Process;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReserchSetting 
{
	//1.아직 상세등록이 완료되지않은 데이터를 등록한다.
	//1-1.(Data의 key값과 DB의 설문명 List를 비교)
	//1-2.(DB의 최대 질문수 값과 Data의 size가 같은지 비교).
	//2.기존의 데이터를 불러와 수정한다.
	
	public void setResearch(Map<String,List<String>> researchDB, String mainPath)
	{
		Map<String,List<List<String>>> researchQA = setResearchQA(mainPath);
		
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
			boolean exitFlag = distributeSevice(select, mainPath, researchDB,researchQA);
			if(exitFlag)
			{
				return;
			}
		}
	}
	
	private Map<String,List<List<String>>> setResearchQA(String path)
	{
		SystemValue sValue = new SystemValue();
		Map<String,List<List<String>>> researchQA = sValue.setData(path);
		return researchQA;
	}
	
	private boolean distributeSevice(int select, String mainPath, Map<String,List<String>> researchDB, Map<String,List<List<String>>> researchQA)
	{
		switch(select)
		{
		case 1:
			researchRegisterSystem(mainPath, researchDB, researchQA);
			break;
		case 2:
			researchPrintSystem(researchQA);
			break;
		case 3:
			changeResearchData(mainPath, researchQA);
			break;
		case 4: return true;
		}
		return false;
	}
	
	private void changeResearchData(String mainPath, Map<String,List<List<String>>> researchQA)
	{
		Set<String> researchName = researchQA.keySet(); 
		
		String targetName = MainSystem.setResearch(researchName.iterator());
		List<List<String>> targetResearch = researchQA.get(targetName);
		//수정하고싶은 설문 선택.
		System.out.println("=======================================");
		printALLQA(targetResearch);
		System.out.println("=======================================");
		
		List<String> targetQA = null;
		int selectQuestionNumber = 0;
		
		while(true)
		{
			System.out.println("수정하고싶은 질문 번호를 입력해주세요.");
			selectQuestionNumber = MainSystem.selectInputSystem(1, targetResearch.size());
			selectQuestionNumber--;
			targetQA = targetResearch.get(selectQuestionNumber);
			printQA(targetQA);
			System.out.println("선택하신 질문이 맞으십니까?");
			boolean answer = MainSystem.setAnswer();
			if(answer)
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
				addData(mainPath, targetQA);
			}
			else if(selectMethod==2)
			{
				resetData(mainPath, targetQA);
			}
			System.out.println("수정을 끝내시겠습니까?");
			SystemValue sValue = new SystemValue();
			sValue.saveAllResearchData(researchQA, mainPath);
			boolean answer = MainSystem.setAnswer();
			if(answer)
			{
				break;
			}
		}
	}	

	private void addData(String mainPath, List<String> targetQA)
	{
		System.out.println("추가할 답변을 입력해주세요");
		int currentMaxAnswer = targetQA.size();
		makeAnswer(targetQA, currentMaxAnswer);		
	}
	
	private void resetData(String mainPath, List<String> targetQA)
	{
		System.out.println("수정하시고 싶은 내역을 선택해주세요.");
		for(int i=0;i<targetQA.size();i++)
		{
			int number = i+1;
			String data = targetQA.get(i);
			System.out.println(number+"."+data);
		}
		int select = MainSystem.selectInputSystem(1, targetQA.size());
		select--;
		String newData = null;
		while(true)
		{
			System.out.println("새로운 내용을 입력해주세요.");
			System.out.print(">");
			newData = MainSystem.scan.nextLine();
			boolean wordCheck = wordChecker(newData);
			if(wordCheck)
			{
				continue;
			}
			break;
		}
		targetQA.set(select, newData);
	}
	private boolean wordChecker(String word)
	{
		SystemValue sValue = new SystemValue();
		boolean blankChcker = MainSystem.banBlank(word);
		if(blankChcker)
		{
			System.out.println("빈칸을 입력하셨습니다.");
			return true;
		}
		boolean wordChecker = sValue.wordCheckerQA(word);
		if(!wordChecker)
		{
			return true;
		}
		return false;
	}

	private void researchPrintSystem(Map<String,List<List<String>>> researchQA)
	{
		Set<String> researchName = researchQA.keySet(); 
		
		String targetName = MainSystem.setResearch(researchName.iterator());
		List<List<String>> targetResearch = researchQA.get(targetName);
		
		printALLQA(targetResearch);
	}
	
	private void researchRegisterSystem(String mainPath, Map<String,List<String>> researchDB, Map<String,List<List<String>>> researchQA)
	{
		List<String> unRegisterData = setUnRegisterResearch(researchDB, researchQA);			
		boolean unRegisterEmpty = unRegisterData.isEmpty();
		if(!unRegisterEmpty)
		{
			String targetName = MainSystem.setResearch(unRegisterData.iterator());
			List<String> targetList = researchDB.get(targetName);	
			int targetQuestionNumber = Integer.parseInt(targetList.get(2));	//최대 질문수
			List<List<String>> newResearchData = makeResearch(mainPath, targetName, targetQuestionNumber);
			
			researchQA.put(targetName, newResearchData);
		}
		else
		{
			System.out.println("미등록 설문조사가 없습니다");
		}			
	}
	
	private List<String> setUnRegisterResearch(Map<String,List<String>> researchDB, Map<String,List<List<String>>> researchQA)
	{
		List<String> unRegisterData = new ArrayList<String>();
		Set<String> dbKey = researchDB.keySet();
		Set<String> dataKey = researchQA.keySet();
		for(String key : dbKey)
		{
			boolean checkRegister = dataKey.contains(key);
			if(!checkRegister)
			{
				unRegisterData.add(key);
			}
//			else	//완전히 등록되지 않은 데이터 확인.
//			{
//				List<String> currentDB = researchDB.get(key);
//				int dbQuestionSize = Integer.parseInt(currentDB.get(3));
//				
//				List<List<String>> currentData = researchQA.get(key);
//				int dataQestionSize = currentData.size();
//				
//				if(dbQuestionSize!=dataQestionSize)
//				{
//					unRegisterData.add(key);
//					System.out.println("("+key+") : 등록이 완료되지 않음.");
//				}
//			}
		}
		return unRegisterData;
	}


	
	private List<List<String>> makeResearch(String mainPath, String researchName, int questionNumber)
	{
		System.out.println("=======================================");
		System.out.println("질문과 답변 등록을 시작합니다.");
		System.out.println("=======================================");
		
		SystemValue sValue = new SystemValue();
		List<List<String>> listQA = new ArrayList<List<String>>();		
		String allQAString = researchName;
		
		for(int i=1;i<=questionNumber;i++)
		{
			List<String> unitQA = new ArrayList<String>();
			
			String question = makeQuestion(i);
			unitQA.add(question);
			
			makeAnswer(unitQA, 1);
			
			allQAString+=sValue.makeQA(unitQA);
			listQA.add(unitQA);
		}
		sValue.saveResearchData(allQAString, mainPath);
		
		return listQA;		
	}

	private String makeQuestion(int index)
	{

		System.out.println("=======================================");
		while(true)
		{
			System.out.println("※"+index+"번째 질문을 입력해주세요.");
			System.out.print(">");
			String question = MainSystem.scan.nextLine();
			boolean wordCheck = wordChecker(question);
			if(wordCheck)
			{
				continue;
			}
			return question;
		}
	}
	
	private void makeAnswer(List<String> unitQA,int startNum)
	{
		while(true)
		{
			System.out.println(startNum+"번째 답변을 입력해주세요.");
			System.out.print(">");
			String answer = MainSystem.scan.nextLine();
			boolean wordCheck = wordChecker(answer);
			if(wordCheck)
			{
				continue;
			}
			unitQA.add(answer);
			if(startNum>1)
			{
				System.out.println("답변을 더 추가하시겠습니까?");
				boolean select = MainSystem.setAnswer();
				if(!select)
				{
					return;
				}
			}			
			startNum++;
		}
	}
		
	private void printALLQA(List<List<String>> listQA)
	{
		for(int i=0;i<listQA.size();i++)
		{
			List<String> unitQA = listQA.get(i);
			int qNum = i+1;
			System.out.print(qNum+".");
			printQA(unitQA);
		}
	}
	
	private void printQA(List<String> unitQA)
	{
		String question = unitQA.get(0);
		System.out.println("질문 : "+question);
		for(int aNum=1;aNum<unitQA.size();aNum++)
		{
			String unitAnswer = unitQA.get(aNum);
			System.out.println("\t"+aNum+"."+unitAnswer);
		}
	}
}
