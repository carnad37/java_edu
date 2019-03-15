package mainTest_05_HashMap;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SignUpSystem 
{
	public void mainSystem(UserDataValue userDB)
	{		

		System.out.println("======================================");
		System.out.println("ȸ������ ������ �Դϴ�.");
		System.out.println("�Ʒ��� ������ �Է����ּ���.");
		System.out.println("======================================");
		
		while(true)
		{
			Map<String,String> newUser = new HashMap<String,String>();
			
			saveID(newUser, userDB.formatName);
			savePW(newUser, userDB.formatName);
			saveName(newUser, userDB.formatName);
			saveSNumber(newUser, userDB.formatName);
			saveEmail(newUser, userDB.formatName);
			saveZipCode(newUser, userDB.formatName);
			saveAdress1(newUser, userDB.formatName);
			saveAdress2(newUser, userDB.formatName);
			savePhoneNumber(newUser, userDB.formatName);
			saveRegedit(newUser, userDB.formatName);
		
			boolean signUpSelect = singUpProcess(newUser, userDB);
			if(signUpSelect)
			{
				break;
			}
			else
			{
				System.out.println("�ٽ� ȸ�� ������ �Է��Ͻðڽ��ϱ�?");
				boolean answer = MainSystem.setAnswer();
				if(!answer)
				{
					break;
				}
			}
		}
		System.out.println("ȸ�������� �����մϴ�.");		
		
	}
	private void saveID(Map<String,String> newUser, String[] formatName)
	{
		System.out.println("���̵� �Է����ּ���");
		System.out.print(">");
		String id = MainSystem.scan.nextLine();
		newUser.put(formatName[0], id);
	}
	
	private void savePW(Map<String,String> newUser, String[] formatName)
	{
		System.out.println("��й�ȣ�� �Է����ּ���");
		System.out.print(">");
		String password = MainSystem.scan.nextLine();
		newUser.put(formatName[1], password);
	}
	
	private void saveName(Map<String,String> newUser, String[] formatName)
	{
		System.out.println("�̸��� �Է����ּ���");
		System.out.print(">");
		String name = MainSystem.scan.nextLine();
		newUser.put(formatName[2], name);
	}
	
	private void saveSNumber(Map<String,String> newUser, String[] formatName)
	{
		System.out.println("�ֹι�ȣ�� �Է����ּ���");
		System.out.print(">");
		String sNumber = MainSystem.scan.nextLine();
		newUser.put(formatName[3], sNumber);
	}
	
	private void saveEmail(Map<String,String> newUser, String[] formatName)
	{
		System.out.println("�̸����� �Է����ּ���");
		System.out.print(">");
		String email = MainSystem.scan.nextLine();
		newUser.put(formatName[4], email);
	}
	
	private void saveZipCode(Map<String,String> newUser, String[] formatName)
	{
		System.out.println("�����ȣ�� �Է����ּ���");
		System.out.print(">");
		String zipcode = MainSystem.scan.nextLine();
		newUser.put(formatName[5], zipcode);
	}
	
	private void saveAdress1(Map<String,String> newUser, String[] formatName)
	{
		System.out.println("�ּҸ� �Է����ּ���");
		System.out.print(">");
		String adress1 = MainSystem.scan.nextLine();
		newUser.put(formatName[6], adress1);
	}
	
	private void saveAdress2(Map<String,String> newUser, String[] formatName)
	{
		System.out.println("���ּҸ� �Է����ּ���");
		System.out.print(">");
		String adress2 = MainSystem.scan.nextLine();
		newUser.put(formatName[7], adress2);
	}
	
	private void savePhoneNumber(Map<String,String> newUser, String[] formatName)
	{
		System.out.println("��ȭ��ȣ�� �Է����ּ���");
		System.out.print(">");
		String phone = MainSystem.scan.nextLine();
		newUser.put(formatName[8], phone);
	}
	
	private void saveRegedit(Map<String,String> newUser, String[] formatName)
	{
		SimpleDateFormat timeformat = new SimpleDateFormat("yyyy�� mm�� dd�� hh�� mm��");		
		Date daytime = new Date();
		
		String currenttime = timeformat.format(daytime);
		newUser.put(formatName[9], currenttime);
	}
	
	private boolean singUpProcess(Map<String,String> newUser, UserDataValue userDB)
	{
		for(String value : userDB.formatName)
		{
			System.out.println(value+" : "+newUser.get(value));
		}
		System.out.println("�� ������� ȸ�������Ͻðڽ��ϱ�?");
		boolean answer = MainSystem.setAnswer();
		if(answer)
		{
			String name = newUser.get("�̸�");
			System.out.println("======================================");
			System.out.println("");
			System.out.println(name+"��, ȸ���̵ǽŰ��� ȯ���մϴ�.");
			System.out.println("");
			System.out.println("======================================");

			String data = userDB.setCurrentUserToString(newUser);
			
			userDB.userList.add(data);
			
			FileWrite filewrite = new FileWrite();
			filewrite.writeSystem(userDB.userList, userDB.userDataPath);
			return true;
		}
		else
		{
			return false;
		}
	}
}
