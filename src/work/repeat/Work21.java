package work.repeat;

import java.util.Scanner;

public class Work21 {

	public static void main(String[] args) {
		
		//String�� �ε������� ���� ���ض�.
		//charAt()�� Characeter.getNumbervalue()�� �̿�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		String num = sc.nextLine();
		
		char preNum;
		int x,y,ret,sum=0;
		
		for(x=0;x<num.length();x++)
		{
			preNum = num.charAt(x);
			ret = Character.getNumericValue(preNum);
			sum+=ret;		
		}
		System.out.println(num+"�� ���� "+sum+"�̴�.");
	}
	
}
