package mainTest_05_HashMap;

public class UserSystem
{
	public void userSystem(UserDataValue userDB)
	{		
		userDB.setCurrentUser();
		
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
			boolean exitFlag = distributeSevice(select,userDB);
			if(exitFlag)
			{
				System.out.println("�α׾ƿ��մϴ�.");
				break;
			}
			saveCurrentUserData(userDB);
		}
	}
	
	private void saveCurrentUserData(UserDataValue userDB)
	{
		String newData = userDB.setCurrentUserToString();
		
		userDB.userList.set(userDB.userNumber, newData);
		
		FileWrite filewrite = new FileWrite();
		filewrite.writeSystem(userDB.userList, userDB.userDataPath);
	}
	
	private boolean distributeSevice(int select,UserDataValue userDB)
	{
		switch(select)
		{
		case 1:
			setPassWord(userDB);
			break;
		case 2:
			setEmail(userDB);
			break;
		case 3:
			setAdress(userDB);
			break;
		case 4: 
			setPhoneNumber(userDB);
			break;
		case 5: return true;
		}
		return false;
	}
	
	private void setPassWord(UserDataValue userDB)
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
		userDB.currentUser.remove("��й�ȣ");
		userDB.currentUser.put("��й�ȣ", newPW);
		
		saveCurrentUserData(userDB);
	}
	
	private void setEmail(UserDataValue userDB)
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
		userDB.currentUser.remove("�̸���");
		userDB.currentUser.put("�̸���", newEmail);
		
		saveCurrentUserData(userDB);
	}
	
	private void setPhoneNumber(UserDataValue userDB)
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
		userDB.currentUser.remove("��ȭ��ȣ");
		userDB.currentUser.put("��ȭ��ȣ", newPN);
		
		saveCurrentUserData(userDB);
	}
	
	private void setAdress(UserDataValue userDB)
	{
		String newAdress1=null, newAdress2=null;
		while(true)
		{
			System.out.println("������ �ּ��� �Է����ּ���.");
			System.out.print(">");
			newAdress1 = MainSystem.scan.nextLine();
			System.out.println("���ּ��� �Է����ּ���.");
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
	
		userDB.currentUser.remove("�ּ�");
		userDB.currentUser.put("�ּ�", newAdress1);
		
		userDB.currentUser.remove("���ּ�");
		userDB.currentUser.put("���ּ�", newAdress2);
		
		saveCurrentUserData(userDB);
	}
}
