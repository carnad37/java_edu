package mainTest_05_StringArray;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserSystem
{
	public void userSystem(int userIndex,  List<Map<String, String>> userdata, List<String> list, Scanner scan, String userDataPath)
	{
		System.out.println("======================================");
		System.out.println("유저 페이지 입니다.");
		while(true)
		{
			System.out.println("======================================");
			System.out.println("");
			System.out.println("1.비밀번호 변경");
			System.out.println("2.이메일주소 변경");
			System.out.println("3.주소 및 상세주소 변경");
			System.out.println("4.전화번호 변경");
			System.out.println("5.종료");
			System.out.println("");
			System.out.println("======================================");
			int select = selectInputSystem(scan);
			boolean exitFlag = distributeSevice(userIndex,select,scan,userDataPath,list,userdata);
			if(exitFlag)
			{
				System.out.println("로그아웃합니다.");
				break;
			}
		}
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
				if(selectNum<1||selectNum>5)
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
	
	private boolean distributeSevice(int userIndex, int selectNum, Scanner scan, String userDataPath, List<String> list, List<Map<String,String>> userdata)
	{
		switch(selectNum)
		{
		case 1:
			setPassWord(userIndex,scan,userDataPath,list,userdata);
			break;
		case 2:
			setEmail(userIndex,scan,userDataPath,list,userdata);
			break;
		case 3:
			setAdress(userIndex,scan,userDataPath,list,userdata);
			break;
		case 4: 
			setPhoneNumber(userIndex,scan,userDataPath,list,userdata);
			break;
		case 5: return true;
		}
		return false;
	}
	
	private void setPassWord(int userNumber, Scanner scan, String userDataPath, List<String> list, List<Map<String, String>> userdata)
	{
		System.out.println("변경할 비밀번호를 입력해주세요.");
		String newPW=null;
		mainLoop:
		while(true)
		{
			System.out.print(">");
			newPW = scan.nextLine();
			System.out.println("비밀번호를 확인해주세요.");
			for(int i=3;i>0;i--)
			{
				System.out.print(">");
				String pwCheck = scan.nextLine();
				if(newPW.equals(pwCheck))
				{
					break mainLoop;
				}
				else
				{
					System.out.println("잘못된 비밀번호입니다.");
					System.out.println("다시 입력해주세요.");
					System.out.println("(남은 확인 횟수 : "+(i-1)+"회)");
				}
			}
			System.out.println("변경할 비밀번호를 다시 입력해주세요.");
		}
		String rawData = list.get(userNumber);
		String oldPW = userdata.get(userNumber).get("비밀번호");
		rawData = rawData.replace(oldPW, newPW);
		list.set(userNumber, rawData);

		FileWrite filewrite = new FileWrite();
		filewrite.writeSystem(list, userDataPath);
		return;
	}
	
	private void setEmail(int userIndex, Scanner scan, String userDataPath, List<String> list, List<Map<String,String>> userdata)
	{
		String newEmail=null;
		while(true)
		{
			System.out.println("변경할 이메일을 입력해주세요.");
			System.out.print(">");
			newEmail = scan.nextLine();
			System.out.println("");
			System.out.println("이메일 : "+newEmail);
			System.out.println("입력하신 정보가 맞으십니까?");
			boolean answer = setAnswer(scan);
			if(answer)
			{
				break;
			}
			else
			{
				System.out.println("다시 입력해주세요.");
				System.out.println("");
			}
		}
		
		String rawData = list.get(userIndex);
		String oldEmail = userdata.get(userIndex).get("이메일");
		rawData = rawData.replace(oldEmail, newEmail);
		list.set(userIndex, rawData);

		FileWrite filewrite = new FileWrite();
		filewrite.writeSystem(list, userDataPath);
		return;
	}
	
	private void setPhoneNumber(int userNumber, Scanner scan, String userDataPath, List<String> list, List<Map<String,String>> userdata)
	{
		String newPN=null;
		while(true)
		{
			System.out.println("변경할 이메일을 입력해주세요.");
			System.out.print(">");
			newPN = scan.nextLine();
			System.out.println("");
			System.out.println("전화번호 : "+newPN);
			System.out.println("입력하신 정보가 맞으십니까?");
			boolean answer = setAnswer(scan);
			if(answer)
			{
				break;
			}
			else
			{
				System.out.println("다시 입력해주세요.");
				System.out.println("");
			}
		}
		
		String rawData = list.get(userNumber);
		String oldPN = userdata.get(userNumber).get("이메일");
		rawData = rawData.replace(oldPN, newPN);
		list.set(userNumber, rawData);

		FileWrite filewrite = new FileWrite();
		filewrite.writeSystem(list, userDataPath);
		return;
	}
	
	private void setAdress(int userNumber, Scanner scan, String userDataPath, List<String> list, List<Map<String,String>> userdata)
	{
		String newAdress1=null, newAdress2=null;
		while(true)
		{
			System.out.println("변경할 주소을 입력해주세요.");
			System.out.print(">");
			newAdress1 = scan.nextLine();
			System.out.println("상세 주소을 입력해주세요.");
			System.out.print(">");
			newAdress2 = scan.nextLine();
			System.out.println("");
			System.out.println("주소 : "+newAdress1);
			System.out.println("상세주소 : "+newAdress2);
			System.out.println("입력하신 정보가 맞으십니까?");
			boolean answer = setAnswer(scan);
			if(answer)
			{
				break;
			}
			else
			{
				System.out.println("다시 입력해주세요.");
				System.out.println("");
			}
		}
	
		String rawData = list.get(userNumber);
		String oldAdress1 = userdata.get(userNumber).get("주소");
		String oldAdress2 = userdata.get(userNumber).get("상세주소");
		rawData = rawData.replace(oldAdress1, newAdress1);
		rawData = rawData.replace(oldAdress2, newAdress2);

		list.set(userNumber, rawData);

		FileWrite filewrite = new FileWrite();
		filewrite.writeSystem(list, userDataPath);
		return;
	}
	
	private boolean setAnswer(Scanner scan)
	{
		while(true)
		{
			System.out.print("(y/n) >");
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
