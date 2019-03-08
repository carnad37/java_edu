package mainTest_02;

import java.util.*;

public class PasswordChecker {	
	//����Ʈ�� �޴´�.
	//1.���ڼ� ���� 8~20 ->1�� / ���ÿ� String ����.
	//2.����,����,Ư�����ڰ� ���� 1�� �̻� ���ԵǾ���Ѵ�. ->���� �˻���� ���°������� Ȯ�� ���� ->�Ұ����θ��� �Ź� üũ(2->������ Ȯ��)
	//3.<,>,(,),#,',/,|�� ����Ҽ� ����. ->���� �˻���� ���� �������� Ȯ�� ����.->�Ź��˻�(1)
	//4.���ӵǴ� ���ڿ��� ���Ұ����ϴ�. ->�޼ҵ� 1��.(3-1)
	//5.3�ڸ� �̻� ���� ���ڿ��� ���Ұ����ϴ�. ->�޼ҵ� 2��.(3-2)
	public void passwordCheckSystem(List<String> list)
	{
		int listLength = list.size();
		for(int i=listLength-1;i>=0;i--)
		{
			boolean error = wordChecker(list.get(i));
			if(error)
			{
				list.remove(i);
			}
		}
	}
	
	private boolean wordChecker(String target)
	{
		boolean error = false;
		
		error = lengthChecker(target);	//��ȣ ����üũ.
		if(error)
		{
			return error;
		}
		
		error = setWordFlag(target);	//��ȣ�� ���Ե� ���� ���� Ȯ��.
		if(error)	
		{
			return error;
		}
		
		error = compareWord(target);	//���� ���� Ȯ��.
		if(error)	
		{
			return error;
		}
		
		error = setChainNumberFlag(target);	//���ӵ� ���� Ȯ��.
		if(error)	
		{
			return error;
		}
		
		error = setRepeatWordFlag(target);	//���ӵ� ���� ���� Ȯ��.
		if(error)	
		{
			return error;
		}
		
		//1
		
		return error;
	}
	
	private boolean lengthChecker(String target)
	{
		int length = target.length();
		if(length<8||length>20)
		{
			return true;
		}
		return false;
	}
	
	private boolean setWordFlag(String target)
	{
		char[] targetArray = target.toCharArray();
		boolean alphaFlag=false;
		boolean numberFlag=false;
		boolean symbolFlag=false;
		for(char value:targetArray)
		{
			int intValue = (int)value;
			
			if(intValue>96&&intValue<123)	//���� �빮��
			{
				if(alphaFlag)
				{
					continue;
				}
				alphaFlag = true;
			}
			else if(intValue>64&&intValue<91)	//���� �ҹ���
			{
				if(alphaFlag)
				{
					continue;
				}
				alphaFlag = true;
			}
			else if(intValue>47&&intValue<58)	//����
			{
				if(numberFlag)
				{
					continue;
				}
				numberFlag = true;
			}
			else
			{
				if(symbolFlag)
				{
					continue;
				}
				symbolFlag = true;
			}
			
			if(alphaFlag&&numberFlag&&symbolFlag)	//��� �÷��װ� true�� �Ǹ� �ݺ� ����
			{
				return false;
			}
		}
		return true;
	}	
	
	//2
	
	private boolean compareWord(String target)
	{
		char[] compareWord = {'<','>','(',')','#','\'','|'};
		for(char value:compareWord)
		{
			int res = target.indexOf(value);
			if(res>=0)
			{
				return true;
			}
		}
		return false;
	}	
	
	private boolean setRepeatWordFlag(String target)
	{
		boolean repeatWordFlag = false;
		char[] targetArray = target.toCharArray();
		for(int i=0;i<targetArray.length-1;i++)
		{
			if(targetArray[i]==targetArray[i+1])
			{
				if(repeatWordFlag)
				{
					return true;
				}
				else
				{
					repeatWordFlag = true;
				}
			}
			else
			{
				repeatWordFlag = false;
			}
		}
		return false;
	}
	
	
	private boolean setChainNumberFlag(String target)
	{
		boolean chainNumberFlag = false;
		char[] targetArray = target.toCharArray();
		for(int i=0;i<targetArray.length-1;i++)
		{
			if((targetArray[i]+1)==targetArray[i+1])
			{
				if(chainNumberFlag)
				{
					return true;
				}
				else
				{
					chainNumberFlag = true;
				}
			}
			else
			{
				chainNumberFlag = false;
			}
		}
		return false;
	}
}

//1

//char[] targetArray = setCharArray(target, length);
//char[] targetArray = target.toCharArray();
//
//for(int i=0;i<length;i++)
//{
//	error = compareWord(targetArray, i);
//	if(error)	//��ȣ �������� üũ
//	{
//		return error;
//	}
//	
//	if(i!=length-1)	//i�� �������ڸ��� ���� ���� ���ϸ� �ȵȴ�(�����ڸ��� ��)
//	{
//		error = setRepeatWordFlag(targetArray[i],targetArray[i+1],pwcValue);	//�ݺ��� ���� Ȯ��.
//		if(error)
//		{
//			return error;
//		}	
//		
//		error = setChainNumberFlag(targetArray[i],targetArray[i+1],pwcValue);	//���ӵ� ���� ���� Ȯ��.
//		if(error)
//		{
//			return error;
//		}		
//	}
//	
//	setWordFlag(targetArray[i], pwcValue);	// ���ڿ���, �����, Ư������ �÷��� üũ
//
//}
//error=!(pwcValue.numberFlag&&pwcValue.alphaFlag&&pwcValue.symbolFlag);	//���ڿ��� Ȯ��.
//if(error)	
//{
//	return error;
//}


//2

//private boolean setAlphaFlag(int value)
//{
//	int res = (int)value;
//	if(res>96&&res<123)	//���ĺ� �ҹ���
//	{
//		return true;
//	}
//	else if(res>64&&res<91)	//���ĺ� �빮��
//	{
//		return true;
//	}
//	return false;
//}
//private boolean setNumberFlag(int value)
//{
//	int res = (int)value;
//	if(res>47&&res<58)
//	{
//		return true;
//	}
//	return false;
//}
//
//private boolean setSymbolFlag(int value)
//{
//	boolean notAlpha = !setAlphaFlag(value);
//	boolean notNumber = !setNumberFlag(value);
//	if(notAlpha&&notNumber)
//	{
//		return true;
//	}
//	return false;
//}

//private char[] setCharArray(String word)
//{
//	int length = word.length();
//	char[] wordArray = new char[length];
//	for(int i=0;i<length;i++)
//	{
//		wordArray[i]=word.charAt(i);
//	}
//	return wordArray;
//}