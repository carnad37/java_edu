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
	
	public static boolean wordChecker(String target, String banWord)
	{
		int result = target.indexOf(banWord);
		if(result==-1)
		{
			return true;
		}
		System.out.println("���ԵǼ��� �ȵǴ� ���ڰ� ���ԵǾ��ֽ��ϴ�.");
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
	System.out.println("���Ͻô� �������� ��ȣ�� �������ּ���");
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
		String[] fomatName = { "�Ƿ�ó", "�����о�", "���� ����","������","������"};

		System.out.println("���� ����� : "+targetName);
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
