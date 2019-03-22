package researchProgram_Process;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SystemValue
{
	private List<String> setRawData(String path, String subPath)
	{
		String fullPath = path+subPath;
		FileOpen fileopen = new FileOpen();
		List<String> result = fileopen.openSystem(fullPath);
		return result;		
	}
	
	public Map<String,List<String>> setDBMap(String path)
	{
		List<String> rawData = setRawData(path,"researchDB.txt");
		
		Map<String,List<String>> dataBaseMap = new HashMap<String,List<String>>();
		
		for(String data : rawData)
		{
			List<String> dataList = new ArrayList<String>();

			String[] dataArray = data.split(",");	//설문명은 :로 구분된다
			String key = dataArray[0];
			
			for(int i=1;i<dataArray.length;i++)
			{
				dataList.add(dataArray[i]);
			}
			
			dataBaseMap.put(key, dataList);
		}		
		return dataBaseMap;
	}
	
	public void saveAllResearchData(Map<String,List<List<String>>> researchQA, String mainPath)
	{
		String subPath = "researchData.txt";
		String path = mainPath+subPath;
		
		Set<String> keySet = researchQA.keySet();
		List<String> saveList = new ArrayList<String>();
		for(String key : keySet)
		{
			List<List<String>> value = researchQA.get(key);
			String fullQA = key;
			for(List<String> unitQA : value)
			{
				fullQA += makeQA(unitQA);
			}
			saveList.add(fullQA);
		}		
		saveToTxt(saveList, path);		
	}
	
	public void saveResearchData(String researchData, String mainPath)
	{
		String subPath = "researchData.txt";
		String path = mainPath+subPath;
		List<String> rawResearchData= setRawData(mainPath, subPath);
		
		rawResearchData.add(researchData);
		
		saveToTxt(rawResearchData, path);
	}
	
	private void saveToTxt(List<String> list, String path)
	{
		FileWrite filewrite = new FileWrite();
		filewrite.writeSystem(list, path);		
	}
	
	public void saveDataToDB(String[] dbData, String mainPath)
	{
		String lineData = setDataToString(dbData);		
		String subPath = "researchDB.txt";
		String path = mainPath+subPath;
		
		List<String> researchDB = setRawData(mainPath, subPath);
		
		researchDB.add(lineData);
		
		saveToTxt(researchDB, path);
	}
	
	private String setDataToString(String[] arrayData)
	{
		String lineData = arrayData[0];
		for(int i=1;i<arrayData.length;i++)
		{
			lineData += ","+arrayData[i];
		}
		return lineData;
	}	
	
	public Map<String,List<List<String>>> setData(String path)
	{
		String subPath = "researchData.txt";
		List<String> rawData = setRawData(path, subPath);
		
		Map<String,List<List<String>>> resData = new HashMap<String,List<List<String>>>();
		for(String data : rawData)
		{
			String[] rawDataArray = data.split("@@");
			String key = rawDataArray[0];	//설문조사명
			List<List<String>> value = setValue(rawDataArray);		
			resData.put(key, value);			
		}
		return resData;
	}
	
	private List<List<String>> setValue(String[] rawDataArray)
	{
		List<List<String>> value = new ArrayList<List<String>>();
		for(int i=1;i<rawDataArray.length;i++)
		{
			List<String>unitQA = setQA(rawDataArray[i]);	//하나의 QA
			value.add(unitQA);
		}
		return value;
	}
		
	private List<String> setQA(String rawLineData)
	{
		List<String> value = new ArrayList<String>();

		String[] sumValue = rawLineData.split(",,");
		for(String valueData : sumValue)
		{
			value.add(valueData);
		}
		return value;
	}
	
	public String makeQA(List<String> listQA)
	{
		String stringQA = "@@"+listQA.get(0);
		for(int i=1;i<listQA.size();i++)
		{
			stringQA += ",,"+listQA.get(i);
		}
		return stringQA;
	}
	
	public boolean wordCheckerQA(String word)
	{
		boolean wordCheck = MainSystem.wordChecker(word, ",,");
		if(!wordCheck)
		{
			return false;
		}
		wordCheck = MainSystem.wordChecker(word, "@@");
		if(!wordCheck)
		{
			return false;
		}
		return true;
	}
	
}
