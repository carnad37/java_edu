package work.array2;

public class Work29 {
	
	public static void main(String[] args) {
		
		
		
	}
	
	
	public int calGenerator(int target)
	{
		String num = String.valueOf(target);
		int length = num.length();
//		char[] targetArray = new char[length];
		int sum = 0;
		for(int i=0;i<length;i++)
		{
			sum += ((int)num.charAt(i) - 48);
		}
		sum+=target;
		return sum;		
	}
	
	//�迭 ũ�⸦ �÷��ִ� �޼ҵ�
	//������ �迭�� �Ű������� �־���
	//�Լ������� ����
	//�⺻ 10ĭ.
	//�þ����

}
