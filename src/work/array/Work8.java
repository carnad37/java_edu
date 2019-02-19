package work.array;

import java.util.Scanner;

public class Work8 {

	public static void main(String[] args) {
		
		//문자를 입력받아 위치 서치.
		Work8 w8 = new Work8();
		Scanner scan  = new Scanner(System.in);
		
		String[] str = {"J","U","N","G","O","L"};
		System.out.print("문자를 입력해주세요: ");
		String inputWord = scan.nextLine();
		w8.getIndex(inputWord, str);
	}
	public void getIndex(String str, String[] strArray)
	{
		//반복문으로 대조.
		//성공여부를 불값으로 입력. 없을시 마지막으로 none출력
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