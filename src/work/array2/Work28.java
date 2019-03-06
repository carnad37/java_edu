package work.array2;

import java.util.Scanner;

public class Work28 {

	public static void main(String[] args) {

		//다른 방법
		/*
		
		배열 int[5000]을 선언.
		각각의 배열에 인덱스+1의 값을 넣는다.->5000시행
		인덱스를 값으로 generator를 계산.
		generator에 해당하는 값을 배열에서 0으로 바꿔줌. ->5000번 제네레이터 계산.
		결과가 끝난뒤 모든 값을 합쳐준다. 끝.
		
		*/
		//제네레이터를 구하는 메소드
		//셀프 숫자 제네레이터가 없는 숫자.
		Scanner scan = new Scanner(System.in);
		Work28 w28 = new Work28();
		System.out.print("숫자를 입력해주세요 : ");
		int sNum = scan.nextInt();
		scan.close();
		int sum = 0;
		int[] numArray = new int[sNum];
		for(int i=0;i<sNum;i++)
		{
			numArray[i]=i+1;
		}
		for(int i=0;i<sNum;i++)
		{
			int res = w28.calGenerator(i+1);
			if(res<=sNum&&numArray[res-1]!=0)
			{
				numArray[res-1]=0;
			}
		}
		for(int i=0;i<sNum;i++)
		{
			if(numArray[i]!=0)
			{
				sum+=numArray[i];
			}
		}
		
//		for(int i=1;i<sNum;i++)
//		{
//			boolean result = w28.checkGenerator(i);
//			if(!result)
//			{
//				sum+=i;
//			}
//		}
		System.out.println(sum);
		
	}
		
	
//	public boolean checkGenerator(int target)
//	{
//		boolean result = false;
//		for(int i=1;i<target;i++)
//		{
//			if(calGenerator(i)==target)
//			{
//				result = true;
//				break;
//			}
//		}
//		return result;
//	}
	
	public int calGenerator(int target)
	{
		String num = String.valueOf(target);
		int length = num.length();
//		char[] targetArray = new char[length];
		int sum = 0;
		for(int i=0;i<length;i++)
		{
			sum += ((int)num.charAt(i) - 48);
		}
		sum+=target;
		return sum;		
	}
	
}
