package mainTest_05_StringArray;

import java.util.Random;

public class AdminSystem
{
	
	public void adminSystem(UserDataValue userdata)
	{
		System.out.println("======================================");
		System.out.println("관리자 페이지 입니다.");
		while(true)
		{
			System.out.println("======================================");
			System.out.println("");
			System.out.println("1.ID로 검색");
			System.out.println("2.이름으로 검색");
			System.out.println("3.패스워드 리셋");
			System.out.println("4.로그아웃");
			System.out.println("");
			System.out.println("======================================");
			int select = MainSystem.selectInputSystem(1,4);
			boolean exitFlag = distributeSevice(select, userdata);
			if(exitFlag)
			{
				System.out.println("로그아웃합니다.");
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

		System.out.println("대상의 아이디를 입력해주세요");
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
			System.out.println("아이디를 입력해주세요");
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
			System.out.println("대응하는 아이디가 없습니다.");
			System.out.println("다시 검색하시겠습니까?");
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
			System.out.println("이름을 입력해주세요");
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
			System.out.println("대응하는 이름이 없습니다.");
			System.out.println("다시 검색하시겠습니까?");
			boolean answer = MainSystem.setAnswer();
			if(!answer)
			{
				return;
			}
		}
	}
	
	private void printUserInformation(String[] currentUserData)
	{
		String[] formatName = {"아이디","비밀번호","이름","주민번호","이메일","우편번호","주소","상세주소","전화번호","가입일자"};
		for(int index=0;index<currentUserData.length;index++)
		{
			System.out.println(formatName[index]+" : "+currentUserData[index]);
		}
		System.out.println("");
	}
}
