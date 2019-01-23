package ex190123;
import java.util.Scanner;
public class Test08 {

	public static void main(String[] args)
	{
		
		//숫자입력.
		//홀수면 종료.
		//짝수면 다시 반복
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do
		{
			System.out.print("숫자를 입력하세요: ");
			num = sc.nextInt();
		}
		while(num%2==0);
		System.out.println("종료");
	}
	
}
