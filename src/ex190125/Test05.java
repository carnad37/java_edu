package ex190125;

import java.util.Scanner;

public class Test05 {
	
	public static void main(String[] args) {
		
		//10���� ������ �Է�.
		//���� ���� ���� ���.
		//�迭�� �Է�. 
		//�Է�->�����Է°� ��->min���� �Է�...?
		Scanner sc = new Scanner(System.in);
		int i = 0, min = 0;
		int iArr[] = new int[10];
		
		for(i=0;i<iArr.length;i++)
		{
			//���ڸ� �Է��Ѵ�.
			System.out.println((i+1)+"��° ������ �Է����ּ���: ");
			iArr[i] = sc.nextInt();
			//ù��°�� ����
			if(i==0)
			{	
				min = iArr[i];
			}
			else if(iArr[(i-1)]>iArr[i])
			{
				min = iArr[i];
			}
			
		}
		System.out.println("min : "+min);
		
	}

}
