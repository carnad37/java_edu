package ex190125;

public class Test01 {

	public static void main(String[] args)
	{
		
		//10���� ������ �����Ҽ��մ� �迭.
		//1~10���� ����. �׸��� ���.
		int[]intArray = new int[10];
		//����
		int i =0;
		for(i=0;i<intArray.length;i++)
		{
			intArray[i]=(i+1);
		}
		//���
		for(i=0;i<intArray.length;i++)
		{
			System.out.println("intArray["+i+"] = "+intArray[i]);
		}
		
		
		
	}	
}
