package mainTest_05_StringArray;

import java.util.List;
import java.util.Scanner;


public class MainSystem
{
	public static Scanner scan = null;
	
	MainSystem()
	{
		scan = new Scanner(System.in);
	}
	
	public void mainSystem(List<String> listData, String userDataPath)
	{
		UserDataValue userdata = new UserDataValue();
		userdata.userList = listData;
		userdata.userDataPath = userDataPath;
		
		while(true)
		{
			System.out.println("======================================");
			System.out.println("");
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.종료");
			System.out.println("");
			System.out.println("======================================");
			System.out.print(">");
			int select = selectInputSystem(1,3);
			boolean exitFlag = distributeSevice(select, userdata);
			if(exitFlag)
			{
				System.out.println("정말 종료하시겠습니까?");
				boolean answer = MainSystem.setAnswer();
				if(answer)
				{
					System.out.println("시스템을 종료합니다.");
					scan.close();
					break;
				}
				System.out.println("");
			}
		}	
	}
	
	private boolean distributeSevice(int selectNum, UserDataValue userdata)
	{
		switch(selectNum)
		{
		case 1:
			SignInSystem signin = new SignInSystem();
			signin.signInSystem(userdata);
			break;
		case 2:
			SignUpSystem signup = new SignUpSystem();
			signup.mainSystem(userdata);
			break;
		case 3: return true;
		}
		return false;
	}

	public static int selectInputSystem(int start, int end)
	{
		String selectNumString = null;
		int selectNum = 0;
		while(true)
		{
			try
			{
				System.out.print(">");
				selectNumString = scan.nextLine();
				selectNum = Integer.parseInt(selectNumString);
				if(selectNum<start||selectNum>end)
				{
					System.out.println("잘못된 입력입니다.");
				}
				else
				{
					break;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("잘못된 입력입니다.");
			}
		}
		return selectNum;		
	}
	
	public static boolean setAnswer()
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
