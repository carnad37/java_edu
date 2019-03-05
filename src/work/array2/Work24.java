package work.array2;

import java.util.Scanner;

public class Work24 {
	
	//x는 n의 이진수의 1의 갯수와 같은 갯수로 이뤄진수이다.
	//이전 조건을 만족하는 전제하에서 n보다 큰 수중에 가장 작은수.
	//n을 입력받고 2진수로 변경
	//2진수의 1의 갯수를 체크하는 메소드
	//1의 갯수와 같은 자리의 숫자들을 나열(ex 2개->10~99, 3개->100~999)
	//n보다 커지는순간 바로 break;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Work24 w24 = new Work24();
		System.out.print("숫자를 입력해주세요 : ");
		int num = scan.nextInt();
		scan.close();
		int oneCount = w24.binaryOneCheck(num);
		int result = w24.searchResultNumber(num, oneCount);
		System.out.println(result);
		
	}
	public int binaryOneCheck(int num)
	{
		int count=0;
		String binNum = Integer.toBinaryString(num);
		for(int i=0;i<binNum.length();i++)
		{
			char data = binNum.charAt(i);
			if(data=='1')
			{
				count++;
			}
		}
		return count;
	}
	public int searchResultNumber(int num, int count)
	{
		int res=num+1;
		while(true)
		{
			int resCount = binaryOneCheck(res);
			if(resCount==count)
			{
				break;
			}
			res++;
		}
		return res;
	}
}
