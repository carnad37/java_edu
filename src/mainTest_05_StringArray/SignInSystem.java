package mainTest_05_StringArray;

import java.util.List;
import java.util.Map;

public class SignInSystem
{
	public void signInSystem(UserDataValue userdata)
	{
		userdata.setUserData();
		
		System.out.println("======================================");
		System.out.println("�α��� ������ �Դϴ�.");
		System.out.println("======================================");
		int userIndex=0;
		while(true)
		{
			//1�̻� ������. 
			
			boolean passLogin = mainChecker(userdata);
			
			if(passLogin)
			{
				break;			
			}
			
			System.out.println("�ٽ� �α��� �Ͻðڽ��ϱ�?");
			boolean answer = MainSystem.setAnswer();
			
			if(answer)
			{
				continue;
			}
			else
			{
				return;
			}
		}
		//������ ���� Ȯ��
		if(userIndex==1)
		{
			AdminSystem admin = new AdminSystem();
			admin.adminSystem(userdata);
			return;
		}
		else
		{
			UserSystem user = new UserSystem();
			user.userSystem(userdata);
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
	
	
	
	private boolean mainChecker(UserDataValue userdata)
	{
		userdata.userNumber = idChecker(userdata.userData);			
		//1�̻� ������. 
		if(userdata.userNumber==0)
		{
			return false;
		}
		boolean passLogin = pwChecker(userdata);
		if(passLogin)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private int idChecker(List<String[]> userdata)
	{
		System.out.println("���̵� �Է����ּ���.");
		for(int i=3; i>0; i--)
		{
			System.out.print(">");
			String inputID = MainSystem.scan.nextLine();
			for(int userIndex=1;userIndex<userdata.size();userIndex++)
			{
				String compareID = userdata.get(userIndex)[0];
				if(inputID.equals(compareID))
				{
					return userIndex;
				}
			}
			System.out.println("�߸��� ���̵��Դϴ�.");
			System.out.println("�ٽ� �Է����ּ���.");
			System.out.println("(���� ��õ� Ƚ�� : "+(i-1)+"ȸ)");
		}
		return 0;
	}
	
	
	private boolean pwChecker(UserDataValue userdata)
	{
		String[] targetArray = userdata.userData.get(userdata.userNumber);
		String pw = targetArray[1];
		
		System.out.println("��й�ȣ�� �Է����ּ���.");
		for(int i=3; i>0; i--)
		{
			System.out.print(">");
			String inputPW = MainSystem.scan.nextLine();
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
	
}
