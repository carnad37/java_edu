package work.repeat;
import java.util.Scanner;

public class Work01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//행과 열을 입력받아 숫자박스 만들기
		//1234/2468/36912식으로 열*행값이다
		int num01;
		int num02;
		System.out.print("행을 입력하시오: ");
		num02 = sc.nextInt();
		System.out.print("열을 입력하시오: ");
		num01 = sc.nextInt();
		int mul = 0;
		
		for(int i=1;i<num02+1;i++)
		{
			for(int j=1;j<num01+1;j++)
			{
				mul = j*i;
				System.out.print(mul+"\t");
			}
			System.out.println("");
		}
		
	}
	
}
