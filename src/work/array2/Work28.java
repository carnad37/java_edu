package work.array2;

import java.util.Scanner;

public class Work28 {

	public static void main(String[] args) {

		//�ٸ� ���
		/*
		
		�迭 int[5000]�� ����.
		������ �迭�� �ε���+1�� ���� �ִ´�.->5000����
		�ε����� ������ generator�� ���.
		generator�� �ش��ϴ� ���� �迭���� 0���� �ٲ���. ->5000�� ���׷����� ���.
		����� ������ ��� ���� �����ش�. ��.
		
		*/
		//���׷����͸� ���ϴ� �޼ҵ�
		//���� ���� ���׷����Ͱ� ���� ����.
		Scanner scan = new Scanner(System.in);
		Work28 w28 = new Work28();
		System.out.print("���ڸ� �Է����ּ��� : ");
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
