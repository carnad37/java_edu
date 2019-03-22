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
			System.out.println("설문조사 등록을 진행해주세요.");
			System.out.println("=======================================");
			String[] dbData = setResearchData(researchDB);
			printInputData(dbData);
			
			System.out.println("위 내용대로 입력하시겠습니까?");
			boolean answer = MainSystem.setAnswer();
			if(answer)
			{
				setCurrentDBMap(researchDB, dbData);
				SystemValue sValue = new SystemValue();
				sValue.saveDataToDB(dbData, mainPath);
				return;
			}
			System.out.println("다시 입력하시겠습니까?");
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
		String[] fomatName = {"설문 조사명", "의뢰처", "설문분야", "질문 갯수","시작일","종료일"};
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
		System.out.println("의뢰처를 입력해주세요.");
		while(true)
		{
			System.out.print(">");
			String customer = MainSystem.scan.nextLine();
			boolean wordCheck = MainSystem.banBlank(customer);
			if(wordCheck)
			{
				System.out.println("빈칸이 입력되었습니다.");
				continue;
			}
			return customer;
		}
	}
	
	private String setResearchName(Set<String> keySet)
	{
		String researchName=null;
		System.out.println("설문조사이름을 입력해주세요.");
		mainLoop:
		while(true)
		{			
		System.out.print(">");
		researchName = MainSystem.scan.nextLine();
		boolean wordCheck = MainSystem.banBlank(researchName);
		if(wordCheck)
		{
			System.out.println("빈칸이 입력되었습니다.");
			continue;
		}
		for(String compareName : keySet)
		{
			if(compareName.equals(researchName))
			{
				System.out.println("이미 등록된 설문조사입니다.");
				System.out.println("다시 입력해주세요.");
				continue mainLoop;
			}
		}
		return researchName;
		}
	}
	
	private String setResearchSubject()
	{
		System.out.println("설문조사 분야를 선택해주세요.");
		System.out.println("---------------------------------------");
		System.out.println("1. 인문");
		System.out.println("2. 사회");
		System.out.println("3. 과학");
		System.out.println("4. 농업");
		System.out.println("5. 경제");
		System.out.println("---------------------------------------");
		int select = MainSystem.selectInputSystem(1, 5);
		String researchSubject = null;
		switch(select)
		{
			case 1:
				researchSubject = "인문";
				break;
			case 2:
				researchSubject = "사회";
				break;
			case 3:
				researchSubject = "과학";
				break;
			case 4:
				researchSubject = "농업";
				break;
			case 5:
				researchSubject = "경제";
				break;
		}
		return researchSubject;
	}
	
	private String setQuestionNumber()
	{
		System.out.println("질문의 갯수를 입력해주세요.");
		int qNumber = MainSystem.selectInputSystem(1, 500);
		String questionNumber = String.valueOf(qNumber);

		return questionNumber;
	}
	

	private int[] setOpendate()
	{
		System.out.println("조사 시작일을 입력해주세요.");
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
		System.out.println("조사 마감일을 입력해주세요.");
		int openYear = opendate[0];
		int openMonth = opendate[1];
		int openDay = opendate[2];
		int year=0,month=0,day=0;
		boolean sameTime = false;
		
		System.out.println("(시작일 : "+openYear+"."+openMonth+"."+openDay+")");
		
		while(true)
		{
			System.out.print("Year");
			year = MainSystem.selectInputSystem(2018, 2030);
			if(year<openYear)
			{
				System.out.println("시작년도 이후를 선택해주세요.");
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
					System.out.println("시작일 이전입니다.");
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
					System.out.println("시작일 이전입니다.");
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
