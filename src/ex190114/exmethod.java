package ex190114;

public class exmethod {

	public static void main(String[] args) {
		
		//main �޼ҵ� �м�.
		//public�� �⺻������ ����. static�� ������ ���� �������� �ִ�.
		//void�� �޼ҵ� �������� �������� �ʰڴ�. �̿ܿ� ���ϵǴ� Ÿ��(double, int, String ���)�� ����. main�� �޼ҵ��.
		//String[] args�� ����..? �Ű������� ,�� �����ϸ� �������� �� �� �ִ�.
		
		//����Ÿ�� �޼ҵ��(�Ű�����)
		//{
		//	����;
		//	return ����;
		//}
		
		int a = 1, b = 3;
		int sum = a+b;
		String str= Integer.toHexString(sum);
		System.out.println("main()="+sum);
		System.out.println("main()="+str);
		//�޼ҵ� ȣ��
		//int ret= add(a,b);
		//System.out.println(ret);
		//�޼ҵ� ȣ�� ���
		//1. �޼ҵ��(ex: add)
		//2. �Ű� ������ Ÿ�԰� ����(ex: a, b)
		//3. ���ϰ��� ����, �翬�� Ÿ���� ���ƾ���.(ex: int ret=)
		
		//���ϰ��� ���°��.
		printText(sum);
		//�Ű������� ���� ���. ���ϰ��� �����.
		int ret = staticPrintmsg();
		
		
	}
	//�޼ҵ� ������
	public static int add(int x, int y)
	{
		
		int sum = x+y;
		return sum;
		
	}
	
	//�޼ҵ�� ���������� ��.1
	//Scanner sc = new Scanner(System.in);
	//�� ���� ����� ����.(�Ƹ� ���?)
	
	//return;�� �޼ҵ带 ������ �������� ���.
	
	//�Ű������� ������, ���ϰ��� ���� �޼ҵ�.
	public static void printText(int sum)
	{
		
		System.out.println("printText="+sum);
		
	}
	
	//���ϰ��� �ְ�, �Ű������� ���� �޼ҵ�.
	public static int staticPrintmsg()
	{
		
		System.out.println("---------------------");
		int ret=0;
		return ret;
				
	}
	
	
}
