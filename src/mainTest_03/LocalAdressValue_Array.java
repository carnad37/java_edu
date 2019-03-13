package mainTest_03;

import java.util.List;

public class LocalAdressValue_Array {
	
	String[][] adressData;
	int dataRowLength;
	int dataLineLength;
	boolean exitFlag = false;
	LocalAdressValue_Array(List<String> list)
	{		
		setArray(list);
	}
	
	private void setArray(List<String> list)
	{
		dataRowLength = 5;
		dataLineLength = list.size();
		adressData = new String[dataLineLength][dataRowLength];
		for(int i=0; i<dataLineLength; i++)
		{
			String target = list.get(i);
			String[] targetData = target.split(",");
			for(int j=0; j<dataRowLength; j++)
			{
				adressData[i][j]=targetData[j];
			}
		}
	}
}
