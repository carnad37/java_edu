package mainTest_04;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class DicValue
{
	public Map<String, String[]> dicDataMap;
	
	DicValue(List<String> dicData)
	{
//		dicDataMap = dicListData(dicData);
	}
	
	
	private Map<String, List<String[]>> dicListData(List<String> dicData)
	{
		Map<String, List<String[]>> dicDataMap = new HashMap<String, List<String[]>>();
		int length = dicData.size();
		String firstwordselecter = "a";
		String firstword = null;
		for(int i=0;i<length;i++)
		{
			List<String[]> dataList = new ArrayList<String[]>();
			for(int j=i;j<length;j++)
			{
				String[] lineData = dicData.get(j).split(" /// ");
				lineData[0] = lineData[0].toLowerCase();
				firstword = String.valueOf(lineData[0].charAt(0));
				if(!firstwordselecter.equals(firstword))
				{
					dicDataMap.put(firstwordselecter, dataList);
					firstwordselecter = firstword;
					i=j-1;
					break;
				}
				lineData[1] = toWordClass(lineData[1]);
				dataList.add(lineData);
			}
		}
		return dicDataMap;
	}
	
	private String toWordClass(String word)
	{
		String[] targetArray = {"n.","prep.","pron.","v.","vt.","vi.","a.","ad."};
		String[] changeArray = {"[명사]","[전치사]","[대명사]","[동사]","[타동사]","[자동사]","[형용사]","[부사]"};
		mainloop:
		while(true)
		{
			for(int i=0;i<targetArray.length;i++)
			{
				int targetIndex = word.indexOf(targetArray[i]);
				if(targetIndex!=-1)
				{
					String preWord = "";
					String postWord = "";
					if(targetIndex!=0)
					{
						preWord = word.substring(0, targetIndex);
					}
					int targetEnd = targetIndex+targetArray[i].length();
					postWord = word.substring(targetEnd);
					word = preWord+changeArray[i]+postWord;
					continue mainloop;
				}
			}
			break;
		}
		return word;
	}

}
