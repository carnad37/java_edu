package work.array2;

import java.util.Scanner;

public class Work24 {
	
	//x�� n�� �������� 1�� ������ ���� ������ �̷������̴�.
	//���� ������ �����ϴ� �����Ͽ��� n���� ū ���߿� ���� ������.
	//n�� �Է¹ް� 2������ ����
	//2������ 1�� ������ üũ�ϴ� �޼ҵ�
	//1�� ������ ���� �ڸ��� ���ڵ��� ����(ex 2��->10~99, 3��->100~999)
	//n���� Ŀ���¼��� �ٷ� break;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Work24 w24 = new Work24();
		System.out.print("���ڸ� �Է����ּ��� : ");
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
