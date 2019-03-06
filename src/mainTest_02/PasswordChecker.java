package mainTest_02;

import java.util.*;

public class PasswordChecker {
	
	private boolean aFlag;
	private boolean nFlag;
	private boolean sFlag;
	private	boolean repeatWordFlag=false;
	private boolean chainNumberFlag=false;
	public List<String> resultList=new ArrayList<String>();
	
	//리스트를 받는다.
	//1.글자수 제한 8~20 ->1차
	//2.영문,숫자,특수문자가 각각 1개 이상 포함되어야한다. ->최종 검사까지 가는과정에서 확인 가능
	//3.<,>,(,),#,',/,|는 사용할수 없다. ->최종 검사까지 가는 과정에서 확인 가능.
	//4.연속되는 숫자열은 사용불가능하다. ->메소드 1개.
	//5.3자리 이상 같은 문자열은 사용불가능하다. ->메소드 2개.
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
