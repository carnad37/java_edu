package work.array;

import java.util.Scanner;

public class Work37 {

	public static void main(String[] args) {
		
		//10���� ������ �Է¹޾� ������������ ����.
		//�����Ʈ�� ����
		int[] numArray = new int[10];
		Scanner scan = new Scanner(System.in);
		Work37 w37 = new Work37();

		for(int i=0;i<numArray.length;i++)
		{
			System.out.print("���ڸ� �Է����ּ��� : ");
			int inputNum = scan.nextInt();
			numArray[i]=inputNum;
		}
		scan.close();
		w37.selectArray(numArray);
		for(int i=0;i<10;i++)
		{
			System.out.println(numArray[i]);
		}
		
		
	}
	public void selectArray(int[] numArray)
	{

		for(int i=0;i<numArray.length-1;i++)
		{
			for(int j=0;j<numArray.length-1-i;j++)
			{
				if(numArray[j]<numArray[j+1])
				{
					setChangeIndex(numArray,j);
				}

			}
		}
	}
	public void setChangeIndex(int[] array, int index)
	{
		System.out.println(index+"���� �����߻�");
		int value = array[index+1];
		array[index+1] = array[index];
		array[index] = value;
	}
	
}
