package work.array;

import java.util.Scanner;

public class Work29 {
	
	public static void main(String[] args) {
		
		Work29 w29 = new Work29();
		
		//������ �����ȿ� ���ڸ� �����ϴ� ������ ������ ���� ���ϴ� ���α׷��� �ۼ��϶�.
		//2�� �Է¹޴´�.
		//���� ���ڵ��� �Ž��� �ö󰡸鼭 �Է¹��� ���ڸ� �����Ͽ� 0���� 9������ int �迭�� ��ġ�� �°� ����ִ´�.
		//���ش� charAt�� �����ϰ� 10�� ����� �����鼭 �ص� ����.
		//�ٸ� ������ �ݺ��̹Ƿ� 10�� ����� �̿��ϴ°� ����.(�ȱ׷��� int->String->int�� �ݺ��������)
		int[] countNumber = new int[10];
		int num01 = w29.inputNumber();
		int num02 = w29.inputNumber();
		int max=0,min=0;
		if(num01>num02)
		{
			max=num01;
			min=num02;
		}
		else
		{
			min=num01;
			max=num02;
		}
		for(int i=min;i<=max;i++)
		{
			w29.setcountNumberArray(countNumber,i);
		}
		w29.printArray(countNumber);
		
		
	}
	public int inputNumber()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		int inputNum = scan.nextInt();
		return inputNum;
		
	}

	
	
	
	//x�� 10�� ������ ������ 10���ϰ� �Ǵ��� Ȯ���ϴ� �޼ҵ�
	public int returnMul10(int num)
	{
		int mul10 = 1,result = 0;
		while(true)
		{
			result = num/mul10;
			if(result<10)
			{
				break;
			}
			mul10 *= 10;
		}
		return mul10;
	}
	//
	
	public void setcountNumberArray(int[] countNumber, int target)
	{
		Work29 w29 = new Work29();
		int mul10 = w29.returnMul10(target);
		int result = 0;
		for(int i=mul10;i>0;i/=10)
		{
			result=target/i;
			countNumber[result]++;
			target=target%i;
		}
//		while(true)
//		{
//			result=target/mul10;
//			if(result<1)
//			{
//				break;
//			}
//			countNumber[result]=result;
//			target=target%mul10;
//			mul10/=10;
//		}
	}
	
	public void printArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println(i +" : "+array[i]+"��");
		}
	}

}
