package mainTest_03;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class LocalAdressSearchSystemNew
{
	
	public void mainSystem(List<String> list)
	{
		Scanner scan = new Scanner(System.in);
		
		List<Map<String, String>> adressDataList = new ArrayList<Map<String, String>>();
		setLocalAdressData(adressDataList, list);

		boolean exitFlag = false;
		int dataListSize = adressDataList.size();
		
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
			distributeSevice(dataListSize, inputNum, scan);
			System.out.println("");
			if(exitFlag)
			{
				scan.close();
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}
	}
	private void setLocalAdressData(List<Map<String, String>> adressDataList, List<String> list)
	{
		String[] nameArray = list.get(0).split(",");
		int arrayLength = nameArray.length;
		for(int i=1;i<list.size();i++)
		{
			Map<String,String> adressData = new HashMap<String,String>();
			String[] targetArray = list.get(i).split(",");
			for(int j=0;j<arrayLength;j++)
			{
				adressData.put(nameArray[i],targetArray[i]);
			}
			adressDataList.add(adressData);
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
	
	private void distributeSevice(List<Map<String, String>> adressDataList, int selectNum, Scanner scan)
	{
		switch(selectNum)
		{
		case 1:
			roadNameSearch(dataListSize, scan);
			break;
		case 2:
			localNumberSearch(dataListSize, scan);
			break;
		case 3:
			postNumberSearch(dataListSize, scan);
			break;
		case 4: laValue.exitFlag = true;
		}
	}
	
	private void roadNameSearch(int dataListSize, Scanner scan)
	{
		while(true)
		{
			boolean zeroData = true;
			System.out.print("도로명을 입력해주세요 : ");
			String roadName = scan.nextLine();
			for(int i=0;i<dataListSize;i++)
			{
				String checker = laValue.adressData[i][3];
				if(roadName.equals(checker))
				{
					System.out.println("\t: "+laValue.adressData[i][0]+"\t"+laValue.adressData[i][4]);
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
	
	private void localNumberSearch(int dataListSize, Scanner scan)
	{
		while(true)
		{
			boolean zeroData = true;
			System.out.print("지번본번을 입력해주세요 : ");
			String localNumber = scan.nextLine();
			for(int i=1;i<laValue.dataLineLength;i++)
			{
				String checker = laValue.adressData[i][4];
				if(localNumber.equals(checker))
				{
					System.out.println("\t: "+laValue.adressData[i][0]+"\t"+laValue.adressData[i][3]);
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
	
	public void postNumberSearch(int dataListSize, Scanner scan)
	{
		while(true)
		{
			boolean zeroData = true;
			System.out.print("우편번호를 입력해주세요 : ");
			String postNumber = scan.nextLine();
			for(int i=1;i<laValue.dataLineLength;i++)
			{
				String checker = laValue.adressData[i][0];
				if(postNumber.equals(checker))
				{
					System.out.printf("\t: %s%8s\t%s%10s%n",laValue.adressData[i][1],laValue.adressData[i][2],laValue.adressData[i][3],laValue.adressData[i][4]);
//					System.out.println("\t: "+adressData[i][1]+"\t"+adressData[i][2]+"\t"+adressData[i][3]+"\t"+adressData[i][4]);
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
