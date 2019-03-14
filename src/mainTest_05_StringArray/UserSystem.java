package mainTest_05_StringArray;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserSystem
{
	public void userSystem(int userIndex,  List<Map<String, String>> userdata, List<String> list, Scanner scan, String userDataPath)
	{
		System.out.println("======================================");
		System.out.println("���� ������ �Դϴ�.");
		while(true)
		{
			System.out.println("======================================");
			System.out.println("");
			System.out.println("1.��й�ȣ ����");
			System.out.println("2.�̸����ּ� ����");
			System.out.println("3.�ּ� �� ���ּ� ����");
			System.out.println("4.��ȭ��ȣ ����");
			System.out.println("5.����");
			System.out.println("");
			System.out.println("======================================");
			int select = selectInputSystem(scan);
			boolean exitFlag = distributeSevice(userIndex,select,scan,userDataPath,list,userdata);
			if(exitFlag)
			{
				System.out.println("�α׾ƿ��մϴ�.");
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
				if(selectNum<1||selectNum>5)
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
	
	private boolean distributeSevice(int userIndex, int selectNum, Scanner scan, String userDataPath, List<String> list, List<Map<String,String>> userdata)
	{
		switch(selectNum)
		{
		case 1:
			setPassWord(userIndex,scan,userDataPath,list,userdata);
			break;
		case 2:
			setEmail(userIndex,scan,userDataPath,list,userdata);
			break;
		case 3:
			setAdress(userIndex,scan,userDataPath,list,userdata);
			break;
		case 4: 
			setPhoneNumber(userIndex,scan,userDataPath,list,userdata);
			break;
		case 5: return true;
		}
		return false;
	}
	
	private void setPassWord(int userNumber, Scanner scan, String userDataPath, List<String> list, List<Map<String, String>> userdata)
	{
		System.out.println("������ ��й�ȣ�� �Է����ּ���.");
		String newPW=null;
		mainLoop:
		while(true)
		{
			System.out.print(">");
			newPW = scan.nextLine();
			System.out.println("��й�ȣ�� Ȯ�����ּ���.");
			for(int i=3;i>0;i--)
			{
				System.out.print(">");
				String pwCheck = scan.nextLine();
				if(newPW.equals(pwCheck))
				{
					break mainLoop;
				}
				else
				{
					System.out.println("�߸��� ��й�ȣ�Դϴ�.");
					System.out.println("�ٽ� �Է����ּ���.");
					System.out.println("(���� Ȯ�� Ƚ�� : "+(i-1)+"ȸ)");
				}
			}
			System.out.println("������ ��й�ȣ�� �ٽ� �Է����ּ���.");
		}
		String rawData = list.get(userNumber);
		String oldPW = userdata.get(userNumber).get("��й�ȣ");
		rawData = rawData.replace(oldPW, newPW);
		list.set(userNumber, rawData);

		FileWrite filewrite = new FileWrite();
		filewrite.writeSystem(list, userDataPath);
		return;
	}
	
	private void setEmail(int userIndex, Scanner scan, String userDataPath, List<String> list, List<Map<String,String>> userdata)
	{
		String newEmail=null;
		while(true)
		{
			System.out.println("������ �̸����� �Է����ּ���.");
			System.out.print(">");
			newEmail = scan.nextLine();
			System.out.println("");
			System.out.println("�̸��� : "+newEmail);
			System.out.println("�Է��Ͻ� ������ �����ʴϱ�?");
			boolean answer = setAnswer(scan);
			if(answer)
			{
				break;
			}
			else
			{
				System.out.println("�ٽ� �Է����ּ���.");
				System.out.println("");
			}
		}
		
		String rawData = list.get(userIndex);
		String oldEmail = userdata.get(userIndex).get("�̸���");
		rawData = rawData.replace(oldEmail, newEmail);
		list.set(userIndex, rawData);

		FileWrite filewrite = new FileWrite();
		filewrite.writeSystem(list, userDataPath);
		return;
	}
	
	private void setPhoneNumber(int userNumber, Scanner scan, String userDataPath, List<String> list, List<Map<String,String>> userdata)
	{
		String newPN=null;
		while(true)
		{
			System.out.println("������ �̸����� �Է����ּ���.");
			System.out.print(">");
			newPN = scan.nextLine();
			System.out.println("");
			System.out.println("��ȭ��ȣ : "+newPN);
			System.out.println("�Է��Ͻ� ������ �����ʴϱ�?");
			boolean answer = setAnswer(scan);
			if(answer)
			{
				break;
			}
			else
			{
				System.out.println("�ٽ� �Է����ּ���.");
				System.out.println("");
			}
		}
		
		String rawData = list.get(userNumber);
		String oldPN = userdata.get(userNumber).get("�̸���");
		rawData = rawData.replace(oldPN, newPN);
		list.set(userNumber, rawData);

		FileWrite filewrite = new FileWrite();
		filewrite.writeSystem(list, userDataPath);
		return;
	}
	
	private void setAdress(int userNumber, Scanner scan, String userDataPath, List<String> list, List<Map<String,String>> userdata)
	{
		String newAdress1=null, newAdress2=null;
		while(true)
		{
			System.out.println("������ �ּ��� �Է����ּ���.");
			System.out.print(">");
			newAdress1 = scan.nextLine();
			System.out.println("�� �ּ��� �Է����ּ���.");
			System.out.print(">");
			newAdress2 = scan.nextLine();
			System.out.println("");
			System.out.println("�ּ� : "+newAdress1);
			System.out.println("���ּ� : "+newAdress2);
			System.out.println("�Է��Ͻ� ������ �����ʴϱ�?");
			boolean answer = setAnswer(scan);
			if(answer)
			{
				break;
			}
			else
			{
				System.out.println("�ٽ� �Է����ּ���.");
				System.out.println("");
			}
		}
	
		String rawData = list.get(userNumber);
		String oldAdress1 = userdata.get(userNumber).get("�ּ�");
		String oldAdress2 = userdata.get(userNumber).get("���ּ�");
		rawData = rawData.replace(oldAdress1, newAdress1);
		rawData = rawData.replace(oldAdress2, newAdress2);

		list.set(userNumber, rawData);

		FileWrite filewrite = new FileWrite();
		filewrite.writeSystem(list, userDataPath);
		return;
	}
	
	private boolean setAnswer(Scanner scan)
	{
		while(true)
		{
			System.out.print("(y/n) >");
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
}
