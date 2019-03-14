package mainTest_05_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SignInSystem
{
	public void signInSystem(Scanner scan, List<String> list, String userDataPath)
	{
		final String[] formatName = {"아이디","비밀번호","이름","주민번호","이메일","우편번호","주소","상세주소","전화번호","가입일자"};
		List<Map<String,String>> userdata = setMapList(list, formatName);
		
		System.out.println("======================================");
		System.out.println("로그인 페이지 입니다.");
		System.out.println("======================================");
		int userIndex=0;
		while(true)
		{
			//1이상만 유저값. 
			userIndex = mainChecker(userdata, scan);
			if(userIndex==0)
			{
				//로그인여부 확인
				System.out.println("다시 로그인 하시겠습니까?");
				boolean answer = setAnswer(scan);
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
			admin.adminSystem(userdata, list, scan, userDataPath);
			return;
		}
		else
		{
			UserSystem user = new UserSystem();
			user.userSystem(userIndex, userdata, list, scan, userDataPath);
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
	
	private List<Map<String,String>> setMapList(List<String> list, String[] formatName)
	{
		List<Map<String,String>> mapList = new ArrayList<Map<String,String>>();
		int length = formatName.length;
		for(String value:list)
		{
			Map<String,String> mapData = new HashMap<String, String>();
			String[] valueArray = value.split(",");
			for(int i=0;i<length;i++)
			{
				mapData.put(formatName[i], valueArray[i]);
			}
			mapList.add(mapData);
		}
		return mapList;
	}
	
	private int mainChecker(List<Map<String,String>> userdata, Scanner scan)
	{
		System.out.println("아이디를 입력해주세요.");
		for(int i=3; i>0; i--)
		{
			System.out.print(">");
			String inputID = scan.nextLine();
			for(int userIndex=1;userIndex<userdata.size();userIndex++)
			{
				String compareID = userdata.get(userIndex).get("아이디");
				if(inputID.equals(compareID))
				{
					String pw = userdata.get(userIndex).get("비밀번호");
					boolean passWordCheck = pwChecker(scan, pw);
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
	
	private boolean pwChecker(Scanner scan, String pw)
	{
		System.out.println("비밀번호를 입력해주세요.");
		for(int i=3; i>0; i--)
		{
			System.out.print(">");
			String inputPW = scan.nextLine();
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
	
	private boolean setAnswer(Scanner scan)
	{
		while(true)
		{
			System.out.print("(y/n) > ");
			String select = scan.nextLine();
			if(select.length()>1)
			{
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			select = select.toLowerCase();
			if(select.equals("y"))
			{
				return true;
			}
			else if(select.equals("n"))
			{
				return false;
			}
			else
			{
				System.out.println("잘못된 입력입니다.");
			}
		}
	}	
}
