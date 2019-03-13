package mainTest_05;

import java.util.List;
import java.util.Scanner;

import mainTest_03.LocalAdressValue_Map;

public class MainSystem
{

	public void mainMenu(List<String> listData,String USER_DATA)
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
			distributeSevice(select, scan, USER_DATA);
		}
		
		
	}
	
	private List<>
	

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
				if(selectNum<1||selectNum>4)
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
	
	private void distributeSevice(int selectNum, Scanner scan, String USER_DATA)
	{
		switch(selectNum)
		{
		case 1:
			LoginSystem login = new LoginSystem();
			login.loginSystem(scan);
			break;
		case 2:
			SignUpSystem signup = new SignUpSystem();
			signup.system(scan);
			break;
		case 3:
			postNumberSearch(scan);
			break;
		case 4: exitFlag = true;
		}
	}
	
	
	private void goLoginSystem()
	{
		
	}
	
	
}
