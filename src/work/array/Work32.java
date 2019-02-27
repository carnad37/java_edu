package work.array;

import java.util.Scanner;

public class Work32 {
	
	public static void main(String[] args) {
		
		//정렬 기준은 수학점수가 높은 순으로 정렬하되, 수학점수가 같으면 정보점수가 높은 순, 정보점수도 같으면 번호가 빠른 순서로 정렬하려고 한다.
		//-입력
		//첫째 줄에 학생수 n(번호:1~n)가 입력된다. (1 <= n <= 1,000)
		//둘째 줄부터 각 줄에 수학점수, 정보점수가 입력된다. (번호는 1번 부터 ~ n번 차례대로 데이터가 입력됨)

		//n과 n+1을 비교.
		//n이 더클시 n+1과 교대.
		//수학 기본, else if(수학점수=수학점수)일때만 정보점수를 비교.
		//순서를 바꿔주는 메소드 짠다.
		
		//입력하는 메소드. 총 2개의 array에 각각 담아준다.
		Work32 w32 = new Work32();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수를 입력해주세요 : ");
		int studentNumber = scan.nextInt();
		int[] math = new int[studentNumber];
		int[] info = new int[studentNumber];
		String setData=scan.nextLine();
		for(int i=0;i<studentNumber;i++)
		{
			System.out.print("점수를 입력해주세요(수학점수 정보점수) : ");
			setData = scan.nextLine();
			w32.setArrayData(setData, math,info, i);
		}
		for(int i=0;i<studentNumber-1;i++)
		{
			w32.arrayToScoreRating(math, info,i);

		}
		w32.printScoreArray(math, info);

		
		
	}
	
	public void setArrayData(String inputData, int[] math,int[] info,int i)
	{
		int spacePosition = inputData.indexOf(" ");
		String check=null,mathScore="",infoScore="";
		for(int j=0;j<inputData.length();j++)
		{
			if(j<spacePosition)
			{
				check = String.valueOf(inputData.charAt(j));
				mathScore += check;
			}
			if(j>spacePosition)
			{
				check = String.valueOf(inputData.charAt(j));
				infoScore += check;
			}
		}
		math[i]=Integer.parseInt(mathScore);
		info[i]=Integer.parseInt(infoScore);
		
	}
	
	public void arrayToScoreRating(int[] math,int[] info,int k)
	{
		//비교하고 바꿔주는 메소드 호출
		for(int i=0;i<math.length-1-k;i++)
		{
			if(math[i]==math[i+1])
			{
				if(info[i]<info[i+1])
				{
					setChangeIndex(math,i);
					setChangeIndex(info,i);
				}
			}
			else if(math[i]<math[i+1])
			{
				setChangeIndex(math,i);
				setChangeIndex(info,i);
			}
		}		
	}
	
	public void printScoreArray(int[] math,int[] info)
	{
		for(int i=0;i<math.length;i++)
		{
			System.out.println(math[i]+" "+info[i]);
		}
	}

	
	
	public static void setChangeIndex(int[] array, int index)
	{
		System.out.println(index+"에서 교차발생");
		int value = array[index+1];
		array[index+1] = array[index];
		array[index] = value;
	}

}
