package ex190115;

import java.util.Scanner;

public class Test10{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		String numType = "zero";
		
		int inputNum = 0;
		System.out.print("������ �Է����ּ���: ");
		inputNum = sc.nextInt();
		
		//if(inputNum>0) {
		//	System.out.println("plus");
		//}
		//if(inputNum==0) {
		//	System.out.println("zero");
		//}
		//if(inputNum<0) {
		//	System.out.println("minus");
		//}
		//1.0���� Ȯ��
		//2.�������� Ȯ��
		//3.������� Ȯ��
		
		if(inputNum>0)
		{
			numType = "plus";
		}
		if(inputNum<0)
		{
			numType = "minus";
		}
		System.out.println(numType);
		
	}
	
}
