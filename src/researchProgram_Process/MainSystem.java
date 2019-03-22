package researchProgram_Process;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainSystem
{
	static Scanner scan;
	
	public MainSystem()
	{
		scan = new Scanner(System.in);
	}
	
	public void mainSystem(Map<String,List<String>> researchDB, String mainPath)
	{		
		System.out.println("=======================================");
		System.out.println("설문조사 시스템 관리");
		while(true)
		{
			System.out.println("=======================================");
			System.out.println("1. 설문조사 개요 등록하기");
			System.out.println("2. 설문조사 개요 확인하기");
			System.out.println("3. 설문조사 상세 등록/확인하기");
			System.out.println("4. 설문조사 실행※준비중");
			System.out.println("5. 종료");
			System.out.println("=======================================");
			int select = selectInputSystem(1,4);
			boolean exitFlag = distributeSevice(select,researchDB,mainPath);
			if(exitFlag)
			{
				System.out.println("정말 종료하시겠습니까?");
				boolean answer = setAnswer();
				if(answer)
				{
					return;
				}
			}
		}		
	}
	
	private boolean distributeSevice(int select, Map<String,List<String>> researchDB, String mainPath)
	{
		switch(select)
		{
		case 1:
			CreateResearchDB createDB = new CreateResearchDB();
			createDB.createDB(researchDB, mainPath);
			break;
		case 2:
			printDBData(researchDB);
			break;
		case 3:
			ReserchSetting setResearch = new ReserchSetting();
			setResearch.setResearch(researchDB, mainPath);
			break;
		case 4:
			StartResearch research = new StartResearch();
			research.runResearchSystem();
			break;
		case 5: return true;
		}
		return false;
	}

	
	public static int selectInputSystem(int start, int end)
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
				if(selectNum<start||selectNum>end)
				{
					System.out.println("잘못된 입력입니다.");
				}
				else
				{
					break;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("잘못된 입력입니다.");
			}
		}
		return selectNum;		
	}
	
	public static boolean setAnswer()
	{
		while(true)
		{
			System.out.print("(y/n) > ");
			String select = scan.nextLine();
			if(select.length()>1)
			{
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			select = select.toLowerCase();
			if(select.equals("y"))
			{
				return true;
			}
			else if(select.equals("n"))
			{
				return false;
			}
			else
			{
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
	
	public static boolean wordChecker(String target, String banWord)
	{
		int result = target.indexOf(banWord);
		if(result==-1)
		{
			return true;
		}
		System.out.println("포함되서는 안되는 문자가 포함되어있습니다.");
		return false;
	}
	
	public static String setResearch(Iterator<String> researchName)
	{	
	List<String> nameList = new ArrayList<String>();
	int number = 1;	
	while(researchName.hasNext())
	{			
		String currentName = researchName.next();
		System.out.println(number+"."+currentName);
		nameList.add(currentName);
		number++;
	}
	System.out.println("원하시는 설문조사 번호를 선택해주세요");
	System.out.print(">");
	int selectName = MainSystem.selectInputSystem(1, number);
	String targetName = nameList.get(selectName-1);
	return targetName;
	}
	
	
	private void printDBData(Map<String,List<String>> researchDB)
	{
		Set<String> keySet = researchDB.keySet();
		String targetName = setResearch(keySet.iterator());

		List<String> value = researchDB.get(targetName);
		String[] fomatName = { "의뢰처", "설문분야", "질문 갯수","시작일","종료일"};

		System.out.println("설문 조사명 : "+targetName);
		for(int i=0;i<value.size();i++)
		{
			System.out.println(fomatName[i]+" : "+value.get(i));
		}
	}
	
	public static boolean banBlank(String word)
	{
		if(word.equals(""))
		{
			return true;
		}
		return false;
	}
}
