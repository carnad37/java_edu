package work.array;

import java.util.Scanner;

public class Work39 {
	
	boolean firstCheck = false;
	int rotationNumber = 0;
	int postCheck = 0;
	String[] resArray;
	String[] copyArray;
	int resArrayCount = 0;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//첫번째값은 몇칸을 미룰지 정해준다.
		//그다음값들은 입력
		
		System.out.print("값을 입력해주세요(회전수 data1 data2...dataX) : ");
		String rotation = scan.nextLine();
		scan.close();
		char[] roArray = new char[rotation.length()];
		int count = 0;
		for(int i=0;i<roArray.length;i++)
		{
			roArray[i]=rotation.charAt(i);
			if(rotation.charAt(i)==' ')
			{
				count++;
			}
		}
		Work39 w39 = new Work39();
		w39.setRotation(roArray, count);
		for(int i=0;i<w39.resArray.length;i++)
		{
			System.out.print(w39.resArray[i]+" ");
		}
		System.out.println("");

		//resArray에 담겨있다.
		w39.pushArray();
		for(int i=0;i<w39.copyArray.length;i++)
		{
			System.out.print(w39.copyArray[i]+" ");
		}
		
		
		
	}
	public void setRotation(char[] charArray, int count)
	{
		//먼저 첫번째 자리 뽑아내기
		//스페이스로 구분한다.
		this.resArray = new String[count];
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i]==' ')
			{
				int spaceCheck = i;
				spaceSequence(charArray,spaceCheck);				
			}
			else if(i==charArray.length-1)
			{
				int spaceCheck = i+1;
				spaceSequence(charArray,spaceCheck);
			}
		}
		//Stirng[]에 다 담아줌.
	}
	
	public void spaceSequence(char[] charArray, int space)
	{
		String sumWord = "";
		for(int i=this.postCheck;i<space;i++)
		{
			String word = String.valueOf(charArray[i]);
			sumWord += word;
		}
		if(this.firstCheck==false)
		{
			this.rotationNumber = Integer.parseInt(sumWord);
			firstCheck = true;
		}
		else
		{
			this.resArray[resArrayCount] = sumWord;
			this.resArrayCount++;
		}
		this.postCheck = space+1;
	}
	
	public void pushArray()
	{
		copyArray = new String[resArray.length];
		for(int i=0;i<resArray.length;i++)
		{
			int inputNumber = i+this.rotationNumber;
			if(inputNumber>=resArray.length)
			{
				inputNumber = inputNumber-resArray.length;
			}
			else if(inputNumber<0)
			{
				inputNumber = resArray.length+inputNumber;
			}
			copyArray[inputNumber]=resArray[i];
		}
	}
}
