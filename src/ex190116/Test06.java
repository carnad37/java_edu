package ex190116;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է����ּ���: ");
		int age = sc.nextInt();
		String ageType = null;
		
		if(age>60)
		{
			ageType = "����";			
		}
		else if(age>30)
		{
			ageType = "�����";
		}
		else if(age>18)
		{
			ageType = "������";
		}
		else if(age>7)
		{
			if(age>16)
			{
				ageType="����л�";
			}
			else if(age>13)
			{
				ageType="���л�";
			}
			else
			{
				ageType = "�ʵ��л�";
			}
		}
		else
		{
			ageType = "���";
		}
		System.out.println(ageType);
	}
	
}