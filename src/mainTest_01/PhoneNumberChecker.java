package mainTest_01;

import java.util.*;

public class PhoneNumberChecker
{
	//������ ����Ʈ�� ����.
	public List<String> mainSystem(List<String> list)
	{
		List<String> contactList = new ArrayList<String>();
		for(int i=0; i<list.size();i++)
		{
			String res = list.get(i);
			boolean error = correctTest(res);
			if(!error)
			{
				contactList.add(res);
			}
		}
		return contactList;
	}	

	private boolean correctTest(String target)
	{
		boolean error = false;
		String[] targetArray = target.split(" ");
		error = numberTypeChecker(targetArray);
		
		if(error)
		{
			System.out.println("��ȭ��ȣ�� ���� ���� ��ȣ�� �ԷµǾ����ϴ�.");
			return error;
		}
		
		error = numberCountCheck(targetArray);
		
		if(error)
		{
			System.out.println("��ȭ��ȣ�� ������ �߸��Ǿ����ϴ�.");
			return error;
		}
		
		return error;
		
	}
	
	private boolean numberCountCheck(String[] targetArray)
	{
		int length = targetArray[0].length();
		if(length!=3)
		{
			return true;
		}
		
		length = targetArray[1].length();		
		if((length!=4)&&(length!=3))
		{
			return true;
		}
		
		length = targetArray[2].length();			
		if(length!=4)
		{
			return true;
		}
		return false;
	}
	
	
	private boolean numberTypeChecker(String[] targetArray)
	{
		for(String value:targetArray)
		{
			try
			{
				int check = Integer.parseInt(value);
			}
			catch(NumberFormatException e)
			{
				return true;
			}	
		}	
		return false;
	}
}
