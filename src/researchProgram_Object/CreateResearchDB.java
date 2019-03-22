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
			System.out.println("설문조사 등록을 진행해주세요.");
			System.out.println("=======================================");
			Research research = setResearchData(researchDB);
			research.printResearchSummary();
			System.out.println("위 내용대로 입력하시겠습니까?");
			boolean answer = MainSystem.setAnswer();
			if(answer)
			{
				String key = research.getTitle();
				researchDB.put(key, research);
				SystemValue sValue = new SystemValue();
				sValue.saveDataToDB(research, mainPath);
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
		System.out.println("의뢰처를 입력해주세요.");
		while(true)
		{
			System.out.print(">");
			String customer = MainSystem.scan.nextLine();
			boolean wordCheck = MainSystem.banBlank(customer);
			if(wordCheck==ERROR)
			{
				System.out.println("빈칸이 입력되었습니다.");
				continue;
			}
			return customer;
		}
	}
	
	private String setResearchtitle(Set<String> keySet)
	{
		String researchtitle=null;
		System.out.println("설문조사이름을 입력해주세요.");
		mainLoop:
		while(true)
		{			
		System.out.print(">");
		researchtitle = MainSystem.scan.nextLine();
		boolean wordCheck = MainSystem.banBlank(researchtitle);
		if(wordCheck)
		{
			System.out.println("빈칸이 입력되었습니다.");
			continue;
		}
		for(String comparetitle : keySet)
		{
			if(comparetitle.equals(researchtitle))
			{
				System.out.println("이미 등록된 설문조사입니다.");
				System.out.println("다시 입력해주세요.");
				continue mainLoop;
			}
		}
		return researchtitle;
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
	
	private int setQuestionNumber()
	{
		System.out.println("질문의 갯수를 입력해주세요.");
		int qNumber = MainSystem.selectInputSystem(1, 500);

		return qNumber;
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
