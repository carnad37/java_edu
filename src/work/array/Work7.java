package work.array;
import ex190122.Uppernum;
import java.util.Scanner;

public class Work7 {
	
	public static void main(String[] args) {
		
		Work7 w7 = new Work7();
		
		//6���� ������ �Է�.
		//������. �ݿø�.
		
		Scanner sc = new Scanner(System.in);
		double[] num = new double[6];
		for(int i=0;i<6;i++)
		{
			System.out.print("���ڸ� �Է����ּ���: ");
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
