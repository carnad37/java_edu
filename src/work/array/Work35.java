package work.array;

import java.util.Scanner;

class SetData
{
	int[] setArray;
	int compare;
	SetData(int number, int compare)
	{
		setArray = new int[number];
		this.compare = compare;
	}
	
}

public class Work35 {

	
	public static void main(String[] args) {
		
		/*
		
		2�����̶�, � �ڿ����� 0�� 1�θ� ��Ÿ���� ���̴�.
		���� ��� 73�� 64(2^6)+8(2^3)+1(2^0)�̱� ������ 1001001���� ǥ���Ѵ�.
		� ���ڸ� �Է¹޾��� �� �� ���ڸ� 2�������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		(Integer.toBinaryString() ������)
		
		*/
		
		//1.�Էµ� ������ ū 2�� ������ ���Ѵ�.
		//2.������ ���� ���� 2�� ������ �Էµȼ����� ����.
		//3.�ϳ��� �������鼭 ���ְ�, üũ�Ѵ�.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		int inputNum = scan.nextInt();
		Work35 w35 = new Work35();
		SetData stD = w35.setBinaryNumber(inputNum);
		String result = w35.setStringNumber(stD, inputNum);
		scan.close();
		
		System.out.println("2�������� ��ȯ�ϸ�, "+result+"�̴�.");
	}
	public SetData setBinaryNumber(int inputNum)
	{
		int compare = 1;
		int count = 1;
		while(true)
		{
			if(inputNum<compare)
			{
				break;
			}
			count++;
			compare*=2;
		}
		compare/=2;
		count--;
		SetData stD = new SetData(count,compare);
		return stD;
	}
	public String setStringNumber(SetData stD, int num)
	{
		int count = 0;
		while(true)
		{
			if(num==0)
			{
				break;
			}
			if(num>=stD.compare)
			{
				num-=stD.compare;
				stD.setArray[count]=1;
			}	
			stD.compare/=2;
			count++;
		}
		String sumWord = "";
		for(int i=0;i<stD.setArray.length;i++)
		{
			sumWord += String.valueOf(stD.setArray[i]);
		}
		return sumWord;
	}
}
