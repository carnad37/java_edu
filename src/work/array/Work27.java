package work.array;

import java.util.Scanner;

public class Work27 {
	
	//숫자를 입력받고 숫자들이 한번씩 사용되었는지 확인한다.
	
	public static void main(String[] args) {
		
		//String으로 입력받고 char[]에 담는다.
		Work27 w27 = new Work27();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		String inputNum = scan.nextLine();
		
		int[] numArray = w27.setStringToChar(inputNum);
		w27.printCheckRepeatNumber(numArray);
		
				
	}
	
	public int[] setStringToChar(String str)
	{
		int[] intArray = new int[str.length()];
		for(int i=0;i<intArray.length;i++)
		{
			intArray[i]=str.charAt(i)-48;
		}
		return intArray;
	}
	
	public void printCheckRepeatNumber(int[] intArray)
	{
		//2가지 서치법
		//1.숫자들을 1로 쫙 비교->1이 2개이상 있을시 바로 break후 false리턴
		//2.한 숫자씩 0~9로 비교. count 한뒤, 다음숫자를 비교하고 count가 증감되는지 확인.
		boolean numberRepeat = true;
		mainLoop:
		for(int i=0;i<9;i++)
		{
			int count=0;
			for(int j=0;j<intArray.length;j++)
			{
				int value = intArray[j];
				if(i==value)
				{
					count++;
				}

				if(count>1)
				{
					numberRepeat = false;
					break mainLoop;
				}
			}
		}
		System.out.println(numberRepeat);
	}	
}
