package ex190124;

public class Test01 {

	public static void main(String[] args) {

		String name1 = new String("�ſ��");
		String name2 = new String("�ſ��");
		
		//���ڿ� ��
		
		if(name1.equals(name2))
		{
			System.out.println("�� ���ڿ��� ����.");
		}
		else
		{
			System.out.println("�� ���ڿ��� �ٸ���.");
		}
		
		//��ü ��
		
		if(name1 == name2)
		{
			System.out.println("�� ��ü�� ����.");
		}
		else
		{
			System.out.println("�� ��ü�� �ٸ���.");
		}
		
	}

}
