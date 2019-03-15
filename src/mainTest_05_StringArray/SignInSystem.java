package mainTest_05_StringArray;

import java.util.List;

public class SignInSystem
{
	public void signInSystem(UserDataValue userdata)
	{
		userdata.setUserData();
		
		System.out.println("======================================");
		System.out.println("로그인 페이지 입니다.");
		System.out.println("======================================");
		int userIndex=0;
		while(true)
		{
			//1이상만 유저값. 
			userIndex = mainChecker(userdata.userData);
			if(userIndex==0)
			{
				//로그인여부 확인
				System.out.println("다시 로그인 하시겠습니까?");
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
			else
			{
				break;
			}
		}
		//관리자 여부 확인
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
	
	
	private int mainChecker(List<String[]> userdata)
	{
		System.out.println("아이디를 입력해주세요.");
		for(int i=3; i>0; i--)
		{
			System.out.print(">");
			String inputID = MainSystem.scan.nextLine();
			for(int userIndex=1;userIndex<userdata.size();userIndex++)
			{
				String compareID = userdata.get(userIndex)[0];
				if(inputID.equals(compareID))
				{
					String pw = userdata.get(userIndex)[1];
					boolean passWordCheck = pwChecker(pw);
					if(passWordCheck)
					{
						return userIndex;
					}
					else
					{
						return 0;
					}
				}
			}
			System.out.println("잘못된 아이디입니다.");
			System.out.println("다시 입력해주세요.");
			System.out.println("(남은 재시도 횟수 : "+(i-1)+"회)");
		}
		return 0;
	}
	
	private boolean pwChecker(String pw)
	{
		System.out.println("비밀번호를 입력해주세요.");
		for(int i=3; i>0; i--)
		{
			System.out.print(">");
			String inputPW = MainSystem.scan.nextLine();
			if(inputPW.equals(pw))
			{
				return true;
			}
			System.out.println("잘못된 비밀번호입니다.");
			System.out.println("다시 입력해주세요.");
			System.out.println("(남은 재시도 횟수 : "+(i-1)+"회)");
		}
		return false;
	}
	
	
	
//	private boolean adminChecker(List<Map<String,String>> userdata, int userIndex)
//	{
//		String admin = "carnad37";
//		String nowUser = userdata.get(userIndex).get("아이디");
//		if(nowUser.equals(admin))
//		{
//			return true;
//		}
//		return false;
//		
//	}
	
}
