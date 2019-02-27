package work.algorithm_Array;

import java.util.Random;

class PhysicalExamination
{
	int height;
	double sight;
	
	Random random = new Random();
	PhysicalExamination()
	{
		this.height = 140+ random.nextInt(30);
		this.sight = ((double)(random.nextInt(30)-10)/10);
	}

}


public class Main
{

	public static void main(String[] args) {
		
		PhysicalExamination[] ph = new PhysicalExamination[10];
		for(int i=0;i<10;i++)
		{
			setArrayData(ph,i);
		}
		
		printArray(ph);
		
	}
	public static void setArrayData(PhysicalExamination[] ph, int num)
	{
		PhysicalExamination phData = new PhysicalExamination();
		ph[num]=phData;
	}

	public static void printArray(PhysicalExamination[] ph)
	{
		for(int i=0;i<ph.length;i++)
		{
			System.out.println(ph[i].height);
			System.out.println(ph[i].sight);
		}
	}
}


