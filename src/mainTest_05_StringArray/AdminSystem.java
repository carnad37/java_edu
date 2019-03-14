package mainTest_05_StringArray;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class AdminSystem
{
	
	public void adminSystem(List<String[]> userdata, List<String> list, Scanner scan, String userDataPath)
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
			int select = selectInputSystem(scan);
			boolean exitFlag = distributeSevice(select,userdata,list,scan,userDataPath);
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
	
	private boolean distributeSevice(int selectNum, List<String[]> userdata, List<String> list, Scanner scan, String userDataPath)
	{
		switch(selectNum)
		{
		case 1:
			adminSearch(userdata,scan,0);
			break;
		case 2:
			adminSearch(userdata,scan,1);
			break;
		case 3:
			resetPassWord(userdata, list, scan, userDataPath);
			break;
		case 4: return true;
		}
		return false;
	}
	
	private void resetPassWord(List<String[]> userdata, List<String> list,  Scanner scan,  String userDataPath)
	{

		System.out.println("대상의 아이디를 입력해주세요");
		System.out.print(">");
		String target = scan.nextLine();
		for(int i=1;i<userdata.size();i++)
		{
			String res = userdata.get(i)[0];
			if(target.equals(res))
			{
				FileWrite filewrite = new FileWrite();
				String rawData = list.get(i);
				String newPW = setRandomWord(8);
				System.out.println("newPW");
				String oldPW = userdata.get(i)[1];
				rawData = rawData.replace(oldPW, newPW);
				list.set(i, rawData);
				filewrite.writeSystem(list, userDataPath);
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
	
	private void idSearch(List<String[]> userdata, Scanner scan, int type)
	{
		String[] formatName = {"아이디","비밀번호","이름","주민번호","이메일","우편번호","주소","상세주소","전화번호","가입일자"};
		while(true)
		{
			System.out.println("아이디를 입력해주세요");
			System.out.print(">");
			String target = scan.nextLine();
			
			for(String[] value:userdata)
			{
				String res = value[0];
				if(target.equals(res))
				{
					for(int i=0;i<formatName.length;i++)
					{
						System.out.println(formatName[i]+" : "+value[i]);
					}
					return;
				}
			}
			System.out.println("대응하는 아이디가 없습니다.");
			System.out.println("다시 검색하시겠습니까?");
			boolean answer = setAnswer(scan);
			if(!answer)
			{
				return;
			}
		}
	}
	
	private void nameSearch(List<String[]> userdata, Scanner scan, int type)
	{
		String[] formatName = {"아이디","비밀번호","이름","주민번호","이메일","우편번호","주소","상세주소","전화번호","가입일자"};
		while(true)
		{
			System.out.println("이름을 입력해주세요");
			System.out.print(">");
			String target = scan.nextLine();
			
			for(String[] value:userdata)
			{
				String res = value[2];
				if(target.equals(res))
				{
					for(int i=0;i<formatName.length;i++)
					{
						System.out.println(formatName[i]+" : "+value[i]);
					}
					return;
				}
			}
			System.out.println("대응하는 이름이 없습니다.");
			System.out.println("다시 검색하시겠습니까?");
			boolean answer = setAnswer(scan);
			if(!answer)
			{
				return;
			}
		}
	}
	
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
	
	private String joinStringArray(String[] target, String word)
	{
		String returnWord = "";
		int length = target.length-1;
		for(int i=0;i<length;i++)
		{
			returnWord = returnWord+target[i]+word;
		}
		returnWord = returnWord+target[length];
		return returnWord;		
	}
}
