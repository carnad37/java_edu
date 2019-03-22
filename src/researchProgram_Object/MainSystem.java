package researchProgram_Object;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainSystem
{
	public static final boolean PASS = true;
	public static final boolean ERROR = false;
	public static final int NOT_HAVE_TARGET = -1;
	static Scanner scan;
	
	public MainSystem()
	{
		scan = new Scanner(System.in);
	}
	
	public void mainSystem(Map<String,Research> researchDB, String mainPath)
	{		
		System.out.println("=======================================");
		System.out.println("�������� �ý��� ����");
		while(true)
		{
			System.out.println("=======================================");
			System.out.println("1. �������� ���� ����ϱ�");
			System.out.println("2. �������� ���� Ȯ���ϱ�");
			System.out.println("3. �������� �� ���/Ȯ���ϱ�");
			System.out.println("4. �������� ������غ���");
			System.out.println("5. ����");
			System.out.println("=======================================");
			int select = selectInputSystem(1,4);
			boolean exitFlag = distributeSevice(select,researchDB,mainPath);
			if(exitFlag)
			{
				System.out.println("���� �����Ͻðڽ��ϱ�?");
				boolean answer = setAnswer();
				if(answer)
				{
					return;
				}
			}
		}		
	}
	
	private boolean distributeSevice(int select, Map<String,Research> researchDB, String mainPath)
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
			setResearch.setResearch(mainPath, researchDB);
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
					System.out.println("�߸��� �Է��Դϴ�.");
				}
				else
				{
					break;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("�߸��� �Է��Դϴ�.");
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
				System.out.println("�߸��� �Է��Դϴ�.");
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
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
	
	public static String setResearch(Iterator<String> researchTitle)
	{	
	List<String> titleList = new ArrayList<String>();
	int titleNumber= 1;	
	while(researchTitle.hasNext())
	{			
		String currenttitle = researchTitle.next();
		System.out.println(titleNumber+"."+currenttitle);
		titleList.add(currenttitle);
		titleNumber++;
	}
	System.out.println("���Ͻô� �������� ��ȣ�� �������ּ���");
	System.out.print(">");
	int selecttitle = MainSystem.selectInputSystem(1, titleNumber);
	String targettitle = titleList.get(selecttitle-1);
	return targettitle;
	}
	
	
	private void printDBData(Map<String,Research> researchDB)
	{
		Set<String> keySet = researchDB.keySet();
		String targettitle = setResearch(keySet.iterator());
		Research research = researchDB.get(targettitle);
		research.printResearchSummary();
	}
	
	public static boolean wordChecker(String target, String banWord)
	{
		boolean blankCheck = banBlank(target);
		if(blankCheck==ERROR)
		{
			return ERROR;
		}
		int result = target.indexOf(banWord);
		if(result==NOT_HAVE_TARGET)
		{
			return PASS;
		}
		System.out.println("���ԵǼ��� �ȵǴ� ���ڰ� ���ԵǾ��ֽ��ϴ�.");
		return ERROR;
	}
	
	public static boolean banBlank(String word)
	{
		if(word.equals(""))
		{
			System.out.println("��ĭ�� �ԷµǾ����ϴ�.");
			return ERROR;
		}
		return PASS;
	}
}
