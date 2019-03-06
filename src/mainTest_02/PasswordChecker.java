package mainTest_02;

import java.util.*;

public class PasswordChecker {
	
	private boolean aFlag;
	private boolean nFlag;
	private boolean sFlag;
	private	boolean repeatWordFlag=false;
	private boolean chainNumberFlag=false;
	public List<String> resultList=new ArrayList<String>();
	
	//����Ʈ�� �޴´�.
	//1.���ڼ� ���� 8~20 ->1��
	//2.����,����,Ư�����ڰ� ���� 1�� �̻� ���ԵǾ���Ѵ�. ->���� �˻���� ���°������� Ȯ�� ����
	//3.<,>,(,),#,',/,|�� ����Ҽ� ����. ->���� �˻���� ���� �������� Ȯ�� ����.
	//4.���ӵǴ� ���ڿ��� ���Ұ����ϴ�. ->�޼ҵ� 1��.
	//5.3�ڸ� �̻� ���� ���ڿ��� ���Ұ����ϴ�. ->�޼ҵ� 2��.
	public void passwordCheckSystem(List<String> list)
	{
		for(String value:list)
		{
			aFlag = false;
			nFlag = false;
			sFlag = false;
			if(wordChecker(value))
			{
				continue;
			}
			resultList.add(value);
		}
	}
	private boolean wordChecker(String target)
	{
		boolean error = true;
		char[] compareWord = {'<','>','(',')','#','\'','|'};
		int length = target.length();
		if(length<8||length>20)
		{
			return error;
		}
		char[] targetArray = new char[length];
		setCharArray(target,targetArray);
		for(int i=0;i<length;i++)
		{
			boolean innerChecker = false;
			for(char value:compareWord)
			{
				if(value==targetArray[i])
				{
					return error;
				}
			}
			if(!nFlag||!aFlag||!sFlag)
			{
				int value = (int)targetArray[i];
				if(value>=48&&value<=57)
				{
					nFlag = true;
				}
				else if((value>=97&&value<=122)||(value>=65&&value<=90))
				{
					aFlag = true;
				}
				else
				{
					sFlag = true;
				}
			}
			if(i==length-1)
			{
				break;
			}
			innerChecker=setRepeatWordFlag(targetArray[i],targetArray[i+1]);
			if(innerChecker)
			{
				return error;
			}
			innerChecker=setChainNumberFlag(targetArray[i],targetArray[i+1]);
			if(innerChecker)
			{
				return error;
			}
			
		}
		if(!(nFlag&&aFlag&&sFlag))
		{
			return error;
		}
		return false;
	}
	private void setCharArray(String word, char[] target)
	{
		for(int i=0;i<target.length;i++)
		{
			target[i]=word.charAt(i);
		}
	}
	private boolean setRepeatWordFlag(char preValue, char postValue)
	{
		if(preValue==postValue)
		{
			if(!repeatWordFlag)
			{
				repeatWordFlag=true;
				return false;
			}
			else
			{
				repeatWordFlag=false;
				return true;
			}
		}
		return false;
	}
	private boolean setChainNumberFlag(char preValue, char postValue)
	{
		if((int)preValue+1==(int)postValue)
		{
			if(!chainNumberFlag)
			{
				chainNumberFlag=true;
				return false;
			}
			else
			{
				chainNumberFlag=false;
				return true;
			}
		}
		return false;
	}
}
