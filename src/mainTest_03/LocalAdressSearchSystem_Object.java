package mainTest_03;

import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class LocalAdressSearchSystem_Object
{
	
	public void mainSystem(List<String> list)
	{
		LocalAdressValue_Map laValue = new LocalAdressValue_Map(list);
		Scanner scan = new Scanner(System.in);
		System.out.println("주소 검색 시스템입니다.");
		System.out.println("원하시는 검색 서비스를 선택해주십시오.");
		while(true)
		{
			System.out.println("=========================================");
			System.out.println("1. 도로명으로 검색");
			System.out.println("2. 지번본번으로 검색");
			System.out.println("3. 우편번호로 검색");
			System.out.println("4. 시스템 종료");
			System.out.println("=========================================");
			int inputNum = selectInputSystem(scan);
			distributeSevice(laValue, inputNum, scan);
			System.out.println("");
			if(laValue.exitFlag)
			{
				scan.close();
				System.out.println("시스템을 종료합니다.");
				break;
			}
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
				if(selectNum<1||selectNum>4)
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
	
	private void distributeSevice(LocalAdressValue_Map laValue, int selectNum, Scanner scan)
	{
		switch(selectNum)
		{
		case 1:
			roadNameSearch(laValue, scan);
			break;
		case 2:
			localNumberSearch(laValue, scan);
			break;
		case 3:
			postNumberSearch(laValue, scan);
			break;
		case 4: laValue.exitFlag = true;
		}
	}
	
	private void roadNameSearch(LocalAdressValue_Map laValue, Scanner scan)
	{
		while(true)
		{
			boolean zeroData = true;
			String checker = "도로명";
			
			System.out.print(checker+"을 입력해주세요 : ");
			
			String roadName = scan.nextLine();
			for(int i=1;i<laValue.dataLineLength;i++)
			{
				String compareWord = laValue.adressDataList.get(i).get(checker);
				if(roadName.equals(compareWord))
				{
					System.out.println("\t: "+laValue.adressDataList.get(i).get("우편번호")+"\t"+laValue.adressDataList.get(i).get("지번본번"));
					if(zeroData)zeroData = false;
				}
			}
			if(zeroData)
			{
				System.out.println("존재하지 않는 도로명입니다.");
				System.out.println("다시 입력해주세요.");
				System.out.println("");
			}
			else
			{
				System.out.println("검색된 결과는 이상입니다.");
				System.out.println("");
				break;
			}			
		}
	}
	
	private void localNumberSearch(LocalAdressValue_Map laValue, Scanner scan)
	{
		while(true)
		{
			boolean zeroData = true;
			String checker = "지번본번";			
			
			System.out.print(checker+"을 입력해주세요 : ");
			
			String roadName = scan.nextLine();
			for(int i=1;i<laValue.dataLineLength;i++)
			{
				String compareWord = laValue.adressDataList.get(i).get(checker);
				if(roadName.equals(compareWord))
				{
					System.out.println("\t: "+laValue.adressDataList.get(i).get("우편번호")+"\t"+laValue.adressDataList.get(i).get("도로명"));
					if(zeroData)zeroData = false;
				}
			}
			if(zeroData)
			{
				System.out.println("존재하지 않는 지번본번입니다.");
				System.out.println("다시 입력해주세요.");
				System.out.println("");
			}
			else
			{
				System.out.println("검색된 결과는 이상입니다.");
				System.out.println("");
				break;
			}
		}

	}
	
	public void postNumberSearch(LocalAdressValue_Map laValue, Scanner scan)
	{
		while(true)
		{
			boolean zeroData = true;
			String checker = "우편번호";			
			
			System.out.print(checker+"을 입력해주세요 : ");
			
			String roadName = scan.nextLine();
			for(int i=1;i<laValue.dataLineLength;i++)
			{
				String compareWord = laValue.adressDataList.get(i).get(checker);
				if(roadName.equals(compareWord))
				{
					System.out.println("\t: "+laValue.adressDataList.get(i).get("시도")+"    "+laValue.adressDataList.get(i).get("시군구")+"\t"+laValue.adressDataList.get(i).get("도로명")+"\t"+laValue.adressDataList.get(i).get("지번본번"));
					if(zeroData)zeroData = false;
				}
			}
			if(zeroData)
			{
				System.out.println("존재하지 않는 우편번호입니다.");
				System.out.println("다시 입력해주세요.");
				System.out.println("");
			}
			else
			{
				System.out.println("검색된 결과는 이상입니다.");
				System.out.println("");
				break;
			}
		}
	}	
}
