package researchProgram_Process;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CreateResearchDB
{
	public void createDB(Map<String,List<String>> researchDB, String mainPath)
	{
		while(true)
		{			
			System.out.println("=======================================");
			System.out.println("�������� ����� �������ּ���.");
			System.out.println("=======================================");
			String[] dbData = setResearchData(researchDB);
			printInputData(dbData);
			
			System.out.println("�� ������ �Է��Ͻðڽ��ϱ�?");
			boolean answer = MainSystem.setAnswer();
			if(answer)
			{
				setCurrentDBMap(researchDB, dbData);
				SystemValue sValue = new SystemValue();
				sValue.saveDataToDB(dbData, mainPath);
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
	
	private void setCurrentDBMap(Map<String,List<String>> researchDB, String[] dbData)
	{
		String key = dbData[0];
		List<String> value = new ArrayList<String>();
		for(int i=1;i<dbData.length;i++)
		{
			value.add(dbData[i]);
		}
		researchDB.put(key, value);
	}
	
	private void printInputData(String[] arrayData)
	{
		String[] fomatName = {"���� �����", "�Ƿ�ó", "�����о�", "���� ����","������","������"};
		System.out.println("=======================================");
		for(int i=0;i<arrayData.length;i++)
		{
			System.out.println(fomatName[i]+" : "+arrayData[i]);
		}
		System.out.println("=======================================");
	}
	
	private String[] setResearchData(Map<String,List<String>> researchDB)
	{
		Set<String> keySet = researchDB.keySet();
		String[] researchData = new String[6];
		researchData[0] = setResearchName(keySet);
		researchData[1] = setCustomer();
		researchData[2] = setResearchSubject();
		researchData[3] = setQuestionNumber();
		int[]opendate = setOpendate();
		int[]closedate = setClosedate(opendate);
		researchData[4] = dateArrayToString(opendate);
		researchData[5] = dateArrayToString(closedate);
		return researchData;
	}

	private String setCustomer()
	{
		System.out.println("�Ƿ�ó�� �Է����ּ���.");
		while(true)
		{
			System.out.print(">");
			String customer = MainSystem.scan.nextLine();
			boolean wordCheck = MainSystem.banBlank(customer);
			if(wordCheck)
			{
				System.out.println("��ĭ�� �ԷµǾ����ϴ�.");
				continue;
			}
			return customer;
		}
	}
	
	private String setResearchName(Set<String> keySet)
	{
		String researchName=null;
		System.out.println("���������̸��� �Է����ּ���.");
		mainLoop:
		while(true)
		{			
		System.out.print(">");
		researchName = MainSystem.scan.nextLine();
		boolean wordCheck = MainSystem.banBlank(researchName);
		if(wordCheck)
		{
			System.out.println("��ĭ�� �ԷµǾ����ϴ�.");
			continue;
		}
		for(String compareName : keySet)
		{
			if(compareName.equals(researchName))
			{
				System.out.println("�̹� ��ϵ� ���������Դϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");
				continue mainLoop;
			}
		}
		return researchName;
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
	
	private String setQuestionNumber()
	{
		System.out.println("������ ������ �Է����ּ���.");
		int qNumber = MainSystem.selectInputSystem(1, 500);
		String questionNumber = String.valueOf(qNumber);

		return questionNumber;
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
