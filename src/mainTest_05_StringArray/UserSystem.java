package mainTest_05_StringArray;


public class UserSystem
{
	
	public void userSystem(UserDataValue userdata)
	{
		CurrentUserData currnetuser = new CurrentUserData();
		currnetuser.setStringArrayToUserData(userdata.userNumber, userdata.userData);
		
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
			int select = MainSystem.selectInputSystem(1,5);
			boolean exitFlag = distributeSevice(select, currnetuser);
			if(exitFlag)
			{
				System.out.println("로그아웃합니다.");
				break;
			}
			else
			{
				saveCurrentUserData(userdata, currnetuser);
			}
		}
	}
	
	
	private boolean distributeSevice(int select, CurrentUserData currnetuser)
	{
		switch(select)
		{
		case 1:
			setPassWord(currnetuser);
			break;
		case 2:
			setEmail(currnetuser);
			break;
		case 3:
			setAdress(currnetuser);
			break;
		case 4: 
			setPhoneNumber(currnetuser);
			break;
		case 5: return true;
		}
		return false;
	}
	
	private void saveCurrentUserData(UserDataValue userdata, CurrentUserData currnetuser)
	{
		String[] currentUserDataArray = currnetuser.setUserDataToStringArray();
		String newData = currnetuser.joinStringArray(currentUserDataArray, ",");
		
		userdata.userList.set(userdata.userNumber, newData);
		
		FileWrite filewrite = new FileWrite();
		filewrite.writeSystem(userdata.userList, userdata.userDataPath);
	}
	
	private void setPassWord(CurrentUserData currnetuser)
	{
		System.out.println("변경할 비밀번호를 입력해주세요.");
		String newPW=null;
		mainLoop:
		while(true)
		{
			System.out.print(">");
			newPW = MainSystem.scan.nextLine();
			System.out.println("비밀번호를 확인해주세요.");
			for(int i=3;i>0;i--)
			{
				System.out.print(">");
				String pwCheck = MainSystem.scan.nextLine();
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
		currnetuser.password = newPW;
	}
	
	private void setEmail(CurrentUserData currnetuser)
	{
		String newEmail=null;
		while(true)
		{
			System.out.println("변경할 이메일을 입력해주세요.");
			System.out.print(">");
			newEmail = MainSystem.scan.nextLine();
			System.out.println("");
			System.out.println("이메일 : "+newEmail);
			System.out.println("입력하신 정보가 맞으십니까?");
			boolean answer = MainSystem.setAnswer();
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
		currnetuser.email = newEmail;
	}
	
	private void setPhoneNumber(CurrentUserData currnetuser)
	{
		String newPN=null;
		while(true)
		{
			System.out.println("변경할 전화번호을 입력해주세요.");
			System.out.print(">");
			newPN = MainSystem.scan.nextLine();
			System.out.println("");
			System.out.println("전화번호 : "+newPN);
			System.out.println("입력하신 정보가 맞으십니까?");
			boolean answer = MainSystem.setAnswer();
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
		currnetuser.phone = newPN;
	}
	
	private void setAdress(CurrentUserData currnetuser)
	{
		String newAdress1=null, newAdress2=null;
		while(true)
		{
			System.out.println("변경할 주소을 입력해주세요.");
			System.out.print(">");
			newAdress1 = MainSystem.scan.nextLine();
			System.out.println("상세 주소을 입력해주세요.");
			System.out.print(">");
			newAdress2 = MainSystem.scan.nextLine();
			System.out.println("");
			System.out.println("주소 : "+newAdress1);
			System.out.println("상세주소 : "+newAdress2);
			System.out.println("입력하신 정보가 맞으십니까?");
			boolean answer = MainSystem.setAnswer();
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
		currnetuser.adress1 = newAdress1;
		currnetuser.adress2 = newAdress2;
	}
}
