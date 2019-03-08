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
		
		System.out.println("�ּ� �˻� �ý����Դϴ�.");
		System.out.println("���Ͻô� �˻� ���񽺸� �������ֽʽÿ�.");
		while(true)
		{
			System.out.println("=========================================");
			System.out.println("1. ���θ����� �˻�");
			System.out.println("2. ������������ �˻�");
			System.out.println("3. �����ȣ�� �˻�");
			System.out.println("4. �ý��� ����");
			System.out.println("=========================================");
			int inputNum = selectInputSystem(scan);
			distributeSevice(dataListSize, inputNum, scan);
			System.out.println("");
			if(exitFlag)
			{
				scan.close();
				System.out.println("�ý����� �����մϴ�.");
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
			System.out.print("���θ��� �Է����ּ��� : ");
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
				System.out.println("�������� �ʴ� ���θ��Դϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");
				System.out.println("");
			}
			else
			{
				System.out.println("�˻��� ����� �̻��Դϴ�.");
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
			System.out.print("���������� �Է����ּ��� : ");
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
				System.out.println("�������� �ʴ� ���������Դϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");
				System.out.println("");
			}
			else
			{
				System.out.println("�˻��� ����� �̻��Դϴ�.");
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
			System.out.print("�����ȣ�� �Է����ּ��� : ");
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
				System.out.println("�������� �ʴ� �����ȣ�Դϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");
				System.out.println("");
			}
			else
			{
				System.out.println("�˻��� ����� �̻��Դϴ�.");
				System.out.println("");
				break;
			}			
		}
	}	
}
