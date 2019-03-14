package mainTest_05_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SignInSystem
{
	public void signInSystem(Scanner scan, List<String> list, String userDataPath)
	{
		final String[] formatName = {"���̵�","��й�ȣ","�̸�","�ֹι�ȣ","�̸���","�����ȣ","�ּ�","���ּ�","��ȭ��ȣ","��������"};
		List<Map<String,String>> userdata = setMapList(list, formatName);
		
		System.out.println("======================================");
		System.out.println("�α��� ������ �Դϴ�.");
		System.out.println("======================================");
		int userIndex=0;
		while(true)
		{
			//1�̻� ������. 
			userIndex = mainChecker(userdata, scan);
			if(userIndex==0)
			{
				//�α��ο��� Ȯ��
				System.out.println("�ٽ� �α��� �Ͻðڽ��ϱ�?");
				boolean answer = setAnswer(scan);
				if(answer)
				{
					continue;
				}
				else
				{
					return;
				}
			}
			else
			{
				break;
			}
		}
		//������ ���� Ȯ��
		if(userIndex==1)
		{
			AdminSystem admin = new AdminSystem();
			admin.adminSystem(userdata, list, scan, userDataPath);
			return;
		}
		else
		{
			UserSystem user = new UserSystem();
			user.userSystem(userIndex, userdata, list, scan, userDataPath);
			return;
		}		
//		boolean adminFlag = adminChecker(userdata, userIndex);
//		if(adminFlag)
//		{
//			AdminSystem admin = new AdminSystem();
//			admin.adminSystem(userdata, list, scan, userDataPath);
//			return;
//		}
//		else
//		{
//			UserSystem user = new UserSystem();
//			user.userSystem(userIndex, userdata, list, scan, userDataPath);
//			return;
//		}
	}
	
	private List<Map<String,String>> setMapList(List<String> list, String[] formatName)
	{
		List<Map<String,String>> mapList = new ArrayList<Map<String,String>>();
		int length = formatName.length;
		for(String value:list)
		{
			Map<String,String> mapData = new HashMap<String, String>();
			String[] valueArray = value.split(",");
			for(int i=0;i<length;i++)
			{
				mapData.put(formatName[i], valueArray[i]);
			}
			mapList.add(mapData);
		}
		return mapList;
	}
	
	private int mainChecker(List<Map<String,String>> userdata, Scanner scan)
	{
		System.out.println("���̵� �Է����ּ���.");
		for(int i=3; i>0; i--)
		{
			System.out.print(">");
			String inputID = scan.nextLine();
			for(int userIndex=1;userIndex<userdata.size();userIndex++)
			{
				String compareID = userdata.get(userIndex).get("���̵�");
				if(inputID.equals(compareID))
				{
					String pw = userdata.get(userIndex).get("��й�ȣ");
					boolean passWordCheck = pwChecker(scan, pw);
					if(passWordCheck)
					{
						return userIndex;
					}
					else
					{
						return 0;
					}
				}
			}
			System.out.println("�߸��� ���̵��Դϴ�.");
			System.out.println("�ٽ� �Է����ּ���.");
			System.out.println("(���� ��õ� Ƚ�� : "+(i-1)+"ȸ)");
		}
		return 0;
	}
	
	private boolean pwChecker(Scanner scan, String pw)
	{
		System.out.println("��й�ȣ�� �Է����ּ���.");
		for(int i=3; i>0; i--)
		{
			System.out.print(">");
			String inputPW = scan.nextLine();
			if(inputPW.equals(pw))
			{
				return true;
			}
			System.out.println("�߸��� ��й�ȣ�Դϴ�.");
			System.out.println("�ٽ� �Է����ּ���.");
			System.out.println("(���� ��õ� Ƚ�� : "+(i-1)+"ȸ)");
		}
		return false;
	}
	

//	private boolean adminChecker(List<Map<String,String>> userdata, int userIndex)
//	{
//		String admin = "carnad37";
//		String nowUser = userdata.get(userIndex).get("���̵�");
//		if(nowUser.equals(admin))
//		{
//			return true;
//		}
//		return false;
//		
//	}
	
	private boolean setAnswer(Scanner scan)
	{
		while(true)
		{
			System.out.print("(y/n) > ");
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
