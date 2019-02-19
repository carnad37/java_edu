package work.algorithm;

import java.util.Scanner;

public class TestFourMaxMin {
	
	public static void main(String[] args) {
		
//		int a = 
//		int b = 
//		int c = 
//		int d =
		Scanner sc = new Scanner(System.in); 
		int[] num = new int[4];
		for(int i=0;i<4;i++)
		{
			System.out.print("숫자를 입력해주세요: ");
			int inputNum = sc.nextInt();
			num[i]=inputNum;
		}
		int ret = max4(num[0],num[1],num[2],num[3]);
		System.out.println(ret);
				
		
	}

	public static int max4(int a, int b, int c, int d)
	{
		int max1,max2;
		if(a>b)
		{
			max1 = a;
		}
		else
		{
			max1 = b;
		}
		if(c>d)
		{
			max2 = c;
		}
		else
		{
			max2 = d;
		}
		if(max1>max2)
		{
			return max1;
		}
		else
		{
			return max2;
		}
//		max1 = a;
//		if(max1<b)
//		{
//			max1 = b;
//		}
//		if(max1<c)
//		{
//			max1 = c;
//		}
//		if(max1<d)
//		{
//			max1 = d;
//		}
//		return max1;
	}
	public static int min3(int a, int b, int c)
	{
		int min;
		if(a>b)
		{
			min = b;
		}
		else
		{
			min = a;
		}
		if(min>c)
		{
			return c;
		}
		else
		{
			return min;
		}
	}
	public static int min4(int a, int b, int c, int d)
	{
		int min = a;
		if(min>b)
		{
			min = b;
		}
		if(min>c)
		{
			min = c;
		}
		if(min>d)
		{
			min = d;
		}
		return min;
	}

	
}
