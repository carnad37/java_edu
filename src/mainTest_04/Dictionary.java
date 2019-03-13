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
			System.out.println("1.���� �˻�");
			System.out.println("2.�ѿ� �˻�");
			System.out.println("3.����\n");
			System.out.println("=================================================");
			System.out.println("�޴��� �������ּ���.");
			int select = selectInputSystem(scan);
			if(select==3)
			{
				scan.close();
				System.out.println("�ý����� �����մϴ�.");
				break;
			}
			System.out.println("�˻��� �ܾ �Է����ּ���.");
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
					lineData[1] = lineData[1];	//[1] ���� �ִ��� Ȯ��
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
					//�ѱ���� ��ȯ�� ���� �ʴ� �ܾ�
				}
			}
		}
		return dicDataMap;
	}
	
	private String toWordClass(String word)
	{
		String[] targetArray = {"n.","prep.","pron.","v.","vt.","vi.","a.","ad.","adj.","pref.","int."};
		String[] changeArray = {"[���]","[��ġ��]","[����]","[����]","[Ÿ����]","[�ڵ���]","[�����]","[�λ�]","[�����]","[���λ�]","[��ź��]"};
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
				//*value : value�� ������ ����ܾ�.
				searchWord = searchWord.substring(1);
				endIncludeDicSearch(searchWord, dicDataMap);
			}
			else if(resIndex==searchWord.length()-1)
			{
				//value* : value�� �����ϴ� ����ܾ�.
				searchWord = searchWord.substring(0,searchWord.length()-1);
				firstIncludeDicSearch(searchWord, dicDataMap);

			}
			else if(resIndex==-1)
			{
				//*�� ���Ե��� ���� �Ϲݰ˻�.
				engToKorDicSearch(searchWord, dicDataMap);
			}
			else
			{
				//�߸��� ��ġ�� *�� ����.				
				System.out.println("�߸��� �˻����Դϴ�.");
				System.out.println("");
			}	
		}
		else
		{
			//�ѿ��˻�
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
					System.out.println("�߸��� �Է��Դϴ�.");
					System.out.println("");

				}
				else
				{
					break;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("�߸��� �Է��Դϴ�.");
				System.out.println("");

			}
		}
		return selectNum;		
	}

	private void engToKorDicSearch(String searchWord, Map<String, List<String[]>> dicDataMap)
	{
		String firstWord = String.valueOf(searchWord.charAt(0));
		List<String[]> dataList = dicDataMap.get(firstWord);
		String meaning = "�˻������ �����ϴ�.";		
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
			System.out.println("�˻������ �����ϴ�.");
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
			System.out.println("�˻������ �����ϴ�.");
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
			System.out.println("�˻������ �����ϴ�.");
			System.out.println("");
		}
	}	
}
