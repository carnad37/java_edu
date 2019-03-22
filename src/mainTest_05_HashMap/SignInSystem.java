package mainTest_05_HashMap;

import java.util.List;
import java.util.Map;



public class SignInSystem
{
	public void signInSystem(UserDataValue userDB)
	{
		System.out.println("======================================");
		System.out.println("�α��� ������ �Դϴ�.");
		System.out.println("======================================");
		while(true)
		{
			boolean passLogin = mainCheckr(userDB);
			
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
		if(userDB.userNumber==1)
		{
			AdminSystem admin = new AdminSystem();
			admin.adminSystem(userDB);
			return;
		}
		else
		{
			UserSystem user = new UserSystem();
			user.userSystem(userDB);
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
	
	private boolean mainCheckr(UserDataValue userDB)
	{
		userDB.userNumber = idChecker(userDB.userData);			
		//1�̻� ������. 
		if(userDB.userNumber==0)
		{
			return false;
		}
		
		Map<String,String> targetData = userDB.userData.get(userDB.userNumber);
		String pw = targetData.get("��й�ȣ");
		boolean passLogin = pwChecker(pw);
		
		if(passLogin)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private int idChecker(List<Map<String,String>> userDB)
	{
		System.out.println("���̵� �Է����ּ���.");
		for(int i=3; i>0; i--)	//�ݺ�Ƚ��
		{
			System.out.print(">");
			String inputID = MainSystem.scan.nextLine();
			
			for(int userNumber=1; userNumber<userDB.size(); userNumber++)
			{
				Map<String,String> targetdata = userDB.get(userNumber);
				String compareID = targetdata.get("���̵�");
				
				if(inputID.equals(compareID))
				{
					return userNumber;
				}
			}
			System.out.println("�߸��� ���̵��Դϴ�.");
			System.out.println("�ٽ� �Է����ּ���.");
			System.out.println("(���� ��õ� Ƚ�� : "+(i-1)+"ȸ)");
		}
		return 0;
	}
	
	private boolean pwChecker(String pw)
	{
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
