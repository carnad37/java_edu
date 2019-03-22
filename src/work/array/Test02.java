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
		
		System.out.print("과목수를 입력해주세요 : ");
		int subjectNum = scan.nextInt();
		String clear = scan.nextLine(); //scan 메모리버퍼 삭제용
				
		t2.setNameArray(scan);
		t2.setSumArray(subjectNum, scan);
		t2.sortNameAndSum();
		t2.setAvgArray(subjectNum);
		t2.setHakArray();
		t2.pritnResult();
		
		scan.close();
	}	
	//과목수
	
	//과목 점수 입력
	
	//총합 배열, 이름 배열(인덱스가 같다)
	
	//삽입하면서 정렬
	
	//학점 배열 생성
	
	//순위는 인덱스
	
	//System.out.println("이름\t총점\t평균\t학점\t순위");
	
	public void setNameArray(Scanner scan)
	{
		for(int i=0;i<name.length;i++)
		{
			System.out.println("이름을 입력해주세요");
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
				System.out.println(name[i]+"의 "+(j+1)+"번째 과목 점수를 입력해주세요.");
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
		System.out.println("이름\t총점\t평균\t학점\t순위");
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
