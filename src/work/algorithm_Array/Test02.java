package work.algorithm_Array;

public class Test02 {

	public static void main(String[] args) {
		
		//for��, System.arraycopy �� �̿� arraySrc�� ������ arrayDst�� �����Ͻÿ�
		
		int[] arraySrc = {10,20,30,40,50};
		int[] arrayDst = null;
//		for(int i=0;i<arraySrc.length;i++)
//		{
//			
//		}
//		
		System.arraycopy(arraySrc, 0, arrayDst, 0, arraySrc.length);
		
		printArray(arrayDst);
		
	}
	public static void printArray(int[] numArray)
	{
		for(int i=0;i<numArray.length;i++)
		{
			System.out.println(numArray[i]);
		}
	}
}
