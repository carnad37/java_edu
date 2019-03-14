package mainTest_05_HashMap;

import java.util.List;
import java.util.Scanner;


public class MainSystem
{

	public void mainMenu(List<String> listData,String userDataPath)
	{
		Scanner scan = new Scanner(System.in);
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
			int select = selectInputSystem(scan);
			boolean exitFlag = distributeSevice(select, scan, listData, userDataPath);
			if(exitFlag)
			{
				System.out.println("시스템을 종료합니다.");
				scan.close();
				break;
			}
		}	
	}
	
	private boolean distributeSevice(int selectNum, Scanner scan, List<String> list, String userDataPath)
	{
		switch(selectNum)
		{
		case 1:
			SignInSystem signin = new SignInSystem();
			signin.signInSystem(scan, list, userDataPath);
			break;
		case 2:
			SignUpSystem signup = new SignUpSystem();
			signup.signUpSystem(scan, list, userDataPath);
			break;
		case 3: return true;
		}
		return false;
	}

	private int selectInputSystem(Scanner scan)
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
				if(selectNum<1||selectNum>3)
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
}
