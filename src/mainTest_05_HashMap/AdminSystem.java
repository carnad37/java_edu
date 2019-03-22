package mainTest_05_HashMap;

import java.util.Map;
import java.util.Random;

public class AdminSystem
{
	public void adminSystem(UserDataValue userDB)
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
			int select = MainSystem.selectInputSystem(1,4);
			boolean exitFlag = distributeSevice(select, userDB);
			if(exitFlag)
			{
				System.out.println("�α׾ƿ��մϴ�.");
				break;
			}
		}
	}
	
	private boolean distributeSevice(int select, UserDataValue userDB)
	{
		switch(select)
		{
		case 1:
			adminSearchSystem(userDB,"���̵�");
			break;
		case 2:
			adminSearchSystem(userDB,"�̸�");
			break;
		case 3:
			resetPassWord(userDB);
			break;
		case 4: return true;
		}
		return false;
	}
	
	private void resetPassWord(UserDataValue userDB)
	{

		System.out.println("����� ���̵� �Է����ּ���");
		System.out.print(">");
		String target = MainSystem.scan.nextLine();
		for(int i=1;i<userDB.userData.size();i++)
		{
			String res = userDB.userData.get(i).get("���̵�");
			if(target.equals(res))
			{
				String newPW = setRandomWord(8);

				userDB.userNumber = i;				
				userDB.setCurrentUser();
				
				userDB.currentUser.remove("��й�ȣ");
				userDB.currentUser.put("��й�ȣ",newPW);
				
//				userDB.userData.get(i).remove("��й�ȣ");
//				userDB.userData.get(i).put("��й�ȣ",newPW);
//				
//				Map<String,String> newUserData= userDB.userData.get(i);
//				String newDataString = userDB.setCurrentUserToString(newUserData);
				
				String newData = userDB.setCurrentUserToString();
						
				userDB.userList.set(userDB.userNumber, newData);
								
				FileWrite filewrite = new FileWrite();
				filewrite.writeSystem(userDB.userList, userDB.userDataPath);
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
	
	private void adminSearchSystem(UserDataValue userDB, String searchWord)
	{
		while(true)
		{
			System.out.println(searchWord+"(��/��) �Է����ּ���");
			System.out.print(">");
			String target = MainSystem.scan.nextLine();
			
			boolean searchPass = targetSearch(userDB, target, searchWord);
			if(searchPass)
			{
				return;
			}
			
			System.out.println("�����ϴ� "+searchWord+"��/�� �����ϴ�.");
			System.out.println("�ٽ� �˻��Ͻðڽ��ϱ�?");
			boolean answer = MainSystem.setAnswer();
			if(!answer)
			{
				return;
			}
		}
	}
	
	private boolean targetSearch(UserDataValue userDB, String target, String searchWord)
	{
		for(Map<String,String> value : userDB.userData)
		{
			String res = value.get(searchWord);
			if(target.equals(res))
			{
				printUserData(value, userDB.formatName);
				return true;
			}
		}
		return false;
	}
	
	private void printUserData(Map<String,String> target, String[] valueName)
	{
		for(String data : valueName)
		{
			System.out.println(data+" : "+target.get(data));
		}
	}
	
}
