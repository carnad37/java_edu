package mainTest_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalAdressValue_Map
{
	List<Map<String, String>> adressDataList = new ArrayList<Map<String, String>>();
	int dataRowLength;
	int dataLineLength;
	boolean exitFlag = false;
	LocalAdressValue_Map(List<String> list)
	{		
		setLocalAdressData(adressDataList, list);
	}
	
	private void setLocalAdressData(List<Map<String, String>> adressDataList, List<String> list)
	{
		String[] nameArray = list.get(0).split(",");		
		dataRowLength = nameArray.length;
		
		for(int i=1;i<list.size();i++)
		{
			Map<String,String> adressData = new HashMap<String,String>();
			String[] targetArray = list.get(i).split(",");
			for(int j=0;j<dataRowLength;j++)
			{
				adressData.put(nameArray[j],targetArray[j]);
			}
			adressDataList.add(adressData);
		}
		
		dataLineLength = adressDataList.size();
	}
	
//	public void listTargetSort(String target)
//	{
//		for(int i=0;i<dataLineLength-1;i++)
//		{
//			for(int j=i;j<dataLineLength;j++)
//			{
//			
//				
//				
//			}			
//		}
//	}
}
