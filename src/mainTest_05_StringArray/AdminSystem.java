package mainTest_05_StringArray;

import java.util.Random;

public class AdminSystem
{
	
	public void adminSystem(UserDataValue userdata)
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
			boolean exitFlag = distributeSevice(select, userdata);
			if(exitFlag)
			{
				System.out.println("�α׾ƿ��մϴ�.");
				break;
			}
			System.out.println("");
		}
	}
		
	private boolean distributeSevice(int selectNum, UserDataValue userdata)
	{
		switch(selectNum)
		{
		case 1:
			idSearch(userdata);
			break;
		case 2:
			nameSearch(userdata);
			break;
		case 3:
			resetPassWord(userdata);
			break;
		case 4: return true;
		}
		return false;
	}
	
	private void resetPassWord(UserDataValue userdata)
	{

		System.out.println("����� ���̵� �Է����ּ���");
		System.out.print(">");
		String target = MainSystem.scan.nextLine();
		for(int userNumber=1;userNumber<userdata.userData.size();userNumber++)
		{
			String res = userdata.userData.get(userNumber)[0];
			if(target.equals(res))
			{
				String newPW = setRandomWord(8);
				userdata.userData.get(userNumber)[1] = newPW;

				CurrentUserData setArray = new CurrentUserData();
				String newData = setArray.joinStringArray(userdata.userData.get(userNumber), ",");
				
				userdata.userList.set(userNumber, newData);
				
				FileWrite filewrite = new FileWrite();
				filewrite.writeSystem(userdata.userList, userdata.userDataPath);
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
	
	private void idSearch(UserDataValue userdata)
	{
		while(true)
		{
			System.out.println("���̵� �Է����ּ���");
			System.out.print(">");
			String target = MainSystem.scan.nextLine();
			
			for(String[] userDataLine:userdata.userData)
			{
				String res = userDataLine[0];
				if(target.equals(res))
				{
					printUserInformation(userDataLine);
					return;
				}
			}
			System.out.println("�����ϴ� ���̵� �����ϴ�.");
			System.out.println("�ٽ� �˻��Ͻðڽ��ϱ�?");
			boolean answer = MainSystem.setAnswer();
			if(!answer)
			{
				return;
			}
		}
	}
	
	private void nameSearch(UserDataValue userdata)
	{
		
		while(true)
		{
			System.out.println("�̸��� �Է����ּ���");
			System.out.print(">");
			String target = MainSystem.scan.nextLine();
			
			for(String[] userDataLine:userdata.userData)
			{
				String res = userDataLine[1];
				if(target.equals(res))
				{
					printUserInformation(userDataLine);
					return;
				}
			}
			System.out.println("�����ϴ� �̸��� �����ϴ�.");
			System.out.println("�ٽ� �˻��Ͻðڽ��ϱ�?");
			boolean answer = MainSystem.setAnswer();
			if(!answer)
			{
				return;
			}
		}
	}
	
	private void printUserInformation(String[] currentUserData)
	{
		String[] formatName = {"���̵�","��й�ȣ","�̸�","�ֹι�ȣ","�̸���","�����ȣ","�ּ�","���ּ�","��ȭ��ȣ","��������"};
		for(int index=0;index<currentUserData.length;index++)
		{
			System.out.println(formatName[index]+" : "+currentUserData[index]);
		}
		System.out.println("");
	}
}
