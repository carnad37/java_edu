package ex190123;

public class Ex05 {

	public static void main(String[] args) {
		/*
		5.����Ÿ��
		�ڹٴ� ũ�� �⺻Ÿ��(primitive type)�� ����Ÿ��(reference type)���� ������
		�⺻�� int, double ���
		����Ÿ���� String�� �ִ�.(�⺻Ÿ���� ������ ������ ����)
		
		�⺻Ÿ���� ������ �������� �����ȿ� ����.
		����Ÿ���� ������ �������̾ƴ� ���� ����� �ּҸ� ����.
		
		==�� !=�� ���ϴ� ��쵵 �⺻Ÿ���� �������� ������.
		����Ÿ���� ���� ��ü�� �����ϴ��� ����.
		
		null�� ��ü�� ��������� �ʱⰪ.
		
		new�� ���� ���̴� ���̶� ���� ������ ������ �������ش�.
		�� ���� new�� ����� ����Ÿ�Ե��� ���� ���ڿ��̶� �ٸ� ������ ������.
		
		�ڼ��� ������ �Ŀ�����Ʈ.
		
		*/
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		if(strVar1==strVar2)
		{
			System.out.println("strVar1�� strVar2�� ������ ����.");
		}
		else
		{
			System.out.println("strVar1�� strVar2�� ������ �ٸ�.");
		}
		
		if(strVar1.equals(strVar2))
		{
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����.");
		}
		
		String strVar3 = new String("�Ź�ö");
		String strVar4 = new String("�Ź�ö");
		
		if(strVar3 == strVar4)
		{
			System.out.println("strVar3�� strVar4�� ������ ����.");
		}
		else
		{
			System.out.println("strVar3�� strVar4�� ������ �ٸ�.");
		}
		
		if(strVar3.equals(strVar4))
		{
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����.");
		}
	}
	
}
