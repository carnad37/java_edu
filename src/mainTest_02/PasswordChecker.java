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
		
		error = lengthChecker(target);	//암호 길이체크.
		if(error)
		{
			return error;
		}
		
		error = setWordFlag(target);	//암호에 포함된 문자 종료 확인.
		if(error)	
		{
			return error;
		}
		
		error = compareWord(target);	//금지 문자 확인.
		if(error)	
		{
			return error;
		}
		
		error = setChainNumberFlag(target);	//연속된 숫자 확인.
		if(error)	
		{
			return error;
		}
		
		error = setRepeatWordFlag(target);	//연속된 같은 문자 확인.
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
			
			if(intValue>96&&intValue<123)	//영어 대문자
			{
				if(alphaFlag)
				{
					continue;
				}
				alphaFlag = true;
			}
			else if(intValue>64&&intValue<91)	//영어 소문자
			{
				if(alphaFlag)
				{
					continue;
				}
				alphaFlag = true;
			}
			else if(intValue>47&&intValue<58)	//숫자
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
			
			if(alphaFlag&&numberFlag&&symbolFlag)	//모든 플래그가 true가 되면 반복 종료
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
//	if(error)	//암호 금지문자 체크
//	{
//		return error;
//	}
//	
//	if(i!=length-1)	//i가 마지막자리면 다음 값과 비교하면 안된다(다음자리랑 비교)
//	{
//		error = setRepeatWordFlag(targetArray[i],targetArray[i+1],pwcValue);	//반복문 여부 확인.
//		if(error)
//		{
//			return error;
//		}	
//		
//		error = setChainNumberFlag(targetArray[i],targetArray[i+1],pwcValue);	//연속된 숫자 여부 확인.
//		if(error)
//		{
//			return error;
//		}		
//	}
//	
//	setWordFlag(targetArray[i], pwcValue);	// 숫자여부, 영어여부, 특수문자 플래그 체크
//
//}
//error=!(pwcValue.numberFlag&&pwcValue.alphaFlag&&pwcValue.symbolFlag);	//숫자여부 확인.
//if(error)	
//{
//	return error;
//}


//2

//private boolean setAlphaFlag(int value)
//{
//	int res = (int)value;
//	if(res>96&&res<123)	//알파벳 소문자
//	{
//		return true;
//	}
//	else if(res>64&&res<91)	//알파벳 대문자
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