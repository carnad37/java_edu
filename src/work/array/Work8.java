package work.array;

import java.util.Scanner;

public class Work8 {

	public static void main(String[] args) {
		
		//���ڸ� �Է¹޾� ��ġ ��ġ.
		Work8 w8 = new Work8();
		Scanner scan  = new Scanner(System.in);
		
		String[] str = {"J","U","N","G","O","L"};
		System.out.print("���ڸ� �Է����ּ���: ");
		String inputWord = scan.nextLine();
		w8.getIndex(inputWord, str);
	}
	public void getIndex(String str, String[] strArray)
	{
		//�ݺ������� ����.
		//�������θ� �Ұ����� �Է�. ������ ���������� none���
		boolean strCheck = true;
		for(int i=0;i<strArray.length;i++)
		{
			if(strArray[i].equals(str))
			{
				System.out.println("index:"+i);
				strCheck = false;
				break;
			}
			
		}
		if(strCheck)
		{
			System.out.println("none");
		}
	}
}