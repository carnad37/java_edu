package ex190125;

public class Test03 {

	public static void main(String[] args) {
		
		int[]arryInt = {1,2,3,4,5,6,7};
		//0���� �ε�����
		System.out.println(arryInt[0]);
		//5��° �ε�����
		System.out.println(arryInt[5]);
		//3��° �ε�����->10
		arryInt[3]=10;
		//6��° �ε��� ��->20
		arryInt[6]=20;
		//�迭�� 0~5��° �ε��� ������ ���
		int i = 0;
		for(i=0;i<6;i++)
		{
			System.out.println("arryInt["+i+"]="+arryInt[i]);
		}
		//�迭�� 0,2,4,6�ε����� ������ ����Ͻÿ�
		System.out.println("");
		for(i=0;i<arryInt.length;i+=2)
		{
			System.out.println("arryInt["+i+"]="+arryInt[i]);
		}
		//�迭�� 0,3,6�ε����� ������ ����Ͻÿ�
		System.out.println("");
		for(i=0;i<arryInt.length;i+=3)
		{
			System.out.println("arryInt["+i+"]="+arryInt[i]);
		}
		//�迭�� 5->3���� �ε��������� ����Ͻÿ�
		System.out.println("");
		for(i=5;i>=3;i--)
		{
			System.out.println("arryInt["+i+"]="+arryInt[i]);
		}
		//�迭�� 6->4������ �ε��� �� ���
		System.out.println("");
		for(i=6;i>=4;i--)
		{
			System.out.println("arryInt["+i+"]="+arryInt[i]);
		}
		//�Ųٷ� ó������ ������ ���
		System.out.println("");
		for(i=(arryInt.length-1);i>=0;i--)
		{
			System.out.println("arryInt["+i+"]="+arryInt[i]);
		}
		
	}
	
}
