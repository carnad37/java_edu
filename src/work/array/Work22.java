package work.array;

public class Work22 {
	
	public static void main(String[] args) {
		
		Work22 w22 = new Work22();
		int num1=1,num2=2,result,count=0;
		//È¦,Â¦,È¦,È¦,Â¦,È¦,È¦,Â¦-Â¦¼ö¿­ÀÏ °æ¿ì´Â 2,5,8(2+3n)///n=(n-1)(n-2)
		while(true)
		{
			result=num1+num2;
			//¹ö·ÁÁö´Â°Ç num1
			if(result>400)
			{
				break;
			}
			num1=num2;
			num2=result;
			count++;
		}		
		w22.printSumEvenNumber(count);
		
		
	}
	public void printSumEvenNumber(int count)
	{
		int[] numArray = new int[count];
		int num1=1,num2=2,result,countDown=1;
		numArray[0]=1;
		while(true)
		{
			result=num1+num2;
			//¹ö·ÁÁö´Â°Ç num1
			if(countDown==11)
			{
				break;
			}
			numArray[countDown]=num2;
			num1=num2;
			num2=result;
			countDown++;
		}
		countDown = 0;
		int sum = 0;
		for(int i=1;i<numArray.length;i=countDown*3+1)
		{
			System.out.println(numArray[i]);
			sum += numArray[i];
			countDown++;
		}
		System.out.println(sum);
	
	}

}
