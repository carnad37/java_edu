package mainTest_04;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public class Dictionary 
{
	
	public void DicMainSystem(List<String> dicData)
	{
		Scanner scan = new Scanner(System.in);
		
		Map<String, List<String[]>> dicDataMap = dicListData(dicData);
		
		while(true)
		{
			System.out.println("=================================================\n");
			System.out.println("1.영한 검색");
			System.out.println("2.한영 검색");
			System.out.println("3.종료\n");
			System.out.println("=================================================");
			System.out.println("메뉴를 선택해주세요.");
			int select = selectInputSystem(scan);
			if(select==3)
			{
				scan.close();
				System.out.println("시스템을 종료합니다.");
				break;
			}
			System.out.println("검색할 단어를 입력해주세요.");
			System.out.print(">");
			String word = scan.nextLine();
			System.out.println("");
			decisionSearch(word, dicDataMap, select);
		}
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
				try
				{
					String[] lineData = dicData.get(j).split(" /// ");
					lineData[1] = lineData[1];	//[1] 값이 있는지 확인
					lineData[0] = lineData[0].toLowerCase();
					firstword = String.valueOf(lineData[0].charAt(0));
					if(!firstwordselecter.equals(firstword))
					{
						dicDataMap.put(firstwordselecter, dataList);
						firstwordselecter = firstword;
						i=j-1;
						break;
					}
					dataList.add(lineData);
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					//한국어로 전환이 되지 않는 단어
				}
			}
		}
		return dicDataMap;
	}
	
	private String toWordClass(String word)
	{
		String[] targetArray = {"n.","prep.","pron.","v.","vt.","vi.","a.","ad.","adj.","pref.","int."};
		String[] changeArray = {"[명사]","[전치사]","[대명사]","[동사]","[타동사]","[자동사]","[형용사]","[부사]","[형용사]","[접두사]","[감탄사]"};
		mainloop:
		while(true)
		{
			for(int i=0;i<targetArray.length;i++)
			{
				int targetIndex = word.indexOf(targetArray[i]);
				if(targetIndex!=-1)
				{
					word = word.replace(targetArray[i], changeArray[i]);
//					String preWord = "";
//					String postWord = "";
//					if(targetIndex!=0)
//					{
//						preWord = word.substring(0, targetIndex);
//					}
//					int targetEnd = targetIndex+targetArray[i].length();
//					postWord = word.substring(targetEnd);
//					word = preWord+changeArray[i]+postWord;
					continue mainloop;
				}
			}
			break;
		}
		return word;
	}	
	
	private void decisionSearch(String searchWord,Map<String, List<String[]>> dicDataMap, int select)
	{
		int resIndex = searchWord.indexOf("*");
		if(select==1)
		{
			if(resIndex==0)
			{
				//*value : value로 끝나는 영어단어.
				searchWord = searchWord.substring(1);
				endIncludeDicSearch(searchWord, dicDataMap);
			}
			else if(resIndex==searchWord.length()-1)
			{
				//value* : value로 시작하는 영어단어.
				searchWord = searchWord.substring(0,searchWord.length()-1);
				firstIncludeDicSearch(searchWord, dicDataMap);

			}
			else if(resIndex==-1)
			{
				//*가 포함되지 않은 일반검색.
				engToKorDicSearch(searchWord, dicDataMap);
			}
			else
			{
				//잘못된 위치에 *가 존재.				
				System.out.println("잘못된 검색어입니다.");
				System.out.println("");
			}	
		}
		else
		{
			//한영검색
			korToEngDicSearch(searchWord, dicDataMap);
		}

	}
	
	private int selectInputSystem(Scanner scan)
	{
		String selectNumString = null;
		int selectNum = 0;
		while(true)
		{
			try
			{
				System.out.print(">");
				selectNumString = scan.nextLine();
				selectNum = Integer.parseInt(selectNumString);
				if(selectNum<1||selectNum>3)
				{
					System.out.println("잘못된 입력입니다.");
					System.out.println("");

				}
				else
				{
					break;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("잘못된 입력입니다.");
				System.out.println("");

			}
		}
		return selectNum;		
	}

	private void engToKorDicSearch(String searchWord, Map<String, List<String[]>> dicDataMap)
	{
		String firstWord = String.valueOf(searchWord.charAt(0));
		List<String[]> dataList = dicDataMap.get(firstWord);
		String meaning = "검색결과가 없습니다.";		
		for(String[] value : dataList)
		{
			if(searchWord.equals(value[0]))
			{
				System.out.println(value[0]);
				meaning = "  : "+toWordClass(value[1]);
				break;
			}
		}
		System.out.println(meaning);
		System.out.println("");
	}
	
	private void firstIncludeDicSearch(String searchWord, Map<String, List<String[]>> dicDataMap)
	{
		String firstWord = String.valueOf(searchWord.charAt(0));
		List<String[]> dataList = dicDataMap.get(firstWord);
		boolean resFlag = true;
		for(String[] value : dataList)
		{
			if(value[0].startsWith(searchWord))
			{
				System.out.println(value[0]);
				String meaning = toWordClass(value[1]);
				System.out.println("  : "+meaning);
				System.out.println("");
				if(resFlag)resFlag=false;
			}
		}
		if(resFlag)
		{
			System.out.println("검색결과가 없습니다.");
			System.out.println("");
		}
	}
	
	private void endIncludeDicSearch(String searchWord, Map<String, List<String[]>> dicDataMap)
	{
		Collection<List<String[]>> collectionList = dicDataMap.values();
		boolean resFlag = true;

		for(List<String[]> dataList : collectionList )
		{
			for(String[] value : dataList)
			{
				if(value[0].endsWith(searchWord))
				{
					System.out.println(value[0]);
					String meaning = toWordClass(value[1]);
					System.out.println("  : "+meaning);
					System.out.println("");
					if(resFlag)resFlag=false;
				}
			}
		}
		if(resFlag)
		{
			System.out.println("검색결과가 없습니다.");
			System.out.println("");
		}
	}
	

	private void korToEngDicSearch(String searchWord,Map<String, List<String[]>> dicDataMap)
	{
		Collection<List<String[]>> collectionList = dicDataMap.values();
		boolean resFlag = true;

		for(List<String[]> dataList : collectionList )
		{
			for(String[] value : dataList)
			{
				int targetIndext = value[1].indexOf(searchWord);
				if(targetIndext!=-1)
				{
					System.out.println(value[0]);
					String meaning = toWordClass(value[1]);
					System.out.println("  : "+meaning);
					System.out.println("");
					if(resFlag)resFlag=false;
				}
			}
		}
		if(resFlag)
		{
			System.out.println("검색결과가 없습니다.");
			System.out.println("");
		}
	}	
}
