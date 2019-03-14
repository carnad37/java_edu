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
		String[] formatName = {"���̵�","�н�����","�̸�","�ֹι�ȣ","�̸���","�����ȣ","�ּ�","���ּ�","��ȭ��ȣ","��������"};

		System.out.println("======================================");
		System.out.println("ȸ������ ������ �Դϴ�.");
		System.out.println("�Ʒ��� ������ �Է����ּ���.");
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
				System.out.println("�ٽ� ȸ�� ������ �Է��Ͻðڽ��ϱ�?");
				boolean answer = setAnswer(scan);
				if(!answer)
				{
					break;
				}
			}
		}
		System.out.println("ȸ�������� �����մϴ�.");		
		
	}
	private void saveID(String[] signFormat, String[] formatName, Scanner scan)
	{
		System.out.println(formatName[0]+"�� �Է����ּ���");
		System.out.print(">");
		signFormat[0] = scan.nextLine();
	}
	
	private void savePW(String[] signFormat, String[] formatName, Scanner scan)
	{
		System.out.println(formatName[1]+"�� �Է����ּ���");
		System.out.print(">");
		signFormat[1] = scan.nextLine();
	}
	
	private void saveName(String[] signFormat, String[] formatName, Scanner scan)
	{
		System.out.println(formatName[2]+"�� �Է����ּ���");
		System.out.print(">");
		signFormat[2] = scan.nextLine();
	}
	
	private void saveSNumber(String[] signFormat, String[] formatName, Scanner scan)
	{
		System.out.println(formatName[3]+"�� �Է����ּ���");
		System.out.print(">");
		signFormat[3] = scan.nextLine();
	}
	
	private void saveEmail(String[] signFormat, String[] formatName, Scanner scan)
	{
		System.out.println(formatName[4]+"�� �Է����ּ���");
		System.out.print(">");
		signFormat[4] = scan.nextLine();
	}
	
	private void saveZipCode(String[] signFormat, String[] formatName, Scanner scan)
	{
		System.out.println(formatName[5]+"�� �Է����ּ���");
		System.out.print(">");
		signFormat[5] = scan.nextLine();
	}
	
	private void saveAdress1(String[] signFormat, String[] formatName, Scanner scan)
	{
		System.out.println(formatName[6]+"�� �Է����ּ���");
		System.out.print(">");
		signFormat[6] = scan.nextLine();
	}
	
	private void saveAdress2(String[] signFormat, String[] formatName, Scanner scan)
	{
		System.out.println(formatName[7]+"�� �Է����ּ���");
		System.out.print(">");
		signFormat[7] = scan.nextLine();
	}
	
	private void savePhoneNumber(String[] signFormat, String[] formatName, Scanner scan)
	{
		System.out.println(formatName[8]+"�� �Է����ּ���");
		System.out.print(">");
		signFormat[8] = scan.nextLine();
	}
	
	private void saveRegedit(String[] signFormat, String[] formatName, Scanner scan)
	{
		SimpleDateFormat timeformat = new SimpleDateFormat("yyyy�� mm�� dd�� hh�� mm��");		
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
		System.out.println("�� ������� ȸ�������Ͻðڽ��ϱ�?");
		boolean answer = setAnswer(scan);
		if(answer)
		{
			System.out.println(signFormat[2]+"��, ȸ���̵ǽŰ��� ȯ���մϴ�.");
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
				System.out.println("�߸��� �Է��Դϴ�.");
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
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}	
}
