package work.array;

import java.util.Scanner;

public class Work32 {
	
	public static void main(String[] args) {
		
		//���� ������ ���������� ���� ������ �����ϵ�, ���������� ������ ���������� ���� ��, ���������� ������ ��ȣ�� ���� ������ �����Ϸ��� �Ѵ�.
		//-�Է�
		//ù° �ٿ� �л��� n(��ȣ:1~n)�� �Էµȴ�. (1 <= n <= 1,000)
		//��° �ٺ��� �� �ٿ� ��������, ���������� �Էµȴ�. (��ȣ�� 1�� ���� ~ n�� ���ʴ�� �����Ͱ� �Էµ�)

		//n�� n+1�� ��.
		//n�� ��Ŭ�� n+1�� ����.
		//���� �⺻, else if(��������=��������)�϶��� ���������� ��.
		//������ �ٲ��ִ� �޼ҵ� §��.
		
		//�Է��ϴ� �޼ҵ�. �� 2���� array�� ���� ����ش�.
		Work32 w32 = new Work32();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�л� ���� �Է����ּ��� : ");
		int studentNumber = scan.nextInt();
		int[] math = new int[studentNumber];
		int[] info = new int[studentNumber];
		String setData=scan.nextLine();
		for(int i=0;i<studentNumber;i++)
		{
			System.out.print("������ �Է����ּ���(�������� ��������) : ");
			setData = scan.nextLine();
			w32.setArrayData(setData, math,info, i);
		}
		for(int i=0;i<studentNumber-1;i++)
		{
			w32.arrayToScoreRating(math, info,i);

		}
		w32.printScoreArray(math, info);

		
		
	}
	
	public void setArrayData(String inputData, int[] math,int[] info,int i)
	{
		int spacePosition = inputData.indexOf(" ");
		String check=null,mathScore="",infoScore="";
		for(int j=0;j<inputData.length();j++)
		{
			if(j<spacePosition)
			{
				check = String.valueOf(inputData.charAt(j));
				mathScore += check;
			}
			if(j>spacePosition)
			{
				check = String.valueOf(inputData.charAt(j));
				infoScore += check;
			}
		}
		math[i]=Integer.parseInt(mathScore);
		info[i]=Integer.parseInt(infoScore);
		
	}
	
	public void arrayToScoreRating(int[] math,int[] info,int k)
	{
		//���ϰ� �ٲ��ִ� �޼ҵ� ȣ��
		for(int i=0;i<math.length-1-k;i++)
		{
			if(math[i]==math[i+1])
			{
				if(info[i]<info[i+1])
				{
					setChangeIndex(math,i);
					setChangeIndex(info,i);
				}
			}
			else if(math[i]<math[i+1])
			{
				setChangeIndex(math,i);
				setChangeIndex(info,i);
			}
		}		
	}
	
	public void printScoreArray(int[] math,int[] info)
	{
		for(int i=0;i<math.length;i++)
		{
			System.out.println(math[i]+" "+info[i]);
		}
	}

	
	
	public static void setChangeIndex(int[] array, int index)
	{
		System.out.println(index+"���� �����߻�");
		int value = array[index+1];
		array[index+1] = array[index];
		array[index] = value;
	}

}
