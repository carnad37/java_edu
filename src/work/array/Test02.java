package work.array;

import java.util.Scanner;

public class Test02
{
	int[] sum = new int[5];
	double[] avg = new double[5];
	String[] hak = new String[5];
	String[] name = new String[5];
	
	public static void main(String[] args)
	{

		Test02 t2 = new Test02();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������� �Է����ּ��� : ");
		int subjectNum = scan.nextInt();
		String clear = scan.nextLine(); //scan �޸𸮹��� ������
				
		t2.setNameArray(scan);
		t2.setSumArray(subjectNum, scan);
		t2.sortNameAndSum();
		t2.setAvgArray(subjectNum);
		t2.setHakArray();
		t2.pritnResult();
		
		scan.close();
	}	
	//�����
	
	//���� ���� �Է�
	
	//���� �迭, �̸� �迭(�ε����� ����)
	
	//�����ϸ鼭 ����
	
	//���� �迭 ����
	
	//������ �ε���
	
	//System.out.println("�̸�\t����\t���\t����\t����");
	
	public void setNameArray(Scanner scan)
	{
		for(int i=0;i<name.length;i++)
		{
			System.out.println("�̸��� �Է����ּ���");
			System.out.print(" > ");
			String inputName = scan.nextLine();
			name[i] = inputName;
		}
	}
	
	public void setSumArray(int sNum, Scanner scan)
	{
		for(int i=0;i<sum.length;i++)
		{
			int studentScore=0;
			for(int j=0;j<sNum;j++)
			{
				System.out.println(name[i]+"�� "+(j+1)+"��° ���� ������ �Է����ּ���.");
				System.out.print(" > ");
				int score = scan.nextInt();
				studentScore += score;
			}
			sum[i] = studentScore;
		}
	}
	
	public void sortNameAndSum()
	{
		int nameLength = name.length;
		for(int i=0;i<nameLength-1;i++)
		{
			for(int j=i+1;j<nameLength;j++)
			{
				if(sum[i]<sum[j])
				{
					int preSum = sum[i];
					sum[i] = sum[j];
					sum[j] = preSum;
					String preName = name[i];
					name[i] = name[j];
					name[j] = preName;
				}
			}
		}
	}
	
	public void setAvgArray(int sNum)
	{
		for(int i=0; i<sum.length; i++)
		{
			avg[i] = (double)sum[i]/sNum;
		}		
	}
	
	public void setHakArray()
	{
		for (int i=0;i<sum.length;i++)
		{
			if(avg[i] >= 90)
			{
				hak[i] = "A";
			}
			else if(avg[i] >= 80)
			{
				hak[i] = "B";
			}
			else if(avg[i] >= 70)
			{
				hak[i] = "C";
			}
			else {
				hak[i] = "F";
			}
		}
	}
	
	public void pritnResult()
	{
//		int[] sum = new int[5];
//		double[] avg = new double[5];
//		String[] hak = new String[5];
//		String[] name = new String[5];
		System.out.println("======================================");
		System.out.println("�̸�\t����\t���\t����\t����");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(hak[i]+"\t");
			System.out.print(i+1+"\n");
		}
		System.out.println("======================================");
	}
}
