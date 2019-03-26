package researchProgram_Object;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class FileDataManager
{
	private List<String> setFileData(String path, String subPath)
	{
		String fullPath = path+subPath;
		
		FileOpen fileopen = new FileOpen();
		List<String> result = fileopen.openSystem(fullPath);
		return result;		
	}

	public Map<String,Research> setDBMap(String path)
	{
		List<String> dbData = setFileData(path,"researchDB.txt");
		
		Map<String,Research> dataBaseMap = new HashMap<String,Research>();
		
		for(String data : dbData)
		{
			StringTokenizer dbDataToken = new StringTokenizer(data,",");
			String title = dbDataToken.nextToken();
			String customer = dbDataToken.nextToken();
			String subject = dbDataToken.nextToken();
			String questionNumber = dbDataToken.nextToken();
			String opendate = dbDataToken.nextToken();
			String closedate = dbDataToken.nextToken();
			Research research = new Research(title, customer, subject, questionNumber, opendate, closedate);
			dataBaseMap.put(title, research);
		}
		return dataBaseMap;
	}

	public void saveAllResearchData(Map<String, Research> researchDB, String mainPath)
	{
		String subPath = "researchData.txt";
		String path = mainPath+subPath;

		List<String> saveList = new ArrayList<String>();
		
		Set<String> titleSet = researchDB.keySet();		
		for(String title : titleSet)
		{
			Research research = researchDB.get(title);
			List<UnitQA> listQA = research.getListQA();
			if(listQA.isEmpty())
			{
				continue;
			}
			saveList.add(title);	//타이틀입력

			int questionNumber = research.getQuestionNumber();
			for(int i=0;i<questionNumber;i++)
			{
				UnitQA unitQA = listQA.get(i);
				String question = unitQA.getQuestion();
				
				saveList.add(question);
				List<String> answer = unitQA.getAnswer();
				for(String unitAnswer : answer)
				{
					saveList.add(unitAnswer);
				}
				saveList.add("");
			}
		}				
		saveToTxt(saveList, path);	
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
		
		List<String> researchDB = setFileData(mainPath, subPath);
		
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
		String lineDBData = title+","+customer+","+subject+","+qNumber+","+opendate+","+closedate;
		return lineDBData;
	}	
	
	public void setData(Map<String,Research> researchDB, String path)
	{
		String subPath = "researchData.txt";
		List<String> researchData = setFileData(path, subPath);
			
		int i = 0;
		for(i=0;i<researchData.size();i++)
		{
			String title = researchData.get(i);
			i++;
			
			Research research = researchDB.get(title);
			List<UnitQA> listQA = research.getListQA();
			
			int blankCount = 0;
			int questionNumber = research.getQuestionNumber();
			while(true)	//답변
			{
				String question = researchData.get(i);	//질문
				i++;
				
				List<String> answer = new ArrayList<String>();	//답변
				
				while(true)
				{
					String unitAnswer = researchData.get(i);
					i++;
					
					if(unitAnswer.equals(""))
					{
						blankCount++;
						break;
					}
					answer.add(unitAnswer);
				}
				
				UnitQA unitQA = new UnitQA(question, answer);
				listQA.add(unitQA);
				
				if(blankCount==questionNumber)
				{
					i--;	//135에서 이미 ++해줬으므로 한번 빼준다.
					break;
				}
			}						
		}
	}		
}
