package ex190124;

public class Test07 {

	public static void main(String[] args) {
		
		int[] aList = {1,2,3,4,5,6};
		int i = 0, val = 0;
		//1,3,5 �� ���
		//Ȧ����
		for(i=0;i<6;i++)
		{
			val = i+1;
			//������val�� ���� i+1�̴�.
			if(val%2==1)
			{
				System.out.print(val+"\t");
			}
					
		}
		
		System.out.println("");
		
		//2,4,6 �� ���
		//n*2
//		for(i=0;i<6;i++)
//		{
//			val = i+1;
//			//������val�� ���� i+1�̴�.
//			if(val%2==0)
//			{
//				System.out.print(val+"\t");
//			}
//		}
//		
		System.out.println("");
		
		//3,6 �� ���
		//3�ǹ���Ͻø� ���
		for(i=0;i<6;i++)
		{
			val = i+1;
			if(val%3==0)
			{
				System.out.print(val+"\t");
			}
		}

		
//		//2,4 �� ���
//		//2�� ����?
//		for(i=0;i<5;i++)
//		{
//			
//		}

	}
	
}
