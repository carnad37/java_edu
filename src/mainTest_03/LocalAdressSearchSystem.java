package mainTest_03;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class LocalAdressSearchSystem {
	
	private String[][] adressData;
	private int dataRowLength;
	private int dataLineLength;
	private boolean exitFlag = false;
	LocalAdressSearchSystem(List<String> list)
	{		
		setArray(list);
	}
	private void setArray(List<String> list)
	{
		dataRowLength = 5;
		dataLineLength = list.size();
		adressData = new String[dataLineLength][dataRowLength];
		for(int i=0; i<dataLineLength; i++)
		{
			String target = list.get(i);
			String[] targetData = target.split(",");
			for(int j=0; j<dataRowLength; j++)
			{
				adressData[i][j]=targetData[j];
			}
		}
	}
	
	
	public void mainSystem()
	{
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
			distributeSevice(selectInputSystem(scan), scan);
			System.out.println("");
			if(exitFlag)
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
	
	private void distributeSevice(int selectNum, Scanner scan)
	{
		switch(selectNum)
		{
		case 1:
			roadNameSearch(scan);
			break;
		case 2:
			localNumberSearch(scan);
			break;
		case 3:
			postNumberSearch(scan);
			break;
		case 4: exitFlag = true;
		}
	}
	
	private void roadNameSearch(Scanner scan)
	{
		while(true)
		{
			boolean zeroData = true;
			System.out.print("���θ��� �Է����ּ��� : ");
			String roadName = scan.nextLine();
			for(int i=1;i<this.dataLineLength;i++)
			{
				String checker = adressData[i][3];
				if(roadName.equals(checker))
				{
					System.out.println("\t: "+adressData[i][0]+"\t"+adressData[i][4]);
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
	
	private void localNumberSearch(Scanner scan)
	{
		while(true)
		{
			boolean zeroData = true;
			System.out.print("���������� �Է����ּ��� : ");
			String localNumber = scan.nextLine();
			for(int i=1;i<this.dataLineLength;i++)
			{
				String checker = adressData[i][4];
				if(localNumber.equals(checker))
				{
					System.out.println("\t: "+adressData[i][0]+"\t"+adressData[i][3]);
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
	
	public void postNumberSearch(Scanner scan)
	{
		while(true)
		{
			boolean zeroData = true;
			System.out.print("�����ȣ�� �Է����ּ��� : ");
			String postNumber = scan.nextLine();
			for(int i=1;i<this.dataLineLength;i++)
			{
				String checker = adressData[i][0];
				if(postNumber.equals(checker))
				{
					System.out.printf("\t: %s%8s\t%s%10s%n",adressData[i][1],adressData[i][2],adressData[i][3],adressData[i][4]);
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
