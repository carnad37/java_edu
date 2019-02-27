package work.algorithm_Array;

public class Test01 {

	public static void main(String[] args) {
		
		//배열 10개를 선언하고 1부터 3의 배수를 배열에 저장하고 출력하세요.
		//배열 5개를 선언하고 1부터 10까지의 총합의 값을 0번째 인덱스 11-20의 값을 1번째 인덱스에 저장해서 10단위의 총합을 50까지 배열에 저장하세요.

		int[] mul3 = new int[10];
		int result = 1;
		mul3[0] = 1;
		for(int i=1;i<10;i++)
		{
			mul3[i] = i*3;
		}
		printArray(mul3);
		int[] tenArray = new int[5];
		result = 0;
		for(int i=0;i<5;i++)
		{
			result = 0;
			for(int j=1;j<=10;j++)
			{
				result+=(i*10)+j;
			}
			tenArray[i]=result;
		}
		printArray(tenArray);
		
		
	}

	
	public static void printArray(int[] numArray)
	{
		for(int i=0;i<numArray.length;i++)
		{
			System.out.println(numArray[i]);
		}
	}
}
