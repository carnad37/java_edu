package researchProgram_Object;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class FileDataManager
{
	private List<String> setRawData(String path, String subPath)
	{
		String fullPath = path+subPath;
		FileOpen fileopen = new FileOpen();
		List<String> result = fileopen.openSystem(fullPath);
		return result;		
	}

	public Map<String,Research> setDBMap(String path)
	{
		List<String> rawData = setRawData(path,"researchDB.txt");
		
		Map<String,Research> dataBaseMap = new HashMap<String,Research>();
		
		for(String data : rawData)
		{
			StringTokenizer rawToken = new StringTokenizer(data,",");
			String title = rawToken.nextToken();
			String customer = rawToken.nextToken();
			String subject = rawToken.nextToken();
			String questionNumber = rawToken.nextToken();
			String opendate = rawToken.nextToken();
			String closedate = rawToken.nextToken();
			Research research = new Research(title, customer, subject, questionNumber, opendate, closedate);
			dataBaseMap.put(title, research);
		}
		return dataBaseMap;
	}
	
//	public void saveAllResearchData(Map<String, Research> researchDB, List<String> regiserTitle, String mainPath)
//	{
//		String subPath = "researchData.txt";
//		String path = mainPath+subPath;
//		List<String> saveList = new ArrayList<String>();
//		
//		for(String title : regiserTitle)
//		{
//			Research targetResearch = researchDB.get(title);
//			String researchStringData = researchToString(targetResearch);			
//			saveList.add(researchStringData);
//		}		
//		saveToTxt(saveList, path);	
//	}
	
	public void saveAllResearchData(Map<String, Research> researchDB, List<String> regiserTitle, String mainPath)
	{
		String subPath = "researchData.txt";
		String path = mainPath+subPath;
		List<String> saveList = new ArrayList<String>();
		
		for(String title : regiserTitle)
		{
			saveList.add(title);	//타이틀입력
			Research research = researchDB.get(title);
			int questionNumber = research.getQuestionNumber();
			UnitQA listQA = research.getListQA();
			for(int i=0;i<questionNumber;i++)
			{
				String question = listQA.getQuestion(i);
				saveList.add(question);
				List<String> answer = listQA.getAnswer(i);
				for(String unitAnswer : answer)
				{
					saveList.add(unitAnswer);
				}
				saveList.add("");
			}
		}				
		saveToTxt(saveList, path);	
	}
	
	public void saveResearchData(Research research, String mainPath)
	{
		String subPath = "researchData.txt";
		String path = mainPath+subPath;
		List<String> rawResearchData= setRawData(mainPath, subPath);
		
		String researchStringData = researchToString(research);
		
		rawResearchData.add(researchStringData);
		
		saveToTxt(rawResearchData, path);
	}

	
	private String researchToString(Research research)
	{
		String targetTitle = research.getTitle();
		int targetQuestionNumber = research.getQuestionNumber();
		UnitQA targetUnitQA = research.getListQA();
	
		String researchStringData = targetTitle;
		String stringQA = makeQA(targetQuestionNumber, targetUnitQA);
		researchStringData += stringQA;
	
		return researchStringData;
	}
	
	private void saveToTxt(List<String> list, String path)
	{
		FileWrite filewrite = new FileWrite();
		filewrite.writeSystem(list, path);		
	}
	
	public void saveDataToDB(Research research, String mainPath)
	{
		String lineData = setDataToString(research);
		String subPath = "researchDB.txt";
		String path = mainPath+subPath;
		
		List<String> researchDB = setRawData(mainPath, subPath);
		
		researchDB.add(lineData);
		
		saveToTxt(researchDB, path);
	}

	private String setDataToString(Research research)
	{
		String title = research.getTitle();
		String customer = research.getCustomer();
		String subject = research.getSubject();
		String qNumber = String.valueOf(research.getQuestionNumber());
		String opendate = research.getOpendate();
		String closedate = research.getClosedate();
		String rawData = title+","+customer+","+subject+","+qNumber+","+opendate+","+closedate;
		return rawData;
	}
	
	public void setData(Map<String,Research> researchDB, String path)
	{
		String subPath = "researchData.txt";
		List<String> rawData = setRawData(path, subPath);
				
		for(String data : rawData)
		{
			StringTokenizer rawDataToken = new StringTokenizer(data, "@@");
			
			String key = rawDataToken.nextToken();	//설문조사명
			
			//이후 토큰하나당 문제가 하나씩 담김
			UnitQA listQA = new UnitQA();
			setListQA(rawDataToken, listQA);
			Research targetResearch = researchDB.get(key);
			targetResearch.setQA(listQA);
		}
	}	
	
	private void setListQA(StringTokenizer rawDataToken, UnitQA unitQA)
	{
		while(rawDataToken.hasMoreTokens())
		{
			String stringQA = rawDataToken.nextToken();
			apartQA(stringQA, unitQA);			
		}
	}
	
	private void apartQA(String stringQA, UnitQA unitQA)
	{
		StringTokenizer stringQAToken = new StringTokenizer(stringQA, ",,");		
		String question = stringQAToken.nextToken();
		
		List<String> answer = new ArrayList<String>();
		while(stringQAToken.hasMoreTokens())
		{
			answer.add(stringQAToken.nextToken());
		}
		
		unitQA.addQuestion(question);
		unitQA.addAnswer(answer);
	}
	
	private String makeQA(int questionNumber, UnitQA listQA)
	{
		String stringQA = "";
		for(int i=0;i<questionNumber;i++)
		{
			stringQA += "@@"+listQA.getQuestion(i);
			List<String> answer = listQA.getAnswer(i);
			for(String unitAnswer : answer)
			{
				stringQA += ",,"+unitAnswer;
			}
		}
		return stringQA;
	}
	
//	public boolean wordCheckerQA(String word)
//	{
//		boolean wordCheck = MainSystem.wordChecker(word, ",,");
//		if(MainSystem.ERROR==wordCheck)
//		{
//			return false;
//		}
//		wordCheck = MainSystem.wordChecker(word, "@@");
//		if(MainSystem.ERROR==wordCheck)
//		{
//			return false;
//		}
//		return true;
//	}
	
}
