package work.algorithm_Array;

public class Test01 {

	public static void main(String[] args) {
		
		//�迭 10���� �����ϰ� 1���� 3�� ����� �迭�� �����ϰ� ����ϼ���.
		//�迭 5���� �����ϰ� 1���� 10������ ������ ���� 0��° �ε��� 11-20�� ���� 1��° �ε����� �����ؼ� 10������ ������ 50���� �迭�� �����ϼ���.

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
