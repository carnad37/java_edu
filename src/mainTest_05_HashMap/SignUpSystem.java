package mainTest_05_HashMap;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SignUpSystem 
{
	public void signUpSystem(Scanner scan, List<String> list, String userDataPath)
	{
		FileWrite filewrite = new FileWrite();
		
		String[] signFormat = list.get(0).split(",");
		String[] formatName = {"아이디","패스워드","이름","주민번호","이메일","우편번호","주소","상세주소","전화번호","가입일자"};

		System.out.println("======================================");
		System.out.println("회원가입 페이지 입니다.");
		System.out.println("아래에 정보를 입력해주세요.");
		System.out.println("======================================");
		
		while(true)
		{
			saveID(signFormat, formatName, scan);
			savePW(signFormat, formatName, scan);
			saveName(signFormat, formatName, scan);
			saveSNumber(signFormat, formatName, scan);
			saveEmail(signFormat, formatName, scan);
			saveZipCode(signFormat, formatName, scan);
			saveAdress1(signFormat, formatName, scan);
			saveAdress2(signFormat, formatName, scan);
			savePhoneNumber(signFormat, formatName, scan);
			saveRegedit(signFormat, formatName, scan);
		
			boolean signUpSelect = singUpProcess(signFormat, formatName, list, scan);
			if(signUpSelect)
			{
				filewrite.writeSystem(list, userDataPath);
				break;
			}
			else
			{
				System.out.println("다시 회원 정보를 입력하시겠습니까?");
				boolean answer = setAnswer(scan);
				if(!answer)
				{
					break;
				}
			}
		}
		System.out.println("회원가입을 종료합니다.");		
		
	}
	private void saveID(String[] signFormat, String[] formatName, Scanner scan)
	{
		System.out.println(formatName[0]+"를 입력해주세요");
		System.out.print(">");
		signFormat[0] = scan.nextLine();
	}
	
	private void savePW(String[] signFormat, String[] formatName, Scanner scan)
	{
		System.out.println(formatName[1]+"를 입력해주세요");
		System.out.print(">");
		signFormat[1] = scan.nextLine();
	}
	
	private void saveName(String[] signFormat, String[] formatName, Scanner scan)
	{
		System.out.println(formatName[2]+"을 입력해주세요");
		System.out.print(">");
		signFormat[2] = scan.nextLine();
	}
	
	private void saveSNumber(String[] signFormat, String[] formatName, Scanner scan)
	{
		System.out.println(formatName[3]+"를 입력해주세요");
		System.out.print(">");
		signFormat[3] = scan.nextLine();
	}
	
	private void saveEmail(String[] signFormat, String[] formatName, Scanner scan)
	{
		System.out.println(formatName[4]+"을 입력해주세요");
		System.out.print(">");
		signFormat[4] = scan.nextLine();
	}
	
	private void saveZipCode(String[] signFormat, String[] formatName, Scanner scan)
	{
		System.out.println(formatName[5]+"를 입력해주세요");
		System.out.print(">");
		signFormat[5] = scan.nextLine();
	}
	
	private void saveAdress1(String[] signFormat, String[] formatName, Scanner scan)
	{
		System.out.println(formatName[6]+"를 입력해주세요");
		System.out.print(">");
		signFormat[6] = scan.nextLine();
	}
	
	private void saveAdress2(String[] signFormat, String[] formatName, Scanner scan)
	{
		System.out.println(formatName[7]+"를 입력해주세요");
		System.out.print(">");
		signFormat[7] = scan.nextLine();
	}
	
	private void savePhoneNumber(String[] signFormat, String[] formatName, Scanner scan)
	{
		System.out.println(formatName[8]+"를 입력해주세요");
		System.out.print(">");
		signFormat[8] = scan.nextLine();
	}
	
	private void saveRegedit(String[] signFormat, String[] formatName, Scanner scan)
	{
		SimpleDateFormat timeformat = new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분");		
		Date daytime = new Date();
		
		String currenttime = timeformat.format(daytime);		
		signFormat[9] = currenttime;
	}
	
	private boolean singUpProcess(String[] signFormat, String[] formatName, List<String> list, Scanner scan)
	{
		for(int i=0;i<formatName.length;i++)
		{
			System.out.println(formatName[i]+" : "+signFormat[i]);
		}
		System.out.println("이 정보대로 회원가입하시겠습니까?");
		boolean answer = setAnswer(scan);
		if(answer)
		{
			System.out.println(signFormat[2]+"님, 회원이되신것을 환영합니다.");
			String data = joinStringArray(signFormat, ",");
			list.add(data);
			return true;
		}
		else
		{
			return false;
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
