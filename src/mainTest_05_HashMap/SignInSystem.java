package mainTest_05_HashMap;

import java.util.List;
import java.util.Map;



public class SignInSystem
{
	public void signInSystem(UserDataValue userDB)
	{
		System.out.println("======================================");
		System.out.println("로그인 페이지 입니다.");
		System.out.println("======================================");
		while(true)
		{
			boolean passLogin = mainCheckr(userDB);
			
			if(passLogin)
			{
				break;			
			}
			
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
			//관리자 여부 확인
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
		//1이상만 유저값. 
		if(userDB.userNumber==0)
		{
			return false;
		}
		
		Map<String,String> targetData = userDB.userData.get(userDB.userNumber);
		String pw = targetData.get("비밀번호");
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
		System.out.println("아이디를 입력해주세요.");
		for(int i=3; i>0; i--)	//반복횟수
		{
			System.out.print(">");
			String inputID = MainSystem.scan.nextLine();
			
			for(int userNumber=1; userNumber<userDB.size(); userNumber++)
			{
				Map<String,String> targetdata = userDB.get(userNumber);
				String compareID = targetdata.get("아이디");
				
				if(inputID.equals(compareID))
				{
					return userNumber;
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
