package work.array;
import ex190122.Uppernum;
import java.util.Scanner;

public class Work7 {
	
	public static void main(String[] args) {
		
		Work7 w7 = new Work7();
		
		//6명의 몸무게 입력.
		//평균출력. 반올림.
		
		Scanner sc = new Scanner(System.in);
		double[] num = new double[6];
		for(int i=0;i<6;i++)
		{
			System.out.print("숫자를 입력해주세요: ");
			double inputNum = sc.nextDouble();
			num[i]=inputNum;
		}
		w7.printWeight(num);


	
	}
	public void printWeight(double[] num)
	{
		Uppernum up = new Uppernum();
		double sum = 0;
		for(int i=0;i<num.length;i++)
		{
			sum+=num[i];
		}
		double avg= sum/num.length;
		avg = up.upControl(avg,1);
		System.out.println(avg);

	}
}
