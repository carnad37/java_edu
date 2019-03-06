package mainTest_01;

import java.util.*;

public class PhoneNumberChecker
{
	
	List<String> contactList = new ArrayList<String>();
	
	public void mainSystem(List<String> list)
	{
		for(String value:list)
		{
			String res = correctTest(value);
			contactList.add(res);
		}		
	}
	

	private String correctTest(String target)
	{
		String[] targetArray = target.split(" ");
		String errorWord = " : ";
		boolean lengthError = false;
		boolean numError = false;
		boolean errorcheck = false;
		if(targetArray.length!=3)
		{
			errorcheck = true;
			errorWord += "전화번호의 구성이 잘못되었습니다. ";
		}
		for(int i=0;i<targetArray.length;i++)
		{
			if(!lengthError)
			{
				int length = targetArray[i].length();
				if((length>4)||(i==0&&length!=3)||(i==1&&length!=3&&length!=4)||(i==2&&length!=4))
				{
					lengthError = true;
					errorcheck = true;
					errorWord += "전화번호의 범위가 잘못되었습니다. ";
				}
			}
			if(!numError)
			{
				try
				{
					int check = Integer.parseInt(targetArray[i]);
				}
				catch(NumberFormatException e)
				{
					errorWord+="전화번호에 숫자 외의 다른 기호가 섞여있습니다. ";
					errorcheck = true;
					numError = true;
				}
			}

		}
		for(String value:targetArray)
		{
			try
			{
				int check = Integer.parseInt(value);
			}
			catch(NumberFormatException e)
			{
				errorcheck = true;
				errorWord+="전화번호에 숫자 외의 다른 기호가 섞여있습니다. ";
				break;
			}
		}
		if(errorcheck)
		{
			target+=errorWord;
		}
		return target;
	}
	

}
