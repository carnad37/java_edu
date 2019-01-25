package ex190125;

public class Test01 {

	public static void main(String[] args)
	{
		
		//10개의 정수를 저장할수잇는 배열.
		//1~10까지 저장. 그리고 출력.
		int[]intArray = new int[10];
		//저장
		int i =0;
		for(i=0;i<intArray.length;i++)
		{
			intArray[i]=(i+1);
		}
		//출력
		for(i=0;i<intArray.length;i++)
		{
			System.out.println("intArray["+i+"] = "+intArray[i]);
		}
		
		
		
	}	
}
