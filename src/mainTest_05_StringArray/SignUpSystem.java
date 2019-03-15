package mainTest_05_StringArray;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SignUpSystem 
{
	public void mainSystem(UserDataValue userdata)
	{		
		CurrentUserData currentuser = new CurrentUserData();
		String[] formatName = {"아이디","이름","패스워드","주민번호","이메일","우편번호","주소","상세주소","전화번호","가입일자"};		
		
		System.out.println("======================================");
		System.out.println("회원가입 페이지 입니다.");
		System.out.println("아래에 정보를 입력해주세요.");
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
				System.out.println("다시 회원 정보를 입력하시겠습니까?");
				boolean answer = MainSystem.setAnswer();
				if(!answer)
				{
					break;
				}
			}
		}
		System.out.println("회원가입을 종료합니다.");		
		
	}
	private void saveID(CurrentUserData currentuser, String[] formatName)
	{
		System.out.println(formatName[0]+"를 입력해주세요");
		System.out.print(">");
		currentuser.userid = MainSystem.scan.nextLine();
	}
	
	private void savePW(CurrentUserData currentuser, String[] formatName)
	{
		System.out.println(formatName[1]+"를 입력해주세요");
		System.out.print(">");
		currentuser.username = MainSystem.scan.nextLine();
	}
	
	private void saveName(CurrentUserData currentuser, String[] formatName)
	{
		System.out.println(formatName[2]+"을 입력해주세요");
		System.out.print(">");
		currentuser.password = MainSystem.scan.nextLine();
	}
	
	private void saveSNumber(CurrentUserData currentuser, String[] formatName)
	{
		System.out.println(formatName[3]+"를 입력해주세요");
		System.out.print(">");
		currentuser.securitynum = MainSystem.scan.nextLine();
	}
	
	private void saveEmail(CurrentUserData currentuser, String[] formatName)
	{
		System.out.println(formatName[4]+"을 입력해주세요");
		System.out.print(">");
		currentuser.email = MainSystem.scan.nextLine();
	}
	
	private void saveZipCode(CurrentUserData currentuser, String[] formatName)
	{
		System.out.println(formatName[5]+"를 입력해주세요");
		System.out.print(">");
		currentuser.zipcode = MainSystem.scan.nextLine();
	}
	
	private void saveAdress1(CurrentUserData currentuser, String[] formatName)
	{
		System.out.println(formatName[6]+"를 입력해주세요");
		System.out.print(">");
		currentuser.adress1 = MainSystem.scan.nextLine();
	}
	
	private void saveAdress2(CurrentUserData currentuser, String[] formatName)
	{
		System.out.println(formatName[7]+"를 입력해주세요");
		System.out.print(">");
		currentuser.adress2 = MainSystem.scan.nextLine();
	}
	
	private void savePhoneNumber(CurrentUserData currentuser, String[] formatName)
	{
		System.out.println(formatName[8]+"를 입력해주세요");
		System.out.print(">");
		currentuser.phone = MainSystem.scan.nextLine();
	}
	
	private void saveRegedit(CurrentUserData currentuser, String[] formatName)
	{
		SimpleDateFormat timeformat = new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분");		
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
		System.out.println("이 정보대로 회원가입하시겠습니까?");
		boolean answer = MainSystem.setAnswer();
		if(answer)
		{
			System.out.println(signFormat[2]+"님, 회원이되신것을 환영합니다.");
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
