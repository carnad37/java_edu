package ex190207.Ex02;

class B extends A{
	
	public B()
	{
		System.out.println("������B");		
	}
	public B(int x)
	{
		super(x);
		//A�� �����ڸ� ȣ��. �ڽ�Ŭ������ ��ӹ����� �����ڴ� ����?
		System.out.println("�Ű����� ������ B"+x);
	}

}
