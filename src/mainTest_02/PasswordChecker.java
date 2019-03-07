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
			PasswordCheckValue pwcValue = new PasswordCheckValue();
			if(wordChecker(pwcValue, list.get(i)))
			{
				list.remove(i);
			}
		}
	}
	
	private boolean wordChecker(PasswordCheckValue pwcValue, String target)
	{
		boolean error = true;
		int length = target.length();
		
		if(lengthChecker(length))	//��ȣ ����üũ
		{
			return error;
		}
		char[] targetArray = new char[length];
		
		setCharArray(target,targetArray);
		
		for(int i=0;i<length;i++)
		{
			if(compareWord(targetArray, i))	//��ȣ �������� üũ
			{
				return error;
			}
			
			if(i!=length-1)	//i�� �������ڸ��� ���� ���� ���ϸ� �ȵȴ�(�����ڸ��� ��)
			{
				boolean repeatWord = setRepeatWordFlag(targetArray[i],targetArray[i+1],pwcValue);	//�ݺ��� ���� Ȯ��.
				if(repeatWord)
				{
					return error;
				}	
				
				boolean chainNumber = setChainNumberFlag(targetArray[i],targetArray[i+1],pwcValue);	//���ӵ� ���� ���� Ȯ��.
				if(chainNumber)
				{
					return error;
				}		
			}
			
			setWordFlag(targetArray, i, pwcValue);	// ���ڿ���, �����, Ư������ �÷��� üũ		
			
		}
		if(!(pwcValue.nFlag&&pwcValue.aFlag&&pwcValue.sFlag))	//���ڿ��� Ȯ��.
		{
			return error;
		}
		return false;
	}
	
	private boolean lengthChecker(int length)
	{
		if(length<8||length>20)
		{
			return true;
		}
		return false;
	}
	
	private boolean compareWord(char[] targetArray, int index)
	{
		char[] compareWord = {'<','>','(',')','#','\'','|'};
		for(char value:compareWord)
		{
			if(value==targetArray[index])
			{
				return true;
			}
		}
		return false;
	}
	
	private void setWordFlag(char[] targetArray, int index, PasswordCheckValue pwcValue)
	{
		if(!pwcValue.nFlag||!pwcValue.aFlag||!pwcValue.sFlag)
		{
			int value = (int)targetArray[index];
			if(value>=48&&value<=57)
			{
				pwcValue.nFlag = true;
			}
			else if((value>=97&&value<=122)||(value>=65&&value<=90))
			{
				pwcValue.aFlag = true;
			}
			else
			{
				pwcValue.sFlag = true;
			}
		}
	}
	
	private void setCharArray(String word, char[] target)
	{
		for(int i=0;i<target.length;i++)
		{
			target[i]=word.charAt(i);
		}
	}
	
	
	private boolean setRepeatWordFlag(char preValue, char postValue, PasswordCheckValue pwcValue)
	{
		if(preValue==postValue)
		{
			if(!pwcValue.repeatWordFlag)
			{
				pwcValue.repeatWordFlag=true;
				return false;
			}
			else
			{
				pwcValue.repeatWordFlag=false;
				return true;
			}
		}
		return false;
	}
	
	
	private boolean setChainNumberFlag(char preValue, char postValue, PasswordCheckValue pwcValue)
	{
		if((int)preValue+1==(int)postValue)
		{
			if(!pwcValue.chainNumberFlag)
			{
				pwcValue.chainNumberFlag=true;
				return false;
			}
			else
			{
				pwcValue.chainNumberFlag=false;
				return true;
			}
		}
		return false;
	}
}
