package mainTest_05_StringArray;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SignUpSystem 
{
	public void mainSystem(UserDataValue userdata)
	{		
		CurrentUserData currentuser = new CurrentUserData();
		String[] formatName = {"���̵�","�̸�","�н�����","�ֹι�ȣ","�̸���","�����ȣ","�ּ�","���ּ�","��ȭ��ȣ","��������"};		
		
		System.out.println("======================================");
		System.out.println("ȸ������ ������ �Դϴ�.");
		System.out.println("�Ʒ��� ������ �Է����ּ���.");
		System.out.println("======================================");
		
		while(true)
		{
			saveID(currentuser, formatName);
			savePW(currentuser, formatName);
			saveName(currentuser, formatName);
			saveSNumber(currentuser, formatName);
			saveEmail(currentuser, formatName);
			saveZipCode(currentuser, formatName);
			saveAdress1(currentuser, formatName);
			saveAdress2(currentuser, formatName);
			savePhoneNumber(currentuser, formatName);
			saveRegedit(currentuser, formatName);
		
			boolean signUpSelect = singUpProcess(userdata, currentuser, formatName);
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
	private void saveID(CurrentUserData currentuser, String[] formatName)
	{
		System.out.println(formatName[0]+"�� �Է����ּ���");
		System.out.print(">");
		currentuser.userid = MainSystem.scan.nextLine();
	}
	
	private void savePW(CurrentUserData currentuser, String[] formatName)
	{
		System.out.println(formatName[1]+"�� �Է����ּ���");
		System.out.print(">");
		currentuser.username = MainSystem.scan.nextLine();
	}
	
	private void saveName(CurrentUserData currentuser, String[] formatName)
	{
		System.out.println(formatName[2]+"�� �Է����ּ���");
		System.out.print(">");
		currentuser.password = MainSystem.scan.nextLine();
	}
	
	private void saveSNumber(CurrentUserData currentuser, String[] formatName)
	{
		System.out.println(formatName[3]+"�� �Է����ּ���");
		System.out.print(">");
		currentuser.securitynum = MainSystem.scan.nextLine();
	}
	
	private void saveEmail(CurrentUserData currentuser, String[] formatName)
	{
		System.out.println(formatName[4]+"�� �Է����ּ���");
		System.out.print(">");
		currentuser.email = MainSystem.scan.nextLine();
	}
	
	private void saveZipCode(CurrentUserData currentuser, String[] formatName)
	{
		System.out.println(formatName[5]+"�� �Է����ּ���");
		System.out.print(">");
		currentuser.zipcode = MainSystem.scan.nextLine();
	}
	
	private void saveAdress1(CurrentUserData currentuser, String[] formatName)
	{
		System.out.println(formatName[6]+"�� �Է����ּ���");
		System.out.print(">");
		currentuser.adress1 = MainSystem.scan.nextLine();
	}
	
	private void saveAdress2(CurrentUserData currentuser, String[] formatName)
	{
		System.out.println(formatName[7]+"�� �Է����ּ���");
		System.out.print(">");
		currentuser.adress2 = MainSystem.scan.nextLine();
	}
	
	private void savePhoneNumber(CurrentUserData currentuser, String[] formatName)
	{
		System.out.println(formatName[8]+"�� �Է����ּ���");
		System.out.print(">");
		currentuser.phone = MainSystem.scan.nextLine();
	}
	
	private void saveRegedit(CurrentUserData currentuser, String[] formatName)
	{
		SimpleDateFormat timeformat = new SimpleDateFormat("yyyy�� mm�� dd�� hh�� mm��");		
		Date daytime = new Date();
		
		String currenttime = timeformat.format(daytime);		
		currentuser.regedit = currenttime;
	}
	
	private boolean singUpProcess(UserDataValue userdata, CurrentUserData currentuser, String[] formatName)
	{
		String[] signFormat = currentuser.setUserDataToStringArray();
		for(int i=0;i<formatName.length;i++)
		{
			System.out.println(formatName[i]+" : "+signFormat[i]);
		}
		System.out.println("�� ������� ȸ�������Ͻðڽ��ϱ�?");
		boolean answer = MainSystem.setAnswer();
		if(answer)
		{
			System.out.println(signFormat[2]+"��, ȸ���̵ǽŰ��� ȯ���մϴ�.");
			String data = currentuser.joinStringArray(signFormat, ",");
			userdata.userList.add(data);
			FileWrite filewrite = new FileWrite();
			filewrite.writeSystem(userdata.userList, userdata.userDataPath);
			return true;
		}
		else
		{
			return false;
		}
	}
	


}
