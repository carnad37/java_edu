package mainTest_05_HashMap;

import java.util.Map;
import java.util.Random;

public class AdminSystem
{
	public void adminSystem(UserDataValue userDB)
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
			boolean exitFlag = distributeSevice(select, userDB);
			if(exitFlag)
			{
				System.out.println("로그아웃합니다.");
				break;
			}
		}
	}
	
	private boolean distributeSevice(int select, UserDataValue userDB)
	{
		switch(select)
		{
		case 1:
			adminSearchSystem(userDB,"아이디");
			break;
		case 2:
			adminSearchSystem(userDB,"이름");
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

		System.out.println("대상의 아이디를 입력해주세요");
		System.out.print(">");
		String target = MainSystem.scan.nextLine();
		for(int i=1;i<userDB.userData.size();i++)
		{
			String res = userDB.userData.get(i).get("아이디");
			if(target.equals(res))
			{
				String newPW = setRandomWord(8);

				userDB.userNumber = i;				
				userDB.setCurrentUser();
				
				userDB.currentUser.remove("비밀번호");
				userDB.currentUser.put("비밀번호",newPW);
				
//				userDB.userData.get(i).remove("비밀번호");
//				userDB.userData.get(i).put("비밀번호",newPW);
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
			System.out.println(searchWord+"(를/을) 입력해주세요");
			System.out.print(">");
			String target = MainSystem.scan.nextLine();
			
			boolean searchPass = targetSearch(userDB, target, searchWord);
			if(searchPass)
			{
				return;
			}
			
			System.out.println("대응하는 "+searchWord+"이/가 없습니다.");
			System.out.println("다시 검색하시겠습니까?");
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
