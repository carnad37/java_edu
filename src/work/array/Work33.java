package work.array;

import java.util.Scanner;

public class Work33 {
	
	public static void main(String[] args) {
		
		//1부터 10까지 자연수를 각각 제곱해 더하면 다음과 같습니다 (제곱의 합).
		//1^2 + 2^2 + ... + 10^2 = 385 1부터 10을 먼저 더한 다음에
		//그 결과를 제곱하면 다음과 같습니다 (합의 제곱).
		//(1 + 2 + ... + 10)^2 = 55^2 = 3025
		//따라서 1부터 10까지 자연수에 대해 "합의 제곱"과 "제곱의 합" 의 차이는
		//3025 - 385 = 2640 이 됩니다.
		//그러면 1부터 100까지 자연수에 대해 "합의 제곱"과 "제곱의 합"의 차이는 얼마입니까?

		Scanner scan = new Scanner(System.in);
		System.out.print("자연수를 입력해주세요 : ");
		int inputNum = scan.nextInt();
		int[] squreArray = new int[inputNum];

		//합은 걍 더하자.
		//제곱은 배열에 박고, 각각의 배열값들을 제곱해준다.
		Work33 w33 = new Work33();
		int sumSq = squareNubmer(w33.sumNum(inputNum));
		System.out.println(w33.sumNum(inputNum));
		int sumNumSq=0;
		for(int i=0;i<inputNum;i++)
		{
			squreArray[i]=squareNubmer(i+1);
			sumNumSq+=squreArray[i];
		}
		int result =sumSq-sumNumSq;
		System.out.println(result);
		
	}
	
	public int sumNum(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		return sum;
	}
	

	public static int squareNubmer(int num)
	{
		int res = num*num;
		return res;
	}
}
