package work.array;

import java.util.Scanner;

public class Work26 {
	
	public static void main(String[] args)
	{
		
		//ù ��° ���
		//���̵��� ���� �ڸ� ���ڵ��� ���ϱ� ���ؼ� �쿡�� �·� ���ڸ� �ϳ��� ���ʴ�� �� �϶�� �����.
		//1�� �� ���� ��ġ���� ���� �ڸ��� ���ϱ����� �̵��ϴ� "���ڸ��ø�"������ ���� �߰��ϴ� ���� �߿��� ������ �ȴ�.
		//����� ���� �����ڰ� �׵��� ������� ���ϱ� ���Ͽ�, ���� �������� �� ���տ� ���ؼ� ���ڸ��ø� ������� ���� ����ϴ� ���̴�.
		
		Scanner scan = new Scanner(System.in);		
		while(true)
		{
			//�Էµ� ���� 0�̸� break;
			Work26 w26 = new Work26();
			System.out.print("�Է°��� �����ּ���(�Է°��� ����+�����̽�+������ ����) : ");
			String inputData = scan.nextLine();
			char[] charArray = new char[inputData.length()];
			int space = 0;
			for(int i=0;i<charArray.length;i++)
			{
				charArray[i]=inputData.charAt(i);
				if(charArray[i]==' ')
				{
					space = i;
				}
				//���̴� �����̽��� ���еȴ�.
			}
			if(charArray[0]=='0')
			{
				//�ý����� ����Ǵ� ���.
				System.out.println("�ý����� �����մϴ�.");
				break;
			}
			w26.printCalData(charArray, space);
			
		}
		
	}
	public void printCalData(char[] charArray,int space)
	{
		int calNumber = charArray.length-(space+1);
		if(calNumber>space)
		{
			calNumber = space;
		}
		int count=0, result=0, nextUp=0;
		for(int i=1;i<calNumber+1;i++)
		{
			
			result = charArray[space-i]+charArray[charArray.length-i]-96;
			result += nextUp;
			if(result>=10)
			{
				count++;
				nextUp = 1;
				
			}
			else
			{
				nextUp = 0;
			}
			
		}
		if(count>0)
		{
			System.out.println(count+" carry opereation");		
		}
		else
		{
			System.out.println("No carry opereation");		
		}
	}
}
