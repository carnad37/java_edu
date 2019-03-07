package mainTest_02;

import java.util.*;

public class PasswordChecker {	
	//리스트를 받는다.
	//1.글자수 제한 8~20 ->1차 / 동시에 String 생성.
	//2.영문,숫자,특수문자가 각각 1개 이상 포함되어야한다. ->최종 검사까지 가는과정에서 확인 가능 ->불값으로만들어서 매번 체크(2->마지막 확인)
	//3.<,>,(,),#,',/,|는 사용할수 없다. ->최종 검사까지 가는 과정에서 확인 가능.->매번검사(1)
	//4.연속되는 숫자열은 사용불가능하다. ->메소드 1개.(3-1)
	//5.3자리 이상 같은 문자열은 사용불가능하다. ->메소드 2개.(3-2)
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
		
		if(lengthChecker(length))	//암호 길이체크
		{
			return error;
		}
		char[] targetArray = new char[length];
		
		setCharArray(target,targetArray);
		
		for(int i=0;i<length;i++)
		{
			if(compareWord(targetArray, i))	//암호 금지문자 체크
			{
				return error;
			}
			
			if(i!=length-1)	//i가 마지막자리면 다음 값과 비교하면 안된다(다음자리랑 비교)
			{
				boolean repeatWord = setRepeatWordFlag(targetArray[i],targetArray[i+1],pwcValue);	//반복문 여부 확인.
				if(repeatWord)
				{
					return error;
				}	
				
				boolean chainNumber = setChainNumberFlag(targetArray[i],targetArray[i+1],pwcValue);	//연속된 숫자 여부 확인.
				if(chainNumber)
				{
					return error;
				}		
			}
			
			setWordFlag(targetArray, i, pwcValue);	// 숫자여부, 영어여부, 특수문자 플래그 체크		
			
		}
		if(!(pwcValue.nFlag&&pwcValue.aFlag&&pwcValue.sFlag))	//숫자여부 확인.
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
