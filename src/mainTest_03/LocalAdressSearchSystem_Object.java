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
			distributeSevice(laValue, inputNum, scan);
			System.out.println("");
			if(laValue.exitFlag)
			{
				scan.close();
				System.out.println("�ý����� �����մϴ�.");
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
			String checker = "���θ�";
			
			System.out.print(checker+"�� �Է����ּ��� : ");
			
			String roadName = scan.nextLine();
			for(int i=1;i<laValue.dataLineLength;i++)
			{
				String compareWord = laValue.adressDataList.get(i).get(checker);
				if(roadName.equals(compareWord))
				{
					System.out.println("\t: "+laValue.adressDataList.get(i).get("�����ȣ")+"\t"+laValue.adressDataList.get(i).get("��������"));
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
	
	private void localNumberSearch(LocalAdressValue_Map laValue, Scanner scan)
	{
		while(true)
		{
			boolean zeroData = true;
			String checker = "��������";			
			
			System.out.print(checker+"�� �Է����ּ��� : ");
			
			String roadName = scan.nextLine();
			for(int i=1;i<laValue.dataLineLength;i++)
			{
				String compareWord = laValue.adressDataList.get(i).get(checker);
				if(roadName.equals(compareWord))
				{
					System.out.println("\t: "+laValue.adressDataList.get(i).get("�����ȣ")+"\t"+laValue.adressDataList.get(i).get("���θ�"));
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
	
	public void postNumberSearch(LocalAdressValue_Map laValue, Scanner scan)
	{
		while(true)
		{
			boolean zeroData = true;
			String checker = "�����ȣ";			
			
			System.out.print(checker+"�� �Է����ּ��� : ");
			
			String roadName = scan.nextLine();
			for(int i=1;i<laValue.dataLineLength;i++)
			{
				String compareWord = laValue.adressDataList.get(i).get(checker);
				if(roadName.equals(compareWord))
				{
					System.out.println("\t: "+laValue.adressDataList.get(i).get("�õ�")+"    "+laValue.adressDataList.get(i).get("�ñ���")+"\t"+laValue.adressDataList.get(i).get("���θ�")+"\t"+laValue.adressDataList.get(i).get("��������"));
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
