package work.array;

import java.util.Scanner;

public class Work26 {
	
	public static void main(String[] args)
	{
		
		//첫 번째 계산
		//아이들은 여러 자리 숫자들을 더하기 위해서 우에서 좌로 숫자를 하나씩 차례대로 더 하라고 배웠다.
		//1을 한 숫자 위치에서 다음 자리로 더하기위해 이동하는 "한자리올림"연산을 많이 발견하는 것은 중요한 도전이 된다.
		//당신의 일은 교육자가 그들의 어려움을 평가하기 위하여, 덧셈 문제들의 각 집합에 대해서 한자리올림 연산들의 수를 계산하는 것이다.
		
		Scanner scan = new Scanner(System.in);		
		while(true)
		{
			//입력된 값이 0이면 break;
			Work26 w26 = new Work26();
			System.out.print("입력값을 적어주세요(입력값은 숫자+스페이스+숫자의 형식) : ");
			String inputData = scan.nextLine();
			char[] charArray = new char[inputData.length()];
			int space = 0;
			for(int i=0;i<charArray.length;i++)
			{
				charArray[i]=inputData.charAt(i);
				if(charArray[i]==' ')
				{
					space = i;
				}
				//사이는 스페이스로 구분된다.
			}
			if(charArray[0]=='0')
			{
				//시스템이 종료되는 경우.
				System.out.println("시스템을 종료합니다.");
				break;
			}
			w26.printCalData(charArray, space);
			
		}
		
	}
	public void printCalData(char[] charArray,int space)
	{
		int calNumber = charArray.length-(space+1);
		if(calNumber>space)
		{
			calNumber = space;
		}
		int count=0, result=0, nextUp=0;
		for(int i=1;i<calNumber+1;i++)
		{
			
			result = charArray[space-i]+charArray[charArray.length-i]-96;
			result += nextUp;
			if(result>=10)
			{
				count++;
				nextUp = 1;
				
			}
			else
			{
				nextUp = 0;
			}
			
		}
		if(count>0)
		{
			System.out.println(count+" carry opereation");		
		}
		else
		{
			System.out.println("No carry opereation");		
		}
	}
}
