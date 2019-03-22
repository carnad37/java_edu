package researchProgram_Object;

import java.util.Map;
import java.util.Set;

public class CreateResearchDB
{
	static final boolean ERROR = MainSystem.ERROR;
	static final boolean PASS = MainSystem.PASS;
	
	public void createDB(Map<String,Research> researchDB, String mainPath)
	{
		while(true)
		{			
			System.out.println("=======================================");
			System.out.println("�������� ����� �������ּ���.");
			System.out.println("=======================================");
			Research research = setResearchData(researchDB);
			research.printResearchSummary();
			System.out.println("�� ������ �Է��Ͻðڽ��ϱ�?");
			boolean answer = MainSystem.setAnswer();
			if(answer)
			{
				String key = research.getTitle();
				researchDB.put(key, research);
				SystemValue sValue = new SystemValue();
				sValue.saveDataToDB(research, mainPath);
				return;
			}
			System.out.println("�ٽ� �Է��Ͻðڽ��ϱ�?");
			answer = MainSystem.setAnswer();
			if(!answer)
			{
				return;
			}
		}
	}	
		
	private Research setResearchData(Map<String,Research> researchDB)
	{
		Set<String> keySet = researchDB.keySet();
		String title = setResearchtitle(keySet);
		String customer = setCustomer();
		String subject = setResearchSubject();
		String questionNumber = String.valueOf(setQuestionNumber());
		int[]opendateArray = setOpendate();
		int[]closedateArray = setClosedate(opendateArray);
		String opendate = dateArrayToString(opendateArray);
		String closedate = dateArrayToString(closedateArray);
		Research research = new Research(title, customer, subject, questionNumber, opendate, closedate);
		return research;
	}

	private String setCustomer()
	{
		System.out.println("�Ƿ�ó�� �Է����ּ���.");
		while(true)
		{
			System.out.print(">");
			String customer = MainSystem.scan.nextLine();
			boolean wordCheck = MainSystem.banBlank(customer);
			if(wordCheck==ERROR)
			{
				System.out.println("��ĭ�� �ԷµǾ����ϴ�.");
				continue;
			}
			return customer;
		}
	}
	
	private String setResearchtitle(Set<String> keySet)
	{
		String researchtitle=null;
		System.out.println("���������̸��� �Է����ּ���.");
		mainLoop:
		while(true)
		{			
		System.out.print(">");
		researchtitle = MainSystem.scan.nextLine();
		boolean wordCheck = MainSystem.banBlank(researchtitle);
		if(wordCheck)
		{
			System.out.println("��ĭ�� �ԷµǾ����ϴ�.");
			continue;
		}
		for(String comparetitle : keySet)
		{
			if(comparetitle.equals(researchtitle))
			{
				System.out.println("�̹� ��ϵ� ���������Դϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");
				continue mainLoop;
			}
		}
		return researchtitle;
		}
	}
	
	private String setResearchSubject()
	{
		System.out.println("�������� �о߸� �������ּ���.");
		System.out.println("---------------------------------------");
		System.out.println("1. �ι�");
		System.out.println("2. ��ȸ");
		System.out.println("3. ����");
		System.out.println("4. ���");
		System.out.println("5. ����");
		System.out.println("---------------------------------------");
		int select = MainSystem.selectInputSystem(1, 5);
		String researchSubject = null;
		switch(select)
		{
			case 1:
				researchSubject = "�ι�";
				break;
			case 2:
				researchSubject = "��ȸ";
				break;
			case 3:
				researchSubject = "����";
				break;
			case 4:
				researchSubject = "���";
				break;
			case 5:
				researchSubject = "����";
				break;
		}
		return researchSubject;
	}
	
	private int setQuestionNumber()
	{
		System.out.println("������ ������ �Է����ּ���.");
		int qNumber = MainSystem.selectInputSystem(1, 500);

		return qNumber;
	}	

	private int[] setOpendate()
	{
		System.out.println("���� �������� �Է����ּ���.");
		System.out.print("Year");
		int year = MainSystem.selectInputSystem(2018, 2030);
		System.out.print("Month");
		int month = MainSystem.selectInputSystem(1, 12);
		System.out.print("Day");
		int day = MainSystem.selectInputSystem(1, 31);
		int[] opendate = {year,month,day};
		return opendate;
	}
	
	private int[] setClosedate(int[] opendate)
	{
		System.out.println("���� �������� �Է����ּ���.");
		int openYear = opendate[0];
		int openMonth = opendate[1];
		int openDay = opendate[2];
		int year=0,month=0,day=0;
		boolean sameTime = false;
		
		System.out.println("(������ : "+openYear+"."+openMonth+"."+openDay+")");
		
		while(true)
		{
			System.out.print("Year");
			year = MainSystem.selectInputSystem(2018, 2030);
			if(year<openYear)
			{
				System.out.println("���۳⵵ ���ĸ� �������ּ���.");
			}
			else if(year==openYear)
			{
				sameTime = true;
				break;
			}
			else
			{
				break;
			}
		}		
		while(true)
		{
			System.out.print("Month");
			month = MainSystem.selectInputSystem(1, 12);
			if(sameTime)
			{
				if(openMonth>month)
				{
					System.out.println("������ �����Դϴ�.");
					continue;
				}
				else if(openMonth<month)
				{
					sameTime = false;
					break;
				}
				else
				{
					break;
				}
			}
			else
			{
				break;

			}
		}
		while(true)
		{
			System.out.print("Day");
			day = MainSystem.selectInputSystem(1, 31);
			if(sameTime)
			{
				if(openDay>day)
				{
					System.out.println("������ �����Դϴ�.");
				}
				else
				{
					break;
				}
			}
			else
			{
				break;
			}
		}
		int[] closedate = {year,month,day};
		return closedate;
	}
	
	private String dateArrayToString(int[] dateArray)
	{
		String year = String.valueOf(dateArray[0]);
		String month = String.valueOf(dateArray[1]);
		String day = String.valueOf(dateArray[2]);
		String date = year+"."+month+"."+day;
		return date;
	}
}
