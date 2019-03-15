package mainTest_05_StringArray;


public class UserSystem
{
	
	public void userSystem(UserDataValue userdata)
	{
		CurrentUserData currnetuser = new CurrentUserData();
		currnetuser.setStringArrayToUserData(userdata.userNumber, userdata.userData);
		
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
			int select = MainSystem.selectInputSystem(1,5);
			boolean exitFlag = distributeSevice(select, currnetuser);
			if(exitFlag)
			{
				System.out.println("�α׾ƿ��մϴ�.");
				break;
			}
			else
			{
				saveCurrentUserData(userdata, currnetuser);
			}
		}
	}
	
	
	private boolean distributeSevice(int select, CurrentUserData currnetuser)
	{
		switch(select)
		{
		case 1:
			setPassWord(currnetuser);
			break;
		case 2:
			setEmail(currnetuser);
			break;
		case 3:
			setAdress(currnetuser);
			break;
		case 4: 
			setPhoneNumber(currnetuser);
			break;
		case 5: return true;
		}
		return false;
	}
	
	private void saveCurrentUserData(UserDataValue userdata, CurrentUserData currnetuser)
	{
		String[] currentUserDataArray = currnetuser.setUserDataToStringArray();
		String newData = currnetuser.joinStringArray(currentUserDataArray, ",");
		
		userdata.userList.set(userdata.userNumber, newData);
		
		FileWrite filewrite = new FileWrite();
		filewrite.writeSystem(userdata.userList, userdata.userDataPath);
	}
	
	private void setPassWord(CurrentUserData currnetuser)
	{
		System.out.println("������ ��й�ȣ�� �Է����ּ���.");
		String newPW=null;
		mainLoop:
		while(true)
		{
			System.out.print(">");
			newPW = MainSystem.scan.nextLine();
			System.out.println("��й�ȣ�� Ȯ�����ּ���.");
			for(int i=3;i>0;i--)
			{
				System.out.print(">");
				String pwCheck = MainSystem.scan.nextLine();
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
		currnetuser.password = newPW;
	}
	
	private void setEmail(CurrentUserData currnetuser)
	{
		String newEmail=null;
		while(true)
		{
			System.out.println("������ �̸����� �Է����ּ���.");
			System.out.print(">");
			newEmail = MainSystem.scan.nextLine();
			System.out.println("");
			System.out.println("�̸��� : "+newEmail);
			System.out.println("�Է��Ͻ� ������ �����ʴϱ�?");
			boolean answer = MainSystem.setAnswer();
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
		currnetuser.email = newEmail;
	}
	
	private void setPhoneNumber(CurrentUserData currnetuser)
	{
		String newPN=null;
		while(true)
		{
			System.out.println("������ ��ȭ��ȣ�� �Է����ּ���.");
			System.out.print(">");
			newPN = MainSystem.scan.nextLine();
			System.out.println("");
			System.out.println("��ȭ��ȣ : "+newPN);
			System.out.println("�Է��Ͻ� ������ �����ʴϱ�?");
			boolean answer = MainSystem.setAnswer();
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
		currnetuser.phone = newPN;
	}
	
	private void setAdress(CurrentUserData currnetuser)
	{
		String newAdress1=null, newAdress2=null;
		while(true)
		{
			System.out.println("������ �ּ��� �Է����ּ���.");
			System.out.print(">");
			newAdress1 = MainSystem.scan.nextLine();
			System.out.println("�� �ּ��� �Է����ּ���.");
			System.out.print(">");
			newAdress2 = MainSystem.scan.nextLine();
			System.out.println("");
			System.out.println("�ּ� : "+newAdress1);
			System.out.println("���ּ� : "+newAdress2);
			System.out.println("�Է��Ͻ� ������ �����ʴϱ�?");
			boolean answer = MainSystem.setAnswer();
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
		currnetuser.adress1 = newAdress1;
		currnetuser.adress2 = newAdress2;
	}
}
