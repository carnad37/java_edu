package mainTest_05_HashMap;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class AdminSystem
{
	
	public void adminSystem( List<Map<String, String>> userdata, List<String> list, Scanner scan, String userDataPath)
	{
		System.out.println("======================================");
		System.out.println("������ ������ �Դϴ�.");
		while(true)
		{
			System.out.println("======================================");
			System.out.println("");
			System.out.println("1.ID�� �˻�");
			System.out.println("2.�̸����� �˻�");
			System.out.println("3.�н����� ����");
			System.out.println("4.�α׾ƿ�");
			System.out.println("");
			System.out.println("======================================");
			int select = selectInputSystem(scan);
			boolean exitFlag = distributeSevice(select,userdata,list,scan,userDataPath);
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
	
	private boolean distributeSevice(int selectNum, List<Map<String, String>> userdata, List<String> list, Scanner scan, String userDataPath)
	{
		switch(selectNum)
		{
		case 1:
			adminSearch(userdata,scan,"���̵�");
			break;
		case 2:
			adminSearch(userdata,scan, "�̸�");
			break;
		case 3:
			resetPassWord(userdata, list, scan, userDataPath);
			break;
		case 4: return true;
		}
		return false;
	}
	
	private void resetPassWord(List<Map<String,String>> userdata, List<String> list,  Scanner scan,  String userDataPath)
	{

		System.out.println("����� ���̵� �Է����ּ���");
		System.out.print(">");
		String target = scan.nextLine();
		for(int i=1;i<userdata.size();i++)
		{
			String res = userdata.get(i).get("���̵�");
			if(target.equals(res))
			{
				FileWrite filewrite = new FileWrite();
				String rawData = list.get(i);
				String newPW = setRandomWord(8);
				System.out.println("newPW");
				String oldPW = userdata.get(i).get("��й�ȣ");
				rawData = rawData.replace(oldPW, newPW);
				list.set(i, rawData);
				filewrite.writeSystem(list, userDataPath);
				return;
			}
		}
	}
	
	private String setRandomWord(int num)
	{
		Random random = new Random();
		String result = "";
		for(int i=0;i<num;i++)
		{
			int value = random.nextInt(58)+65;
			char res = (char)value;
			result+=String.valueOf(res);
		}
		return result;
	}
	
	private void adminSearch(List<Map<String,String>> userdata, Scanner scan, String searchWord)
	{
		while(true)
		{
			System.out.println(searchWord+"�� �Է����ּ���");
			System.out.print(">");
			String target = scan.nextLine();
			
			for(Map<String,String> value:userdata)
			{
				String res = value.get(searchWord);
				if(target.equals(res))
				{
					Set<String> setkey = value.keySet();
					for(String data : setkey)
					{
						System.out.println(data+" : "+value.get(data));
					}
					return;
				}
			}
			System.out.println("�����ϴ� "+searchWord+"�� �����ϴ�.");
			System.out.println("�ٽ� �˻��Ͻðڽ��ϱ�?");
			boolean answer = setAnswer(scan);
			if(!answer)
			{
				return;
			}
		}
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
